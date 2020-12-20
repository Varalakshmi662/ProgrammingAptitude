package com.xworkz.alphabetsPattern;

public class patternC {
		public static void main(String[] args) {
			int num = 7;
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if ((i==0&&j!=0)||(i==num-1&&j!=0)||(j==0&&i!=0&&i!=num-1))
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


