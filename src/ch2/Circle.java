package ch2;

public class Circle {
    double  radius;
    //成员变量radius的getter方法
    public double getRadius() {
        return radius;
    }
    //成员变量radius的setter方法
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return radius * radius * 3.1415;
    }

}
