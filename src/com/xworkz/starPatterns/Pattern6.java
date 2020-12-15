package com.Xworkz.programmimgAptitude;

public class Pattern6 {

	public static void main(String[] args) {
		int num=5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if ((i==num/2 || (j==0 && i!=0) ||
					(j==num-1 && i!=0) )||(i==0 && j==num/2))
						
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
