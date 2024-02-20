package com.Loops;

public class NestedLoopsExample {

	public static void main(String[] args) {
    //Nested loops
	for(int a=0;a<2;a++)//outer loop
	{
	for(int b=1;b<=2;b++)//Inner loop
	{
		System.out.println("selenium");
	}
	}
	System.out.println("#########2##########");
	System.out.println();
	for(int a=0;a<=2;a++)
	{
	for(int b=1;b<=2;b++)
	{
		System.out.println(a+b);
	}
	}
    System.out.println("****************");
    System.out.println();
    for(int a=0;a<6;a++) 
    {
    for(int b=2;b<5;b++) {
    System.out.println("*");	
    }
    }
	}

}
