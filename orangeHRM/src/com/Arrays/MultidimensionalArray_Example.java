package com.Arrays;

public class MultidimensionalArray_Example {

	private static final String[][] rakesh = null;

	public static void main(String[] args) {
		
		String rakesh[][]=new String[2][2];
		rakesh[0][0]="vinith";
		rakesh[0][1]="rakesh";
		rakesh[1][0]="naveen";
		rakesh[1][1]="jaiSriram";
				
		for(int rowindex=0;rowindex<=2;rowindex++) {
			
			for(int rowcell=0;rowcell<=2;rowcell++) {
				System.out.println(rakesh[rowindex][rowcell]);
			}
		}

	}

}
