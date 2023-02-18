package com.SeleniumPro;

import java.util.Scanner;

public class PalindromNumber {

	Scanner sr= new Scanner(System.in);
	private void palindrom() {

		System.out.println("Enter number to check palindrom or not");
		int input=sr.nextInt();
		int temp=input;
		int temp1,sum=0;
		
		while(input>0)
		{
			temp1=input%10;//after number
			sum=(sum*10)+temp1;
			System.out.println(sum);
			input=input/10;//before number
	
		}
		if(temp==sum)
		{
			System.out.println(temp+" Number is Palindrom");
		}
		else
		{
			System.out.println(temp+" Number is not Palindrom");
		}

		
	}
	
	
	public static void main(String[] args) {
		PalindromNumber pn=new PalindromNumber();
		pn.palindrom();
	}
	
}
