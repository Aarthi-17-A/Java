package com.introduction1;

public class GarbageCollection {

	int id;
	String cname;
	
	@Override
	protected void finalize() {
	    System.out.println("finalize method called");
	}
	
	public static void main(String[] args) {
		
		 GarbageCollection c1 = new  GarbageCollection();
		 System.out.println(c1);
		 
		 
           GarbageCollection c2 = new  GarbageCollection();
		   System.out.println(c2);
		   
		 
		 
         GarbageCollection c3 = new  GarbageCollection();
		 System.out.println(c3);
		 
		 
		 
		 c2=c3;
		 System.out.println(c2);
		 System.out.println(c3);
		 
		 
		 c1 = null;
		 c2= null;
		 
		 
		 System.gc();
	}

}
