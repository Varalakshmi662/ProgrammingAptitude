package com.xworkz.generalaptitude;

public class Transformance {

	public static void main(String[] args) {
		String name="abbrsarvbklcqlz";
		char[] removeDuplicate = name.toCharArray();
		char[] newArray=new char[removeDuplicate.length];
		int count=0;
		for (int i = 0; i < removeDuplicate.length; i++) {
			boolean duplicate=false;
			for (int j = 0; j < newArray.length; j++) {
				if(removeDuplicate[i]==newArray[j]) {
					duplicate=true;
					break;
				}else {
					duplicate=false;
				}
			}
			if(!duplicate) {
				newArray[count++]=removeDuplicate[i];
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
	}

}
