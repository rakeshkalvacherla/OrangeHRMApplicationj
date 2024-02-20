package com.DecisionMakingStatement;

public class NestedCondition {
	public static void main(String[] args) {
    String examstatus ="pass";
      if(examstatus=="pass") {
    	System.out.println("please wait for further rounds");
       String round1status ="pass";
       if(round1status =="pass") {
       System.out.println("you have cleared round1 interview please wait for round2");
       String round2status ="pass";
      if(round1status =="pass") {
      System.out.println("you have cleared round2 interview please wait for HR round");
      String HRround="pass";
      if(HRround=="pass") {
    	System.out.println("you have clearded HRround ");
    }
      else {
    	  System.out.println("you can go to home");
      }
    }
    
    }
    else {
    	System.out.println("you can go to home");
    }
	}	
	}
	}

