package ua.com.qalight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import ua.com.qalight.abstraction.Shape;
import ua.com.qalight.circle.Circle;
import ua.com.qalight.square.Square;



public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		
		Shape square1 = new Square(10);
		Shape square2 = new Square(100);
		Shape square3 = new Square(1000);
		Shape square4 = new Square(10000);
		
		Shape circle1 = new Circle(10);
		Shape circle2 = new Circle(100);
		Shape circle3 = new Circle(1000);
		Shape circle4 = new Circle(10000);
		
		shapes.add((Square)square1);
		shapes.add((Square)square2);
		shapes.add((Square)square3);
		shapes.add((Square)square4);
		
		shapes.add((Circle)circle1);
		shapes.add((Circle)circle2);
		shapes.add((Circle)circle3);
		shapes.add((Circle)circle3);
		
		
		Shape maxShape = shapes.get(0);
		Shape minShape = shapes.get(0);
		
		for (int i = 0; i < shapes.size(); i = i++) {
		logger.info("Square with side " + shapes.getClass().getSimpleName() + "has area " + shapes.get(i).getArea());
		
		if(maxShape.getArea() < shapes.get(i).getArea()) {
			maxShape = shapes.get(i);
		}
		}
		
		logger.info("Spape " + maxShape.getClass().getSimpleName() + "has area " + maxShape.getArea());
		
		logger.info("end");
		
		 Square square = new Square(10);
		    
		    logger.info("Square with side " + square.getSide() + " has area " + square.getArea());
		    
		    Circle circle = new Circle(15);
		    
		    logger.info("Circle with radius " + circle.getRadius() + " has area " + circle.getArea());
		    
		    String line = "fgjhkjl gyuhi jgiui ghuhu gjkhlijl";
		    
		    String[] words = line.split(" ");
		    
		     			
		    
		    logger.info(String.valueOf(words.length));
		    logger.info(words[4]);
    		
	}
	
		
}
