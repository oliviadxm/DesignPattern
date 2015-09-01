package factoryPattern;

/**
 * the factory method pattern is a creational pattern which uses factory methods to deal with the problem
 * of creating objects without specifying the exact class of object that will be created.
 * 
 * @author Xiao Du
 *
 */

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		 
		ShapeFactory shapeFactory = new ShapeFactory();
		 
		 //get an object of Circle and call its draw method.
		 Shape shape1 = shapeFactory.getShape("CIRCLE");
		 //call draw method of Circle
		 shape1.draw();
		 
		 //get an object of Rectangle and call its draw method.
		 Shape shape2 = shapeFactory.getShape("RECTANGLE");
		 //call draw method of Rectangle
		 shape2.draw();
		 
		 //get an object of Square and call its draw method.
		 Shape shape3 = shapeFactory.getShape("SQUARE");
		 //call draw method of circle
		 shape3.draw();
	}
}
