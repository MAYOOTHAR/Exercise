package com.template.ksh.computer;

public class Laptop extends ComputerTemplate{

	@Override
	public void installOs() {
		System.out.println("Installing windows");
		
	}

	@Override
	public void assembleComponents() {
		System.out.println("Joining all units,plus 4 HDMI ports");
		
	}

}
