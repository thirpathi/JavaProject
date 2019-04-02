package com.learing;
                          //FACTORY METHOD DESIGN PATTERN

// we con't create the object out side of class,b'coz of private constructor(restrict the object creation); 
//so with this time create the object out side of the class by using "FACTORY METHOD DESIGN PATTERN".


class Test
{
	private Test()
	{
	
	}
	public void m1()
	{
		System.out.println("M1()");

	}
	
	public void m2()
	{
		System.out.println("M2()");

	}
	
	public void m3() 
	{
		System.out.println("M3()");

	}
	//FACTORY METHOD DESIGN PATTERN  ( getTestObject() is a factory method )---should declare as a static
	public static Test getTestObject() 
	{
		Test t = new Test();    // object creation of that class 
		return t;
	}
 
}


public class FactorialDesignPattern 
{
	public static void main(String[] args) 
	{
		Test t1 = Test.getTestObject();   // with help of that method we can access object of that class
		t1.m1();
		t1.m2();
		t1.m3();
		
	}

}


/*
o/p:-
M1()
M2()
M3()
*/