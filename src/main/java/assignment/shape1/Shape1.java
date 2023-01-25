package assignment.shape1;

import java.util.*;
public class Shape1 
{
    float height;
    float width;
    float base;
    float side1;
    float side2;
    float radius;
    static int x;
    boolean b = true;
    Scanner sc = new Scanner(System.in);

    Shape1() {
        while (b) {
            System.out.print("1.Circle\n2.Rectangle\n3.Triangle\n4.Exit\nEnter your option 1 or 2 or 3 or 4: ");
            x = sc.nextInt();
            if (x == 1) {
                System.out.print("Enter Circle Radius:");
                radius = sc.nextFloat();
            } else if (x == 2) {
                System.out.print("Enter Rectangle Height:");
                height = sc.nextFloat();
                System.out.print("Enter Rectangle Width:");
                width = sc.nextFloat();
            } else if (x == 3) {
                System.out.print("Enter Triangle base: ");
                base = sc.nextFloat();
                System.out.print("Enter Triangle side1: ");
                side1 = sc.nextFloat();
                System.out.print("Enter Triangle Side2: ");
                side2 = sc.nextFloat();
            }
            perimeter();
            area();
        }
    }

    void perimeter() {
        if (x == 1) {
            float cirPer = (float) (2 * 3.14 * radius);
            System.out.println("Perimeter of circle:" + cirPer);
        } else if (x == 2) {
            float recPer = 2 * (height + width);
            System.out.println("Perimeter of Rectangle:" + recPer);
        } else if (x == 3) {
            float triPer = base + side1 + side2;
            System.out.println("Perimeter of Triangle:" + triPer);
        } else {
            b = false;
            System.exit(0);
        }
    }

    void area() {
        if (x == 1) {
            float cirPer = (float) (3.14 * radius * radius);
            System.out.println("area of circle:" + cirPer);
        } else if (x == 2) {
            float recPer = height * width;
            System.out.println("area of Rectangle:" + recPer);
        } else if (x == 3) {
            float triPer = 1 / 2 * (base * side1);
            System.out.println("Perimeter of Triangle:" + triPer);
        } else {
            b = false;
            System.exit(0);
        }
    }
    public static void main( String[] args )
    {
    	Shape1 sp = new Shape1();
    }
}
