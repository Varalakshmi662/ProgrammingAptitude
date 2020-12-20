package com.xworkz.alphabetsPattern;

public class patternA {
		public static void main(String[] args) {
					int num=5;
					for (int i = 0; i < num; i++) {
						for (int j = 0; j < num; j++) {
				 if (i==num/2 ||i+j==2||(j==num-1&&i!=0&&i!=1)||
						 (i==1&&j==3)||(j==0&&i!=0&&i!=1))								
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


