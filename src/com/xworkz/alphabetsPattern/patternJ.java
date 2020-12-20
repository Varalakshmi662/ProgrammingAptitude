package com.xworkz.alphabetsPattern;

public class patternJ {

	public static void main(String[] args) {
		int num = 7;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i==0||(j==num/2&&i!=num-1)||(i==num-1&&j==1&&j!=num/2)
						||(j==0&&i==num-2))
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
