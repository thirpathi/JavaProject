package com.newprograms;

public class NumberOfDigitsInString 
{
	public static void main(String[] args) 
	{
		String s = "hello123java";
		
		// by using string class method (charAt())
		for (int i = 0; i <s.length(); i++) 
		{
			char c = s.charAt(i);
			
			if(Character.isDigit(c))
			{
				System.out.println("Digit in the string is : " +c);
				
			}
			
		}
		
		/*
		// with out using string class methods
		char []  c = s.toCharArray();
		for (char ch : c)
		{
			if (Character.isDigit(ch))
			{
				System.out.println("Digit in the string is : " +ch);
			}
		}
		*/
		
	}

}


/*o/p:-
Digit in the string is : 1
Digit in the string is : 2
Digit in the string is : 3
*/
	