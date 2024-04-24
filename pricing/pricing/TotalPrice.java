package com.chainsys.pricing;

public class TotalPrice {
	public static void TotalPriceCalculator(double n1) {
	        double totalPrice = n1 ;
	        System.out.println("Total Price: $" + totalPrice);
	    }
	 public static void TotalPriceCalculator(double n1, double n2) {
	        double totalPrice = n1 + n2;
	        System.out.println("Total Price: $" + totalPrice);
	 }
    public static void TotalPriceCalculator(double n1, double n2, double n3) {
        double totalPrice = n1 + n2 + n3;
        System.out.println("Total Price: $" + totalPrice);
    }
}
