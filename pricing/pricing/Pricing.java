package com.chainsys.pricing;

import java.util.Scanner;

import com.chainsys.pojo.Validation;

public class Pricing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Validation v1=new Validation();	
		
		//TotalPriceCalculator(double n1,double n2,double n3);
		System.out.println("Welcome to our store!");
		System.out.println("What product would you like to get?");
		System.out.println("1. Laptop");
		System.out.println("2. Clothes");
		System.out.println("0 - to exit");
		while(true) {
			System.out.println("Enter your choice:");
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
				Store2.getCloth();
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

class Store1 {
	public static void getLap() {
		Scanner scanner = new Scanner(System.in);
		Validation v1=new Validation();	
		while(true) {
			System.out.println("Enter no: 1 for Dell");
			System.out.println("Enter no: 2 for Lenovo");
			System.out.println("Enter no: 3 for Hp");
			System.out.println("Enter no: 0 to exit");
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			if(!v1.Numerics(choice)) {
				System.out.println("Negative Number!");
				System.out.println("Enter your choice:");
				choice = scanner.nextInt();
			}

			switch (choice) {
			case 1:
				getLaptop1();
				break;
			case 2:
				getLaptop2();
				break;
			case 3:
				getLaptop3();
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
	public static void getLaptop1() {
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();  
		TotalPrice tp = new TotalPrice();
		String name,model,processor;
		int ram,storage;

		while (true) {
			System.out.println("Enter Laptop Name:");
			name = sc.nextLine();

			if (!v1.validateString(name)) {
				System.out.println("Invalid Laptop Name!");
			} else {
				break; 
			}
		}
		while (true) {
			System.out.println("Enter Model Name:");
			model = sc.nextLine();

			if (!v1.validateString(model)) {
				System.out.println("Invalid model Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Processor Name:");
			processor = sc.nextLine();

			if (!v1.validateString(processor)) {
				System.out.println("Invalid Processor Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter RAM:");
			ram = sc.nextInt();

			if (!v1.Numerics(ram)) {
				System.out.println("Invalid RAM Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Storage:");
			storage = sc.nextInt();

			if (!v1.Numerics(storage)) {
				System.out.println("Invalid Storage Name!");
			} else {
				break; 
			}
		}

		System.out.println("You've selected a Laptop!");
		Laptop laptop = new Laptop(name, model, processor, ram, storage, 799.99);
		double totalPrice = laptop.getPrice();

		if (totalPrice > 600.00) {
			double discount = 0.10;
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;        

			System.out.println("Laptop that you have Picked:");
			System.out.println(laptop);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Discount Applied: " + (discount * 100) + "%");
			System.out.printf("Discount Amount: $%.2f%n", discountedAmount);
			System.out.printf("Discounted Price: $%.2f%n", discountedPrice);
			tp.TotalPriceCalculator(discountedPrice);
		} else {
			System.out.println("Laptop that you have Picked:");
			System.out.println("Sorry, No Discount Applied!");
			System.out.println(laptop);
			System.out.println("Total Price: $" + totalPrice);
		}
	}
	public static void getLaptop2() {
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();  
		String name,model,processor;
		int ram,storage;

		while (true) {
			System.out.println("Enter Laptop Name:");
			name = sc.nextLine();

			if (!v1.validateString(name)) {
				System.out.println("Invalid Laptop Name!");
			} else {
				break; 
			}
		}
		while (true) {
			System.out.println("Enter Model Name:");
			model = sc.nextLine();

			if (!v1.validateString(model)) {
				System.out.println("Invalid model Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Processor Name:");
			processor = sc.nextLine();

			if (!v1.validateString(processor)) {
				System.out.println("Invalid Processor Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter RAM:");
			ram = sc.nextInt();

			if (!v1.Numerics(ram)) {
				System.out.println("Invalid RAM Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Storage:");
			storage = sc.nextInt();

			if (!v1.Numerics(storage)) {
				System.out.println("Invalid Storage Name!");
			} else {
				break; 
			}
		}

		System.out.println("You've selected a Laptop!");
		Laptop laptop = new Laptop(name, model, processor, ram, storage, 699.99);
		double totalPrice = laptop.getPrice();    
		if (totalPrice > 600.00) {
			double discount = 0.10;
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;	        
			System.out.println("Laptop that you have Picked:");
			System.out.println(laptop);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Discount Applied: " + (discount * 100) + "%");
			System.out.printf("Discount Amount: $" + "%.2f", discountedAmount);
			System.out.println();
			System.out.printf("Discounted Price: $%.2f%n", discountedPrice);
			return;
		} else {
			System.out.println("Laptop that you have Picked:");
			System.out.println("Sorry, No Discount Applied!");
			System.out.println(laptop);
			System.out.println("Total Price: $" + totalPrice);
			
		}
	}
	public static void getLaptop3() {
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();  
		String name,model,processor;
		int ram,storage;

		while (true) {
			System.out.println("Enter Laptop Name:");
			name = sc.nextLine();

			if (!v1.validateString(name)) {
				System.out.println("Invalid Laptop Name!");
			} else {
				break; 
			}
		}
		while (true) {
			System.out.println("Enter Model Name:");
			model = sc.nextLine();

			if (!v1.validateString(model)) {
				System.out.println("Invalid model Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Processor Name:");
			processor = sc.nextLine();

			if (!v1.validateString(processor)) {
				System.out.println("Invalid Processor Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter RAM:");
			ram = sc.nextInt();

			if (!v1.Numerics(ram)) {
				System.out.println("Invalid RAM Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Storage:");
			storage = sc.nextInt();

			if (!v1.Numerics(storage)) {
				System.out.println("Invalid Storage Name!");
			} else {
				break; 
			}
		}

		System.out.println("You've selected a Laptop!");
		Laptop laptop = new Laptop(name, model, processor, ram, storage, 999.99);
		double totalPrice = laptop.getPrice();    
		if (totalPrice > 999.00) {
			double discount = 0.10;
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;	        
			System.out.println("Laptop that you have Picked:");
			System.out.println(laptop);
			System.out.println("Total Price: $" + totalPrice);
			System.out.printf("Discount Applied: " + "%.2f",(discount * 100) + "%");
			System.out.println();
			System.out.printf("Discount Amount: $" + "%.2f", discountedAmount);
			System.out.println();
			System.out.printf("Discounted Price: $%.2f%n", discountedPrice);
			return;
		} else {
			System.out.println("Laptop that you have Picked:");
			System.out.println("Sorry, No Discount Applied!");
			System.out.println(laptop);
			System.out.println("Total Price: $" + totalPrice);
		}
	}
}

class Store2 {
	public static void getCloth() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no: 1 for OverSized Tees");
		System.out.println("Enter no: 2 for Pant");
		System.out.println("Enter no: 3 for Shirt");
		System.out.println("Enter a Choice:");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			getClothes1();
			break;
		case 2:
			getClothes2();
			break;
		case 3:
			getClothes3();
			break;
		default:
			System.out.println("Invalid choice!");
		}
	}

	public static void getClothes1() {
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();  
		String type,material,size,color;
		while (true) {
			System.out.println("Enter Type Name:");
			type = sc.nextLine();

			if (!v1.validateString(type)) {
				System.out.println("Invalid Type Name!");
			} else {
				break; 
			}
		}
		while (true) {
			System.out.println("Enter Material Name:");
			material = sc.nextLine();

			if (!v1.validateString(material)) {
				System.out.println("Invalid Material Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Color Name:");
			color = sc.nextLine();

			if (!v1.validateString(color)) {
				System.out.println("Invalid Color Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Size:");
			size = sc.nextLine();

			if (!v1.validateString(size)) {
				System.out.println("Invalid Size Name!");
			} else {
				break; 
			}
		}	

		System.out.println("You've selected Clothes!");
		Clothes clothes = new Clothes(type, material, color, size, 29.99);    
		double totalPrice = clothes.getPrice();    
		if (totalPrice > 20.00) {
			double discount = 0.05; 
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;	        
			System.out.println("Clothes that you have Picked:");
			System.out.println(clothes);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Discount Applied: " + (discount * 100) + "%");
			System.out.println("Discount Amount: $ " + discountedAmount);
			System.out.printf("Discounted Price: $" +"%.2f", discountedPrice);
			System.out.println();
		} else {
			System.out.println("Clothes that you have Picked:");
			System.out.println("Sorry No Discount Applied!");
			System.out.println(clothes);
			System.out.println("Total Price: $" + totalPrice);
		}
	}


	public static void getClothes2() {
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();  
		String type,material,size,color;
		while (true) {
			System.out.println("Enter Type Name:");
			type = sc.nextLine();

			if (!v1.validateString(type)) {
				System.out.println("Invalid Type Name!");
			} else {
				break; 
			}
		}
		while (true) {
			System.out.println("Enter Material Name:");
			material = sc.nextLine();

			if (!v1.validateString(material)) {
				System.out.println("Invalid Material Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Color Name:");
			color = sc.nextLine();

			if (!v1.validateString(color)) {
				System.out.println("Invalid Color Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Size:");
			size = sc.nextLine();

			if (!v1.validateString(size)) {
				System.out.println("Invalid Size Name!");
			} else {
				break; 
			}
		}	

		System.out.println("You've selected Clothes!");
		Clothes clothes = new Clothes(type, material, color, size, 49.99);  
		double totalPrice=clothes.getPrice();
		if(totalPrice>45) {
			double  discount = 0.07;
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;	        
			System.out.println("Clothes that you have Picked:");
			System.out.println(clothes);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Discount Applied: " + (discount * 100) + "%");
			System.out.println("Discount Amount: $ " + discountedAmount);
			System.out.printf("Discounted Price: $" +"%.2f", discountedPrice);
			System.out.println();
		}else {
			System.out.println("Clothes that you have Picked:");
			System.out.println("Sorry No Discount Applied!");
			System.out.println(clothes);
			System.out.println("Total Price: $" + totalPrice);
		}
	}

	public static void getClothes3() {
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();  
		String type,material,size,color;
		while (true) {
			System.out.println("Enter Type Name:");
			type = sc.nextLine();

			if (!v1.validateString(type)) {
				System.out.println("Invalid Type Name!");
			} else {
				break; 
			}
		}
		while (true) {
			System.out.println("Enter Material Name:");
			material = sc.nextLine();

			if (!v1.validateString(material)) {
				System.out.println("Invalid Material Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Color Name:");
			color = sc.nextLine();

			if (!v1.validateString(color)) {
				System.out.println("Invalid Color Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Size:");
			size = sc.nextLine();

			if (!v1.validateString(size)) {
				System.out.println("Invalid Size Name!");
			} else {
				break; 
			}
		}	

		System.out.println("You've selected Clothes!");
		Clothes clothes = new Clothes(type, material, color, size, 30.99);  
		double totalPrice=clothes.getPrice();
		if(totalPrice>35) {
			double  discount = 0.07;
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;	        
			System.out.println("Clothes that you have Picked:");
			System.out.println(clothes);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Discount Applied: " + (discount * 100) + "%");
			System.out.println("Discount Amount: $ " + discountedAmount);
			System.out.printf("Discounted Price: $" +"%.2f", discountedPrice);
			System.out.println();
		}else {
			System.out.println("Clothes that you have Picked:");
			System.out.println("Sorry No Discount Applied!");
			System.out.println(clothes);
			System.out.println("Total Price: $" + totalPrice);
		}
	}
}
