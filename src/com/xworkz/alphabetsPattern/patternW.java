package com.xworkz.alphabetsPattern;

public class patternW {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j==0||j==num-1||(i+j==num-1&&i!=1)||(i==j&&j!=1))
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
	}
}
