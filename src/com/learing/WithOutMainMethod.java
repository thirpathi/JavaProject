package com.learing;


// with out using a main() method, can we execute the program
//YES, By using the "Static Block", we can execute But below 1.7 it's possible
//so it is not possible b'coz it is 1.8 v java


public class WithOutMainMethod 
{
	
	/*public static void main(String[] args) {
		
		System.out.println("raju");
	}*/
	
	static
	{
		System.out.println("raju");
		System.exit(0);
	}

}
