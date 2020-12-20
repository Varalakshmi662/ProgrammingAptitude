package com.xworkz.alphabetsPattern;

public class patternK {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if ((i+j==num-1&&j!=0&&j!=1)||(i==j&&i!=0&&i!=1)||j==num/2)
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
