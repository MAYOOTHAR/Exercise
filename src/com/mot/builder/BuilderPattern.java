package com.mot.builder;

import com.mot.singleton.Singleton;

public class BuilderPattern{
		
		public static void main(String[] args) {
			Vehicle car=new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
			Vehicle bike=new Vehicle.VehicleBuilder("2500cc", 2).build();
			Vehicle train=new Vehicle.VehicleBuilder("3500cc", 12).setFans(5).build();
			
			
			
			System.out.println(car.getEngine());
			System.out.println(car.getWheel());
			System.out.println(car.getAirbags());
			
			System.out.println(bike.getEngine());
			System.out.println(bike.getWheel());
			System.out.println(bike.getAirbags());
		}
	}


