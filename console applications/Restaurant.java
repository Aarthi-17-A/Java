package com.projects;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		System.out.println("welcome to the Restaurant");
		Scanner sc = new Scanner(System.in);
		String tyn = "";
		 double vegcost = 0;
		 double nvegcost = 0;
		 double dessert_cost = 0;
		 double starters_cost = 0;
		 double softDrinks_cost = 0;
		 double gstRate = 15;
		
		do {
		
		System.out.println("Enter the category: ");
		String ctgy = sc.next();
		
		switch(ctgy) {
		
		case "veg" -> {
			 String vyn ="";
			
			
			do {
			
			System.out.println("enter the item");
			String item = sc.next();
			
			 
			switch(item) {
			
			case "vb" ->{
				System.out.println("veg Biryani - 450/-");
				double vbcost = 450;
				vegcost = vegcost + vbcost;
			}
			case "pb" ->{
				System.out.println("Panner Biryani - 500/-");
				double pbcost = 500;
				vegcost = vegcost + pbcost;
			}
			case "kb" ->{
				System.out.println("kaju Biryani - 400/-");
				double kbcost = 400;
				vegcost = vegcost + kbcost;
			}
			case "mb" ->{
				System.out.println("Mashroom Biryani - 550/-");
				double mbcost = 550;
				vegcost = vegcost + mbcost;
			}
			default -> {
				System.out.println("Entered item is not available !!");
			}
			
			}
			 System.out.println("to continue again enter y for yes and n nor no");
			 vyn=sc.next();
			
			}while(vyn.equalsIgnoreCase("y"));
			
			System.out.println("total veg items cost is " + vegcost);
		}
		
		case "non-veg" -> {
			
			String nvyn ="";
			
			
			do {
			System.out.println("enter the item");
			String item = sc.next();
			
			
			switch(item) {
		
			case "cb" -> {
				System.out.println("Chicken Biryani 600/-");
				double cbcost = 600;
				nvegcost = nvegcost + cbcost;
			}
			case "mtb" -> {
				System.out.println("Mutton Biryani 600/-");
				double mtbcost = 600;
				nvegcost = nvegcost + mtbcost;
			}
			case "fpb" -> {
				System.out.println("fry piece Biryani 600/-");
				double fpbcost = 600;
				nvegcost = nvegcost + fpbcost;
			}
			case "eb" -> {
				System.out.println("Egg Biryani 650/-");
				double ebcost = 650;
				nvegcost = nvegcost + ebcost;
			}
			default -> {
				System.out.println("Entered item is not available !!");
			}
			
			}
			System.out.println("to continue again enter y for yes and n nor no");
			nvyn = sc.next();
			
			}while(nvyn.equalsIgnoreCase("y"));
			
			System.out.println("total non-veg items cost is " + nvegcost);
		}
		
		case "desserts" -> {
			String dyn = "";
			
			
			do {
				
			System.out.println("enter the item");
			String item = sc.next();
			
			
			switch(item) {
			
			case "dcb" ->{
			 System.out.println("Chocolate Brownie	120/-");	
			 double dcbcost = 120;
			 dessert_cost = dessert_cost + dcbcost;
			 }
			case "dvic" -> {
				System.out.println("Vanilla Ice Cream	80/-");
				double viccost = 80;
				dessert_cost = dessert_cost + viccost;
			}
			case "dgj" -> {
				System.out.println("Gulab Jamun	60/-");
				double dgjcost = 60;
				dessert_cost = dessert_cost + dgjcost;
			}
			case "dcl" -> {
				System.out.println("Chocolate Lava Cake	150/-");
				double dclcost = 150;
				dessert_cost = dessert_cost + dclcost;
			}
			default -> System.out.println("Entered item is not available !!");
			
			}
			System.out.println("to continue again enter y for yes and n nor no");
			
			dyn = sc.next();
			
			}while(dyn.equalsIgnoreCase("y"));
			System.out.println("total dessert items cost is " + dessert_cost);
			
			}
		
		case "starters" -> {
			String syn = "";
			
			
			do {
			
			System.out.println("enter the item");
			String item = sc.next();
			
			switch(item) {
			case "c65" -> {
				System.out.println("Chicken 65  180/-");
				double c65cost = 180;
				starters_cost = starters_cost + c65cost;
			}
			case "vm" -> {
				System.out.println("Veg Manchurian  130/-");
				double vmcost = 130;
				starters_cost = starters_cost + vmcost;
			}
			case "crn" -> {
				System.out.println("Crispy Corn	 120/-");
				double crncost = 120;
				starters_cost = starters_cost + crncost;
			}
			case "clp" -> {
				System.out.println("Chicken Lollipop  200/-");
				double clpcost = 200;
				starters_cost = starters_cost + clpcost;
			}
			default -> System.out.println("Entered item is not available !!");
			
			}
            System.out.println("to continue again enter y for yes and n nor no");
			
			syn = sc.next();
			
		 }while(syn.equalsIgnoreCase("y"));
			System.out.println("total starter items cost is " + starters_cost);
		}
	
		case "softdrinks" -> {
			String sdyn = "";
			
			
			do {
				
			System.out.println("enter the item");
			String item = sc.next();
			
			switch(item) {
			case "coc" -> {
				System.out.println("Coca-Cola	40/-");
				double coccost = 40;
				softDrinks_cost = softDrinks_cost + coccost;
			}
			case "sprt" -> {
				System.out.println("Sprite	40/-");
				double sprtcost = 40;
				softDrinks_cost = softDrinks_cost + sprtcost;
			}		
			case "thsp" -> {
				System.out.println("Thums Up  40/-");
				double thspcost = 40;
				softDrinks_cost = softDrinks_cost + thspcost;
			}
			case "lmca" -> {
				System.out.println("Limca  40/-");
				double lmcacost = 40;
				softDrinks_cost = softDrinks_cost + lmcacost;
			}
			default -> System.out.println("Entered item is not available !!");
			
			}
            System.out.println("to continue again enter y for yes and n nor no");
			
			sdyn = sc.next();
			
			}while(sdyn.equalsIgnoreCase("y"));
			System.out.println("total soft Drinks items cost is " + softDrinks_cost);
		}
		default -> System.out.println("Entered category is not available !!");
		}
		 System.out.println("to continue with Category again enter y for yes and n nor no");
		tyn = sc.next();
		}while(tyn.equalsIgnoreCase("y"));
		
		double subTotal = vegcost + nvegcost + dessert_cost + starters_cost + softDrinks_cost;

		
		double gstAmount = subTotal * gstRate/100;
		double grandTotal = subTotal + gstAmount;
		
		
		System.out.println("-----------------------------");
		System.out.println("Sub Total: " + subTotal);
		System.out.println("-----------------------------");
		System.out.println("GST (15%): " +  gstAmount);
		System.out.println("-----------------------------");
		System.out.println("Grand Total: " + grandTotal);
		System.out.println("-----------------------------");
		
		System.out.println("thank you!");
	}

}

