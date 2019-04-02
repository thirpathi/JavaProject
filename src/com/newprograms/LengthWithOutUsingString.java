package com.newprograms;

public class LengthWithOutUsingString 
{
	

public static void main(String[] args) {
	
	String s = "Hello";
	//System.out.println(s.length());
	char[] c = s.toCharArray();
	int count=0;
	for(char ch : c)
	{
	    count++;	
	}
	System.out.println("Lenth is : " + count);
	
}


}
