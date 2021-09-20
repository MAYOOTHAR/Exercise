package com.mot.factory;

public class FactoryPattern {

	public static void main(String[] args) {
		OperatingSystemFactory osf=new OperatingSystemFactory();
		Os obj=osf.getOS("Andriod");
		obj.spec();
		
}
}
