package prototypePattern;

/**
 * @Author: Xiao Du
 * @Date: 8/14/2016.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
