package com.UserDefinedMethods;

public class MethodExample4 {

	double var1=20; //Global variables 
	public void addition()
	{
	
	//int	var1=10;    //Local variables 
	int var2=20;
	double var3;
	var3=var2+var1;
	System.out.println("The Value of the variable var3 after addition is:-"+var3);
	}
	
	public void addition(int var1,int var2,int var3) {  //Method With parameters
	 var3=var2+var1;
	System.out.println("The Value of the variable var3 after addition along with parameters:-"+var3);
	}
	public void Subtraction(int var1,double var2,double var3) {
		var3=var1-var2;
		System.out.println("The value of the variable after addition along with 3 Parameters is:-"+var3);
	}
	public static void main(String[] args) {
		MethodExample4 m4=new MethodExample4();
		m4.addition();
		m4.addition(50, 60, 70);
		m4.Subtraction(23, 34, 65);
}
}