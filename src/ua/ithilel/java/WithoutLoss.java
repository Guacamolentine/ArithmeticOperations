package ua.ithilel.java;

public class WithoutLoss {

    public static void main(String[] args) {

        byte b = 77;
        short s = b;
        int i = s;
        long l = i;

        System.out.println("byte->short - " + s);
        System.out.println("short->int - " + i);
        System.out.println("int->long - " + l);

        int inum = 101;
        double dnum = inum;
        System.out.println("int->double - " + dnum);

        short vSh = -32768;
        float vFl = (float) vSh;
        double vDb = (double) vFl;
        System.out.println("short->float - " + vFl);
        System.out.println("float->double - " + vDb);

        char cH = 'A'; //65
        int iH = (int) cH; // cast from a char to int
        System.out.println("char->int - " + iH);
    }
}
