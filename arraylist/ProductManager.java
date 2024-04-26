package com.chainsys.arraylist;
import com.chainsys.pojo.Validation;
import com.chainsys.pricing.*;
import java.util.ArrayList;
import java.util.Scanner;
import com.chainsys.pricing.*;
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
        Validation v1=new Validation();	
        ProductManager productManager = new ProductManager();
        String name,pass;
		String passWord = "";
		String userName = "";
		System.out.println("Do you have any Account in our Store: \n(Yes or No)");
		String choose=scanner.nextLine().toLowerCase();
		while(!choose.equals("yes") && !choose.equals("no")) {
			System.err.println("Please Re-enter Valid Input:");
			choose=scanner.nextLine().toLowerCase();
		}
		if(choose.equals("no")) {
			System.out.println("Please Sign Up");			
			while (true) {
				System.out.println("Enter UserName:");
				userName = scanner.nextLine();
				if (!v1.validateString(userName)) {
					System.err.println("Invalid Username Name!");
				} else {
					break; 
				}
			}	
			while (true) {
				System.out.println("Enter PassWord:");
				passWord= scanner.nextLine();
				if (!v1.isSpecialChar(passWord)) {
					System.err.println("Invalid PassWord Name!");
				} else {
					break; 
				}
			}
			System.out.println("Signed Successfully!");
			System.out.println("Please Log In!");
			System.out.println("Enter The Name: ");
			name=scanner.next();
			while(!name.matches(userName)) {
				System.err.println("Please Enter Valid UserName:");
				name=scanner.next();
			}
			System.out.println("Enter The Password: ");
			pass=scanner.next();
			while(!pass.matches(passWord)) {
				System.err.println("Please Enter Valid PassWord:");
				pass=scanner.next();
			}
		} else if (choose.equals("yes")){
			System.out.println("Please Log In!");
			while (true) {
				System.out.println("Enter UserName:");
				name = scanner.nextLine();
				if (!v1.validateString(name)) {
					System.err.println("Invalid Username Name!");
				} else {
					break; 
				}
			}
			while (true) {
				System.out.println("Enter PassWord:");
				pass= scanner.nextLine();
				if (!v1.isSpecialChar(pass)) {
					System.err.println("Invalid PassWord Name!");
				} else {
					break; 
				}
			}

		}
		System.out.println("Logg In Succesfully!");
		System.out.println("Welcome to our store!");
		System.out.println("What product would you like to get?");
		
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
                    name = scanner.nextLine();
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