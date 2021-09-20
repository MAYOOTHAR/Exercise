package com.mot.factory;

public class OperatingSystemFactory {
	public Os getOS(String str) {
		if(str.equalsIgnoreCase("Andriod"))
			return new Android();
		else if (str.equalsIgnoreCase("IOS"))
			return new IOS();
		else if (str.equalsIgnoreCase("linux"))
			return new Linux();
		else
			return new Windows();
		}
}
