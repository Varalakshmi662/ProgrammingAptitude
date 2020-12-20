package com.xworkz.alphabetsPattern;

public class patternM {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j==0||j==num-1||(i==j&&j!=num-2)||
				(i+j==num-1&&i!=num-2)||(i==num/2&&j==num/2))
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
