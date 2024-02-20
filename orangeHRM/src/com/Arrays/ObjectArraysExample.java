package com.Arrays;

public class ObjectArraysExample {

	public static void main(String[] args) {
	
		Object array1[]=new Object[5];
		 
		array1[0]=20;
		array1[1]=30;
		array1[2]="jai sriram";
		array1[3]=50.566;
		array1[4]=60.467f;
		
	for(int index=0;index<array1.length;index++) 
	{
		System.out.println(array1[index]);
	}
	System.out.println();
	System.out.println("&&&&&&&&&&&&&&&&& For Each loop &&&&&&&&&&&&&&&&&&");
	
	for(Object index:array1)
	{
		System.out.println(index);
	}
}

}
