package ch4;

import ch2.Circle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("R0",4.0,1.0);
        Rectangle r2 = new Rectangle("R2");
        System.out.println(r1.toString());
        r1.init("R1",10.0,5.0);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
