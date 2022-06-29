package ua.ithilel.java;

public class Main {

    public static void main(String[] args) {

        Square sideSquare = new Square();
        sideSquare.side = 2;
        System.out.println(sideSquare.side);
        sideSquare.printInfo();

        Square sideSquareOne = new Square();
        sideSquareOne.side = 4;
        System.out.println(sideSquareOne.side);
        sideSquareOne.printInfo();
    }
}
