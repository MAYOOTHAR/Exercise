package com.ksh;

public class Student {

	private String name;
	private int age;

	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void show(){
		System.out.println("Name = " + this.name);
		System.out.println("Age = " + this.age);
	}

	public static void main(String[] args){
		Student student = new Student("Kyaw Swar", 16);
		student.show();
	}
}

