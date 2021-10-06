package com.template.ksh.computer;

public abstract class ComputerTemplate {
	public final void buildComputer() {
		collectComponents();//ram,fan,gpu,cpu
		assembleComponents();
		installOs();
		startComputer();
		System.out.println("Computer is on!");
	}

	private void collectComponents() {
		System.out.println("Computer with 4GB Ram, 1TB HDD, 4GB Graphics card and 4 usb port");
		
	}

	private void startComputer() {
		System.out.println("System is booting");
	}

	public abstract void installOs();

	public abstract void assembleComponents();
	
	

}
