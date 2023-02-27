package assignment.shape1;
import java.util.logging.*;
import java.util.*;
class Shape
{
    float height;
    float width;
    float base;
    float side1;
    float side2;
    float radius;
    int x;
    Scanner sc = new Scanner(System.in);
    Logger logger = Logger.getLogger("hi");

    Shape(int x,float radius) {
    	this.x = x;
        this.radius = radius;
    }
    Shape(int x,float height,float width) {
    	this.x = x;
        this.height = height;
        this.width = width;
    }
    Shape(int x,float base,float side1,float side2) {
    	this.x = x;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }

    void perimeter() {
        if (x == 1) {
            float circle = (float) (2 * 3.14 * radius);
            logger.log(Level.INFO,()->"Perimeter of circle:" + circle);
        } else if (x == 2) {
            float rectangle = 2 * (height + width);
            logger.log(Level.INFO,()->"Perimeter of rectangle:" + rectangle);
        } else if (x == 3) {
            float triangle = base + side1 + side2;
            logger.log(Level.INFO,()->"Perimeter of triangle:" + triangle);
        } else {
            System.exit(0);
        }
    }

    void area() {
        if (x == 1) {
            float circle = (float) (3.14 * radius * radius);
            logger.log(Level.INFO,()->"Area of circle:" + circle);
        } else if (x == 2) {
            float rectangle = height * width;
            logger.log(Level.INFO,()->"Area of rectangle:" + rectangle);
        } else if (x == 3) {
            float triangle = (float) (1.0 / 2.0 * (base * side1));
            logger.log(Level.INFO,()->"Area of triangle:" + triangle);
        } else {
            System.exit(0);
        }
    }
}
