package ch2;

public class Main3 {
    public static void main(String[] args) {
        Main3 obj = new Main3();
        obj.run();
    }
    void run(){
       boolean b = true;
       boolean b1 = false;
        System.out.println(b && (1>0));
        System.out.println(b || b1);
        System.out.println(!b1);
        //System.out.println(1 && 0);
        System.out.println(1 & 2);
        System.out.println(1 | 2);
        System.out.println(1 ^ 2);
    }

    /**
     * 整除与求余
     */
    void basic(){
        int x = 12345 / 67; // 184
        System.out.println(x);
        int y = 12345 % 67; // 12345÷67的余数是17
        System.out.println(y);

    }

    /**
     * 超出数据类型的表示范围就溢出
     */
    void overflow(){
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println(sum); // -2147483641
        System.out.println(1/0);
    }
    void leftShift(){
        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
        int b = n << 2;  // 00000000 00000000 00000000 00011100 = 28
        int c = n << 28; // 01110000 00000000 00000000 00000000 = 1879048192
        int d = n << 29; // 11100000 00000000 00000000 00000000 = -536870912

    }
    void rightShift(){
        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = n >> 1;  // 00000000 00000000 00000000 00000011 = 3
        int b = n >> 2;  // 00000000 00000000 00000000 00000001 = 1
        int c = n >> 3;  // 00000000 00000000 00000000 00000000 = 0
        int d = n >> 26;  // 00000000 00000000 00000000 00000000 = 0
    }
    void negativeShift(){
        //最高位的1不动
        int n = -536870912;
        System.out.println(Integer.toBinaryString(n));
        int a = n >> 1;  // 11110000 00000000 00000000 00000000 = -268435456
        int b = n >> 2;  // 11111000 00000000 00000000 00000000 = -134217728
        int c = n >> 28; // 11111111 11111111 11111111 11111110 = -2
        int d = n >> 29; // 11111111 11111111 11111111 11111111 = -1
    }

    /**
     * 无符号右移 >>> ，不管符号位，右移后高位总是补0，因此，对一个负数进行>>>右移，它会变成正数，原因是最高位的1变成了0：
     */
    void allRightShift(){
        int n = -536870912;
        int a = n >>> 1;  // 01110000 00000000 00000000 00000000 = 1879048192
        int b = n >>> 2;  // 00111000 00000000 00000000 00000000 = 939524096
        int c = n >>> 29; // 00000000 00000000 00000000 00000111 = 7
        int d = n >>> 31; // 00000000 00000000 00000000 00000001 = 1
    }
    void  bitwise(){
        int i = 167776589; // 00001010 00000000 00010001 01001101
        int n = 167776512; // 00001010 00000000 00010001 00000000
        System.out.println(i & n); // 167776512
    }
}
