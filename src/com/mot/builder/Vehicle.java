package com.mot.builder;

public class Vehicle {
	//required parameter
	private String engine;
	private int wheel;
	//optional parameter
	private int airbags;
	private int fans;
	public int getFans() {
		return fans;
	}
	public void setFans(int fans) {
		this.fans = fans;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getAirbags() {
		return airbags;
	}
	public void setAirbags(int airbags) {
		this.airbags = airbags;
	}
	
	private Vehicle(VehicleBuilder builder) {
		this.engine=builder.engine;
		this.wheel=builder.wheel;
		this.airbags=builder.airbags;
		}
	public static class VehicleBuilder{
		private String engine;
		private int wheel;
		private int airbags;
		private int fans;
		
		
		public VehicleBuilder(String engine,int wheel) {
			this.engine=engine;
			this.wheel=wheel;
		}
		public VehicleBuilder setAirbags(int airbags) {
			this.airbags=airbags;
			return this;
		}
		
		public  VehicleBuilder setFans(int fans) {
			this.fans=fans;
			return this;
			
		}
		
		public Vehicle build() {
			return new Vehicle(this);
		}
	}
}




