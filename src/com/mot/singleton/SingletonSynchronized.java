package com.mot.singleton;

public class SingletonSynchronized {
	public static SingletonSynchronized instance;
	
	private SingletonSynchronized() {}
	public static SingletonSynchronized getInstance() {
		if(instance == null) {
			synchronized(SingletonSynchronized.class) {
				if(instance==null) {
					instance = new SingletonSynchronized();
				}
			}
		}
		return instance;
	}

}
