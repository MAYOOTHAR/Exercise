package com.mot.test;

public class Ex7 {

	public static void main(String[] args) {
		int x=10;
		int y= new Ex7().change(x);
		System.out.println(x+y);
	}

	private int change(int x) {
		x=12;
		return x;
	}

	}



