package creationalPatterns.prototypePattern;

/**
 * @Author: Xiao Du
 * @Date: 8/14/2016.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
