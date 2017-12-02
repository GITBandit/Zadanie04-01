public class TriangleTest {

    private int longSide;
    private int otherSide1;
    private int otherSide2;


    public boolean isRightTriangle (Triangle triangle){
            if (Math.pow(longSide,2)==(Math.pow(otherSide1,2)+Math.pow(otherSide2,2))) {
                return true;
            } else {
                return false;
            }
    }
    public void longestSide(Triangle triangle) {
        if (triangle.getSide1() > triangle.getSide2() && triangle.getSide1() > triangle.getSide3()) {
            longSide = triangle.getSide1();
            otherSide1 = triangle.getSide2();
            otherSide2 = triangle.getSide3();
        } else if (triangle.getSide2() > triangle.getSide1() && triangle.getSide2() > triangle.getSide3()) {
            longSide = triangle.getSide2();
            otherSide1 = triangle.getSide1();
            otherSide2 = triangle.getSide3();
        } else {
            longSide = triangle.getSide3();
            otherSide1 = triangle.getSide1();
            otherSide2 = triangle.getSide2();
        }
    }

    public void showLongest(){
            System.out.println("Najdłuższy bok : " + longSide);
            System.out.println("Inny bok 1 :" + otherSide1);
            System.out.println("Inny bok 2 :" + otherSide2);
    }


 }

