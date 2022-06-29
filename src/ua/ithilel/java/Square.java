package ua.ithilel.java;

public class Square {

    int side;
    int perimeter;
    int sqar;
    boolean b;
    String ap = "Perimeter = Area: ";

    public void printInfo() {

        perimeter = 4 * side;
        sqar = side * side;
        boolean b = (sqar == perimeter);

        System.out.println("Side of the square: " + side);
        System.out.println("Area of the square: " + sqar);
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println(ap + b);
    }
}
