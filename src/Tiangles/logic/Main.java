package Tiangles.logic;

import Tiangles.data.Triangle;
import Tiangles.logic.TriangleTest;

public class Main {
    public static void main(String[] args) {


        TriangleTest test = new TriangleTest();

        Triangle triangle = new Triangle(3,4,5);

        test.longestSide(triangle);
        test.showLongest();
        test.isRightTriangle(triangle);
        System.out.println("Czy trójkąt jest prostokątny ? " + test.isRightTriangle(triangle));
    }

}
