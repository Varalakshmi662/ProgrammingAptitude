package com.xworkz.generalaptitude;

import java.util.Scanner;

public class Palindrome {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=scanner.nextInt();
		Palindrome palindrome = new Palindrome();
		palindrome.ispalindrome(num);
	
	}
		public int ispalindrome(int num) {
			int temp,sum = 0,r;
			temp=num;
			while(num>0) {
				r=num%10;
				sum=(sum*10)+r;
				num=num/10;
			}
			if(temp==sum)
				System.out.println("palindrome number");
			else 
				System.out.println("is not a palindrome");
			return num;
		}	
}
