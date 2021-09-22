package geo;
public class Geometrics {
    public static void main(String[] args) {
        // area ... Fläche
        System.out.println("---------------------------------");
        System.out.println("Square area");
        System.out.println("Square area von 10.0: " + getSquareArea(10.0));     //double
        System.out.println("Square area von 8: " + getSquareArea(8));           //integer


        // perimeter ... Umfang
        System.out.println("---------------------------------");
        System.out.println("Square perimeter");
        System.out.println("Square parameter von 10.0: " + getSquareParimeter(10.0));       //double
        System.out.println("Square parameter von 10: " + getSquareParimeter(10));           //integer


        //rectangle area
        System.out.println("---------------------------------");
        System.out.println("Rectangle area");
        System.out.println("Rectangle area 10.0 x 20.0: " + getRectangleArea(10.0, 20.0));
        System.out.println("Rectangle area 5 x 3: " + getRectangleArea(5, 3));


        //rectangle perimeter
        System.out.println("---------------------------------");
        System.out.println("Rectangle perimeter");
        System.out.println("Rectangle perimeter 2 x 10.0 + 2 x 20.0: " + getRectangleParimeter(10.0,20.0));
        System.out.println("Rectangle perimeter 2 x 10 + 2 x 20: " + getRectangleParimeter(10,20));


        System.out.println("We can also calculate some volumes");
        //System.out.println("10.0/2.0/1.0: " + getVolume(10.0, 2.0, 1.0));
        /*
            z is our height
            y is our radiusf
         */

        System.out.println("---------------------------------");
        System.out.println("Zone of a sphere");
        System.out.println("Zone of sphere: " + getZoneofSpere(3.0, 5.0, 10.0));

        System.out.println("---------------------------------");
        System.out.println("Sphere with cylinder");
        System.out.println("Spere with cylinder: " + getSpereWithCylinder(3.0));

        System.out.println("Ungula");
        System.out.println("Ungula: " + getUngula(45, 89));
    }

    public static double getZoneofSpere (double z, double y, double x) {
        return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }

    public static double getSpereWithCylinder(double z) {
        return Math.PI * Math.pow(z, 3) / 6;
    }

    public static double getUngula (double x, double y) {
        return (2 * x * y) / 3;
    }
    public static double getSquareArea (double width) {
        return width * width;
    }

    public static int getSquareArea (int width) {
        return width * width;
    }

    public static double getRectangleArea (double width, double height) {
        return width * height;
    }

    public static int getRectangleArea (int width, int height) {
        return width * height;
    }

    public static double getSquareParimeter (double width) {
        return width * 4;
    }

    public static int getSquareParimeter (int width) {
        return width * 4;
    }

    public static double getRectangleParimeter(double width, double height) {
        return 2 * width + 2 * height;
    }

    public static int getRectangleParimeter(int width, int height) {
        return 2 * width + 2 * height;
    }

    public static double getVolume(double x, double y, double z) {
        return x * y * z;
    }
}
