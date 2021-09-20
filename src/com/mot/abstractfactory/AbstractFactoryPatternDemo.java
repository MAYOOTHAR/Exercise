package com.mot.abstractfactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
	      //get shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
	      //get an object of Shape Rectangle
	      Shape shape1 = shapeFactory.getShape("RECTANGLE");
	      //call draw method of Shape Rectangle
	      shape1.draw();
	      //get an object of Shape Square 
	      Shape shape2 = shapeFactory.getShape("SQUARE");
	      //call draw method of Shape Square
	      shape2.draw();
	      Shape shape3 = shapeFactory.getShape("TRIGLE");
	      shape3.draw();
	      //get shape factory
	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
	      //get an object of Shape Rectangle
	     Shape shape4 = shapeFactory1.getShape("RECTANGLE");
	      //call draw method of Shape Rectangle
	      shape4.draw();
	      //get an object of Shape Square 
	      Shape shape5 = shapeFactory1.getShape("SQUARE");
	      //call draw method of Shape Square
	     shape5.draw();
	      
	   }

}
