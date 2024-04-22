package com.chainsys.pricing;

import java.util.Scanner;

import com.chainsys.pojo.Validation;

public class PricingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PricingApp app = new PricingApp();
        Validation validator = new Validation();

        Product product1 = readProduct(sc, validator);
        System.out.println(product1);

        Product product2 = readProduct(sc, validator);
        System.out.println(product2);

        sc.close(); 
    }

    public static Product readProduct(Scanner sc, Validation validator) {
        System.out.println("Enter product id:");
        int id = sc.nextInt();
        sc.nextLine();
        while (!validator.Numerics(id)) {
            System.out.println("Invalid Id No. Please enter again:");
            System.out.println("Enter product id:");
            id = sc.nextInt();
            sc.nextLine(); 
        }
        
        System.out.println("Enter product name:");
        String name = sc.nextLine();
        while (!validator.validateString(name)) {
            System.out.println("Invalid product name. Please enter again:");
            name = sc.nextLine();
        }

        System.out.println("Enter product description:");
        String description = sc.nextLine();
        while (!validator.validateString(description)) {
            System.out.println("Invalid description name. Please enter again:");
            description = sc.nextLine();
        }
        
        System.out.println("Enter product price:");
        int price = sc.nextInt();
        while (!validator.Numerics(price)) {
            System.out.println("Invalid price. Please enter again:");
            price = sc.nextInt();
        }

        return new Product(id, name, description, price);
    }
}
