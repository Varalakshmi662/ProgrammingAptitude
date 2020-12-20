package com.xworkz.alphabetsPattern;

public class patternS {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i==0||(j==0&&i!=3&&i!=4)||(j==num-1&&i!=1)
						||i==num-1||i==num/2)
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
