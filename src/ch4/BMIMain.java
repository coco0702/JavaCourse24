package ch4;

public class BMIMain {
    public static void main(String[] args) {
        BMI zhangsan = new BMI("张三",1.78,145);
        BMI lisi = new BMI("李四",1.68,85);
        System.out.println(zhangsan.toString());
        System.out.println(lisi.toString());
        lisi.highLevel = 40.0;
        System.out.println(zhangsan.toString());
        System.out.println(lisi.toString());
        System.out.println(2);
        System.out.println(2.0);
        System.out.println(false);
        System.out.println();
    }
}
