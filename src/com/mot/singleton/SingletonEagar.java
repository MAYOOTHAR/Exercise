package com.mot.singleton;

public class SingletonEagar {
	public static SingletonEagar instance=new SingletonEagar();
	
	private SingletonEagar() {}
	
	public static SingletonEagar getInstance() {
		return instance;
	}

}
