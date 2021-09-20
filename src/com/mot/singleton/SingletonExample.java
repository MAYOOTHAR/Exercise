package com.mot.singleton;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton instance=Singleton.getInstance();
		
		System.out.println(instance);
		
		Singleton instance1=Singleton.getInstance();
		
		System.out.println(instance1);
		
	}
}

