package com.projects;

import java.util.Scanner;

public class JobRecruitmentSystem {

	public static void main(String[] args) {
		
		System.out.println("===== Welcome To Job Recruitment Portal =====");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Full Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter your age :");
	    int age = sc.nextInt();
	    
	    System.out.println("Enter your educational qualification :");
	    String qualification = sc.next();
	    
	    if(qualification.equals("bca")||qualification.equals("mca")||qualification.equals("btech")) {
	    	System.out.println("enter your Percentage");
	    	double percentage = sc.nextDouble();
	    	
	    	if(percentage >= 60) {
	    		System.out.println("Enter your Java knowledge level");
	    		String level = sc.next();
	    		if(level.equals("intermediate")||level.equals("advanced")) {
	    			System.out.println("Do you know SQL ?");
	    			String sql = sc.next();
	    			if(sql.equals("yes")) {
	    				System.out.println("Do you know HTML and CSS");
	    				String frontend = sc.next();
	    				if(frontend.equals("yes")) {
	    					System.out.println("Enter your communication rating (1-10):");
	    					int comrate = sc.nextInt();
	    					if(comrate >= 6) {
	    						System.out.println("Enter your technical interview score (1-100):");
	    						int techScore = sc.nextInt();
	    						if(techScore >= 70){
	    							System.out.println(name + " Congratulations You Are Selected");
	    						}else {
	    							System.out.println("sorry Technical interview score must be at least 70.");
	    						}
	    					}else {
	    						System.out.println("sorry Communication rating must be at least 6.");
	    					}
	    				}else {
	    					System.out.println("sorry you're not eligible, must need HTML/CSS to qualify");
	    				}
	    			}else {
	    				System.out.println("sorry you're not eligible, must need SQL to qualify");
	    			}
	    			
	    		}else {
	    			System.out.println("sorry"+ level + "is not eligible");
	    		}
	    	}else {
	    		System.out.println("sorry your percentage is not eligible ,must be 60 or above");
	    	}
	    }else {
	    	System.out.println("sorry this qualification is not eligible");
	    }
	}

}
