package com.chainsys.pricing;

import java.util.Scanner;

import com.chainsys.pojo.Validation;

public class Pricing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Validation v1=new Validation();	
		Store3 store1=new Store3();
		Store2 store=new Store2();
		String name,pass;
		String passWord = null;
		String userName = null;
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
		System.out.println("1. Laptop");
		System.out.println("2. Clothes");
		System.out.println("3. Mobiles");
		System.out.println("0 - to exit");
		while(true) { 
			System.out.println("Enter your choice(1, 2 or 0):");
			int choice = scanner.nextInt();
			if(!v1.Numerics(choice)) {
				System.err.println("Negative Number!");
				System.out.println("Enter your choice:");
				choice = scanner.nextInt();
			}
			switch (choice) {
			case 1:
				Store1.getLap();
				break;
			case 2: 
				store.getCloth();
				break;
			case 3:
				store1.getMobile();
				break;
			case 0:
				System.err.println("Exiting...");
				continue;
			default:
				System.err.println("Invalid choice!");	
				continue;
			}
		}
	}
}
