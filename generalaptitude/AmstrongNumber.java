package com.xworkz.generalaptitude;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		
	AmstrongNumber amstrong = new AmstrongNumber();
	amstrong.amstrong(num);
	}
	public int amstrong(int num) {
		int sum=0,a,temp;
		temp=num;
		while(num>0) {
			a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		if(temp==sum)
		System.out.println("amstrong number");
		else
			System.out.println("Not a amstrong number");
		return num;	
	}
}
