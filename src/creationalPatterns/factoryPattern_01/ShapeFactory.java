package creationalPatterns.factoryPattern_01;

/**
 * Factory pattern is one of most used design patterns in Java. This type of design
 * pattern comes under creational pattern as this pattern provides one of the best
 * ways to create an object.
 * 
 * In Factory pattern, we create objects without exposing the creation logic to the
 * client and refer to newly created object using a common interface.
 * 
 * @author Xiao Du
 *
 */

public class ShapeFactory {
	//use getShape method to get object of type shape
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
}