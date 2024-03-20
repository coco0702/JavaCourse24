package ch2;

/**
 * 本例展示基本类型与引用类型在赋值或传参时的差异。
 * 方法的形参是基本类型与引用类型时，在传参时的差异，基本类型的形参是传值，而引用类型的形参是传引用。
 */
public class Main1 {
    public static void main(String[] args) {
        Main1 obj = new Main1();
        obj.runDemo();

    }

    void runDemo(){
        int num = 10;
        String s = "Hello";
        Circle c1 = new Circle();
        c1.radius = 10;
        bigger(10);
        bigger(s);
        bigger(c1);
        System.out.println(num);
        System.out.println(s);
        System.out.println(c1.getArea());
    }
    void bigger(int param){
        param++;
        System.out.println(param);
    }
    void bigger(String s){
        s+="!";
        System.out.println(s);
    }
    void bigger(Circle circle){
        circle.radius++;
        System.out.println(circle.getArea());
    }
}
