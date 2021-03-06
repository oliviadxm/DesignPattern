package creationalPatterns.prototypePattern_05;

/**
 * @Author: Xiao Du
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
