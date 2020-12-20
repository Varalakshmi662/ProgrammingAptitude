package com.xworkz.alphabetsPattern;

public class patternF {
		public static void main(String[] args) {
			int num = 7;
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if (j==0||i==0||i==num/2)
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


