package com.learing;



class Runtime
{
	private static Runtime r = null;
	
	private Runtime()
	{
	}
	
	public static Runtime getRuntime() 
	{
		if (r==null)
		{
			r= new Runtime();
		}
		return r;

	}
}


public class SingleTonDesignPattern
{
	public static void main(String[] args) 
	{
		Runtime r1 = Runtime.getRuntime();  // u r creating 4 obj,but it is pointing to one obj only(to restict one obj only)
		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();
		Runtime r4 = Runtime.getRuntime();
		
		System.out.println("hashcode is : " +r1.hashCode()+ "...." +r2.hashCode()+ "...." +r3.hashCode()+ "...." +r4.hashCode());
	}

}



/*
o/p:-
hashcode is : 366712642....366712642....366712642....366712642
*/