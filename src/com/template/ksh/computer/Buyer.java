package com.template.ksh.computer;

public class Buyer {

	public static void main(String[] args) {

		//laptop
		ComputerTemplate laptop = new Laptop();
		laptop.buildComputer();
		System.out.println("------------server-----------");
		
		//server
		ComputerTemplate server = new Server();
		server.buildComputer();
	}

}
