package com.Xworkz.programmimgAptitude;

public class Pattern7 {

	public static void main(String[] args) {
		int num=5;
		for (int i = 0; i <=num; i++) {
			for (int j = 0; j <=num; j++) {
	         if (i==j || i+j==num)			
			{
					System.out.print("*");
				} 
	         else if(i==0 || j==0 || j==num ||i==num){
					System.out.print("@");
				}
	         else 
	        	 System.out.print("-");
			}
			System.out.println();
		}
	}

}
