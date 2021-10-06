package com.observer.ksh;

public class Subscriber implements Observer {

	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hey " + name + " Video Uploaded " + channel.title);
	}
	
	@Override
	public void subscriberChannel(Channel ch){
		channel = ch;
	}

}

