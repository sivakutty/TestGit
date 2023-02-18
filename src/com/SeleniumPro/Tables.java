package com.SeleniumPro;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class Tables {
	
	Scanner sr=new Scanner(System.in);
	
	private void tablecreate() {
	
		System.out.println("Enter Which Table You Want");
			
		
		int n=sr.nextInt();

	
		for(int i=1;i<=20;i++)
		{
			System.out.println(i+"x"+n+"="+i*n);
					
		}
		
				
	}
	public static void main(String[] args) {
		Tables tb=new Tables();
		tb.tablecreate();
		
		
		
	}

}
