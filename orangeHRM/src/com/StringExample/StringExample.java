package com.StringExample;

public class StringExample {

	public static void main(String[] args) {
		String var1="Livetech";
		String var2="SeleniumWebdriver";
		if(var1.equals(var2)) {
			System.out.println("var1 variable value is Equals to var2 variable value ");
			
			}
		else {
			System.out.println("var1 variable value is not equals to var2 variable value");
		}
		
		System.out.println();
		
		
		String var3="JaiSriram";
		String var4="Ayodhya";
		if(var3.equals(var4)) {
			System.out.println("var3 variable value is equals to var4 variable value");
		}
		else {
			System.out.println("var3 variable value is not equal to var4 variable value");
			
		}
		
		String var5="Rakesh";
		String var6="rakesh";
		if(var5.equalsIgnoreCase(var6)) {
			System.out.println("var5 variable value is equals to var6 variable value");
		}
		else {
			System.out.println("var5 variable value is not equals to var6 variable value");
		}
				System.out.println("__________");
		String var7="LiveTech";
		String var8="Livetech";
		if(var7.equalsIgnoreCase(var8)) {
			System.out.println("var7 variable value is equals to var8 variable value");
		}
		   System.out.println();
		 String var9="LiveTech";
		 String var10="LiveTech";
		 if(var9.contains(var10)) {
			 System.out.println("String Existing");
		 }
		  System.out.println("************Finding the Number of Charecters of a string************");
		 int hello=var10.length();
		 System.out.println("The Number of the characters in the variable var10 is:-"+hello);
		  System.out.println();
          
		  int var1VariableValueLength=var1.length();
		  int var2VariablevalueLength=var2.length();
          System.out.println("The Number of characters of the var1 variable value is:-"+var1VariableValueLength);	
		  System.out.println("The Number of characters of the var2 variable value is:-"+var2VariablevalueLength);
	      if(var1VariableValueLength>var2VariablevalueLength) {
	        System.out.println("var1 Variable Value greater than var2 Variable value");	  
	      }
	      else { 
	    	  System.out.println("var2 variable value is greater than var1 variable value");
	      }
	     
	      System.out.println();
	      String var11="Jaisriram";
	      System.out.println("The Character of the index 5 is "+var11.charAt(5));
	      System.out.println("The Character of the index 3 is "+var11.charAt(3));
	}
	     

}
