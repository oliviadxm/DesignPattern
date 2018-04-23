package structuralPatterns.flyweightPattern;

import java.util.HashMap;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory
 * footprint and increase performance. This type of design pattern comes under structural pattern
 * as this pattern provides ways to decrease object count thus improving the object structure of
 * application.
 *
 * Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates
 * new object when no matching object is found.
 */
public class ShapeFactory {

    // Uncomment the compiler directive line and
    // javac *.java will compile properly.
    // @SuppressWarnings("unchecked")
    private static final HashMap circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
