package com.newprograms;

public class NumberOfCharactorInString
{
	public static void main(String[] args) 
	{
		String s = "ADP ADP JAVA RAJU";
		int count = 0;

 		// by using string class method (charAt())
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)=='S')
			{
				count++;
			}
			
		}		
		/*
		// with out using string class methods
		char []  c = s.toCharArray();
		for(char ch : c)
		{
			if(ch =='A')
			{
				count++;
			}
		}

		*/
		System.out.println("count is  " + count);

	}

}


/*o/p:-
count is  5
*/
