package com.SeleniumPro;

public class Home extends Electoricals implements food,Snacks {

	
	
	

	@Override
	public void oilsnacks() {
		System.out.println("Oilsnacks method called in Snacks Interface");
		
	}

	@Override
	public void sweetsnacks() {
		System.out.println("Sweetsnacks method called in Snacks Interface");
		
	}

	@Override
	public void streetfood() {
		System.out.println("streetfood method called in food Interface");
		
	}

	@Override
	public void homefood() {
		System.out.println("Homefood method called in food Interface");
		
	}

	@Override
	public void mobile() {
		System.out.println("mobile method called in Electoricals Abstract");
		
	}

	@Override
	public void laptop() {
		System.out.println("laptop method called in Electoricals Abstract");
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("***** 1-Abstract 2-interface and 1-Main class using this program****");
		 Home h1=new Home();
		 h1.callmethod();
		 h1.laptop();
		 h1.mobile();
		 h1.oilsnacks();
		 h1.sweetsnacks();
		 h1.homefood();
		 h1.streetfood();
		
	}

}
