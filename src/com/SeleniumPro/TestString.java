package com.SeleniumPro;

import java.util.Scanner;

class TestString {
	Scanner sr=new Scanner(System.in);

	public void print() 
	
	{
		System.out.println("Enter the String");
		
		String a=sr.nextLine(); 
		String b=" ", s="";
		char c;
		int lenth=a.length();
		System.out.println("Total Lenth of \""+a+"\" is "+lenth);
		for(int i=0;i<a.length();i++)
		{
			c=a.charAt(i);
			s=c+s;

		}
		String[] temp=s.split(b);
			int l=temp.length;
			System.out.println("The Split Count is: "+l);
			System.out.println("\n ***BEFORE STRING*** \n"+a);
			System.out.println("\n***AFTER STRING***");
			for(int j=l-1;j>=0;j--)
			{
				System.out.println(temp[j]);	
			}
			
		

		
	}
	
	
public static void main(String[] args) {
	TestString sr=new TestString();
	
	sr.print();
}
}