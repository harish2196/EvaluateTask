package com.chainsys.pricing;

import java.util.Scanner;

import com.chainsys.pojo.Validation;

public class Pricing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Validation v1=new Validation();	
		Store3 store1=new Store3();
		Store2 store=new Store2();
		System.out.println("Welcome to our store!");
		System.out.println("What product would you like to get?");
		System.out.println("1. Laptop");
		System.out.println("2. Clothes");
	//System.out.println("3. Mobiles");
		System.out.println("0 - to exit");
		while(true) { 
			System.out.println("Enter your choice(1, 2 or 0):");
			int choice = scanner.nextInt();
			if(!v1.Numerics(choice)) {
				System.out.println("Negative Number!");
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
				System.out.println("Exiting...");
				continue;
			default:
				System.out.println("Invalid choice!");	
				continue;
			}
		}
	}
}
