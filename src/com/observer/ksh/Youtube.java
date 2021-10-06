package com.observer.ksh;

public class Youtube {

	public static void main(String[] args) {
		
		Channel kyawswar = new Channel();
		
		Subscriber s1= new Subscriber("Kaung Htet Naing");
		Subscriber s2= new Subscriber("Sai Thiha Aung");
		Subscriber s3= new Subscriber("May Oo Thar");
		
		kyawswar.subscribe(s1);
		kyawswar.subscribe(s2);
		kyawswar.subscribe(s3);
		
		kyawswar.unSubscribe(s3);
		
		s1.subscriberChannel(kyawswar);
		s2.subscriberChannel(kyawswar);
		s3.subscriberChannel(kyawswar);
		
		kyawswar.upload("How to learn Java!");
	}

}
