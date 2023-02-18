package com.SeleniumPro;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetMap {
	Scanner sr=new Scanner(System.in);
			
	private void setfun() 
	
	{
		Set<Integer> a= new TreeSet<Integer>();
		System.out.println("Enter input count");
		int n=sr.nextInt();
		System.out.println("Enter Input");
		for(int i=0;i<n;i++)
		{
			int input=sr.nextInt();
			a.add(input);	
		}
		System.out.println("The tree Set Output is:"+a);
		
		
		int as=a.size();
		System.out.println("The total size of Set is\n"+as);
		
		System.out.println("This RemoveAll Function Delete all Data");
		a.removeAll(a);
		System.out.println(a);
		
		
		
		
		
		
	

	}
	
	private void maptest() {
	Map<Integer, String> mp=new HashMap<Integer, String>();
	
	mp.put(1,"Mobile Name");
	mp.put(2,"Mobile Model");
	mp.put(3,"Mobile Spec");
	
	System.out.println(mp);
	int size=mp.size();
	System.out.println("The Size of Map is\n"+size);
	System.out.println("Enter Get value");
	int inp=sr.nextInt();
	
	String s=mp.get(inp);
System.out.println(s);

	
	
	
	

	}
	
	
	

	public static void main(String[] args) {

		SetMap sm=new SetMap();
		
		
		//sm.setfun();
		sm.maptest();

	}

}
