package com.chainsys.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
 ArrayList<Product> productList= new ArrayList<>();;

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product added successfully!");
    }

    public void viewProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public Product getProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        System.out.println("Welcome to Product Manager");
        System.out.println("1. Add Product");
        System.out.println("2. View Products");
        System.out.println("3. Retrieve Product by ID");
        System.out.println("4. Exit");

        int choice;
        do {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter Product ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Product Name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Product Model:");
                    String model = scanner.nextLine();
                    System.out.println("Enter Product Price:");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); 
                    Product newProduct = new Product(id, name, model, price);
                    productManager.addProduct(newProduct);
                    break;
                case 2:
                    System.out.println("Products:");
                    productManager.viewProducts();
                    break;
                case 3:
                    System.out.println("Enter the ID of the product:");
                    int searchId = scanner.nextInt();
                    Product product = productManager.getProductById(searchId);
                    if (product != null) {
                        System.out.println("Product found:");
                        System.out.println(product);
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    continue;
                  
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
        } while (choice != 4);

        scanner.close();
    }
}