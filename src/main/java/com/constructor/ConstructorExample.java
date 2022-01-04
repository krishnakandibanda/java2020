package com.constructor;

public class ConstructorExample {
	
	String name;
	
	ConstructorExample(){
		this.name = " New ConstrustorExample  ";
	}
	
	public static void main(String[] args) {
		
		ConstructorExample ce = new ConstructorExample();
		System.out.println(ce.name);
	}

}
