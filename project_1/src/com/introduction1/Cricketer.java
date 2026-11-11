package com.introduction1;

public class Cricketer {

	//declaration
	static int countryId;
	static String countryName;
	
	String cName;
	int jerseyNo;
	int highestScore;
	
	public static void main(String[] args) {
		System.out.println("welcome to cricket team");
		
		//initialization
		Cricketer msd = new Cricketer();
		
		countryId = 90;
		countryName = "India";
				
		msd.cName = "Mahendra singh dhomni";
		msd.jerseyNo = 07;
		msd.highestScore = 100;
	
		Cricketer vk = new Cricketer();
		vk.cName = "king kholi";
		vk.jerseyNo = 18;
		vk.highestScore = 100;

		Cricketer hitman = new Cricketer();
		hitman.cName = "rohit";
		hitman.jerseyNo = 12;
		hitman.highestScore = 100;
		
		Cricketer gill = new Cricketer();
		gill.cName = "shubman gill";
		gill.jerseyNo = 15;
		gill.highestScore = 100;
		
	
		//Accessing data
		System.out.println("object1 ****************************");
		System.out.println("countryId = " + countryId);
        System.out.println("countryName = " + countryName);
        
        System.out.println("cName = " + msd.cName);
        System.out.println("jerseyNo = " + msd.jerseyNo);
        System.out.println("highestScore = " + msd.highestScore);
    
        System.out.println("object2 ****************************");
        System.out.println("countryId = " + countryId);
        System.out.println("countryName = " + countryName);
        
        System.out.println("cName = " + vk.cName);
        System.out.println("jerseyNo = " + vk.jerseyNo);
        System.out.println("highestScore = " + vk.highestScore);
        
        
        System.out.println("object3 ****************************");
        System.out.println("countryId = " + countryId);
        System.out.println("countryName = " + countryName);
        
        System.out.println("cName = " + hitman.cName);
        System.out.println("jerseyNo = " + hitman.jerseyNo);
        System.out.println("highestScore = " + hitman.highestScore);
        
        
        System.out.println("object4 ****************************");
        System.out.println("countryId = " + countryId);
        System.out.println("countryName = " + countryName);
        
        System.out.println("cName = " + gill.cName);
        System.out.println("jerseyNo = " + gill.jerseyNo);
        System.out.println("highestScore = " + gill.highestScore);
        
	}

}
