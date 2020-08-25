package works;

public class Day_2 {
    public static void main(String[] args) {
//        第一题  求长方形的面积与周长
        test1();
//        第二题  byte的求和与short的求和
        test2();
//        第三题  求不同类型的值相加的结构，类型转换
        test3();
//        第四题  判断奇偶性
        test4();
//        第五题
        printNum();
//        第六题  判断一个数的奇偶性
        printString();
//        第七题
        int x = 100;
        int y = 200;
        add(x, y);
        sub(x, y);
        mul(x, y);
        div(x, y);
        remain(x, y);
//        第八题
        test8();
    }

    public static void test1() {
        int height = 20;
        int width = 6;
        int mianJi = height * width;
        int zhouChang = (height + width) * 2;
        System.out.println("长方形的面积为：" + mianJi + "，周长为：" + zhouChang);
    }

    public static void test2() {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        System.out.println("byte类型b1与b2的和为：" + b3);
        short s1 = 1000;
        short s2 = 2000;
        short s3 = (short) (s1 + s2);
        System.out.println("short类型s1与s2的和为：" + s3);


    }


    public static void test3() {
        int i1 = 100;
        long l1 = 200;
        int add = i1 + (int) l1;
        System.out.println("add的值：" + add);
        long l2 = 1000000;
        float f2 = (float) 0.44;
        float add2 = l2 + f2;
        System.out.println("add2的值：" + add2);
        int i3 = 1000000;
        double d3 = 0.45;
        double add3 = i3 + d3;
        System.out.println("add3的值：" + add3);
    }


    public static void test4() {
        int a1 = 10;
        int a2 = 11;
        System.out.println(a1 + "是偶数？" + (a1 % 2 == 0 ? true : false) + "\n" + a2 + "是偶数？" + (a2 % 2 == 0 ? true : false));
        int b1 = 12;
        int b2 = 13;
        System.out.println(b1 + "是奇数？" + (b1 % 2 != 0 ? true : false) + "\n" + b2 + "是奇数？" + (b2 % 2 != 0 ? true : false));
    }


    public static void printNum() {
        float f1 = (float) 12345.01;
        float f2 = (float) 12345.00;
        float var1 = f1 >= f2 ? (float) 12456 : (float) 12356.02;
        float var2 = var1 + 1024;
        System.out.println("var1的值为：" + var1 + " var2的值为：" + var2);
    }

    public static void printString() {
        int num = 10;
        String str = num % 2 == 0 ? "偶数" : "奇数";
        System.out.println("num:" + num + "是" + str);
    }


    public static void add(int x, int y) {
        System.out.println("x,y的和为：" + (x + y));
    }

    public static void sub(int x, int y) {
        System.out.println("x,y的差为：" + (x - y));
    }

    public static void mul(int x, int y) {
        System.out.println("x,y的积为：" + x * y);
    }

    public static void div(int x, int y) {
        System.out.println("x,y的商为：" + x / y);
    }

    public static void remain(int x, int y) {
        System.out.println("x,y的余数为：" + x % y);
    }


    public static void test8() {
        char ch = 'J';
        ch = (char) (ch + 32);
        System.out.println(ch);
        char ch2 = 'a';
        ch2 -= 32;
        System.out.println(ch2);
        double d3 = 3.5;
        int i3 = 100;
        double sum3 = d3 + i3;
        System.out.println("sum3的值：" + sum3 + "\nsum3的整数部分：" + (int) sum3);
        double d4 = 7.00;
        int i4 = 50;
        int mul4 = (int) d4 * i4;
        System.out.println("mul4的整数部分：" + mul4);
    }
}
