package com.ksh;

public class Students {
	public Students(String name){
		this(20);	
		System.out.println("Name of Student : " + name);
	}

	public Students(int age){
		System.out.println("Age of student = " + age);
	}

	public Students(){
		// This line calls the first constructor.
		this("Kyaw Swar");		
	}

	public static void main(String[] args){
		// This calls the third constructor.
		new Students();
	}
}