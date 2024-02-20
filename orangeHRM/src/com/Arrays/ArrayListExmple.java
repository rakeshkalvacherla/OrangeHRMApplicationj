package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExmple {

	public static void main(String[] args) {
     
		//syntax
		//List<data Type>arrayListName=new ArrayList<>();
		
		List<Object>arrayList1=new ArrayList<>();
		arrayList1.add(10);
		arrayList1.add("Sri ram");
		arrayList1.add("Hanuman");
		arrayList1.add(253.8755);
		arrayList1.add(2354356.9847f);
		
		for(int index=0;index<arrayList1.size();index++) 
		{
			System.out.println(arrayList1.get(index));
		}
		
		System.out.println();
		System.out.println("&&&&&&&&&&&&for Eachloop&&&&&&&&&&");
		
		for(Object index:arrayList1) 
		{
			System.out.println(index);
			
		}
		
		
		
		
	}

}
