package ch2;

/**
 * 常量的声明和使用
 */
public class Main2 {
    public static void main(String[] args) {
        Main2 obj = new Main2();
        obj.run();
    }
    void run(){
        final double PI = 3.1415;
        final Circle C1 = new Circle();
        C1.radius = 10;
        C1.radius = 20;
        //C1 = new Circle();


    }

}
