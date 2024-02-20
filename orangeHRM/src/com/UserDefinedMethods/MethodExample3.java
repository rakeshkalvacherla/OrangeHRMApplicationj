package com.UserDefinedMethods;

public class MethodExample3 {
	public static void main(String[] args) {
		MethodExample3 M3 =new MethodExample3();
		M3.Multiplication();
		MethodExample2 M2=new MethodExample2();
		M2.addition();
	}
 protected void Multiplication() {
	 int var1=50;
	 int var2=60;
	 int var3;
	 var3=var1+var2;
	 System.out.println("The value of the variable var3 value is:-"+var3);
 }
 
}
