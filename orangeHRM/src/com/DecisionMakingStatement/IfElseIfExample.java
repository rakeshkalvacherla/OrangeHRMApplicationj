package com.DecisionMakingStatement;

public class IfElseIfExample {

	public static void main(String[] args) {
    int var1 =80;
    int var2 =100;
    int var3 =90;
    if(var1>var2&&var1>var3) {
    	System.out.println("var1 variable value is greater than var2 and var3");
    }
    else 
    	if(var2>var3){
    		System.out.println("var 2 variable value is greater than var2 and var1");
    	}
    	else {
    		System.out.println("var3 variable vlue is greater than var1 and var2");
    	}
    System.out.println("thank you");
	}

}
