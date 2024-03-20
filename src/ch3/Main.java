package ch3;


public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getRadius());
        c.setRadius(5.0);
        System.out.println(c.getRadius());
    }
}
class Circle {
    private double radius;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        radius = r;

    }


    public Circle(){
        radius = 1.0;
    }
}