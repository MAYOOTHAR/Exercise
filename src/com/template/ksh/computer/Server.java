package com.template.ksh.computer;

public class Server extends ComputerTemplate{

	@Override
	public void installOs() {
		System.out.println("Installing Unix");
		
	}

	@Override
	public void assembleComponents() {
		System.out.println("Joining all units,0 HDMI, 1VGA port");
		
	}

}
