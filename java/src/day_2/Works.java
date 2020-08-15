package day_2;

public class Works {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        printNum();
        printString();
        int x = 100;
        int y = 200;
        add(x,y);
        sub(x,y);
//        mul(x,y);
//        div(x,y);
//        remain(x,y);
    }

    //  第一题
    public static void test1() {
        /*
         * 1. 定义类 Test1
         * 2. 定义int类型变量保存长方形的长
         * 3. 定义int类型变量保存长方形的宽
         * 4. 定义int类型变量保存长方形的面积,面积=长*宽
         * 5. 定义int类型变量保存长方形的周长,周长=(长+宽)*2
         * 6. 使用输出语句输出面积和周长
         * */
        int l = 20;
        int w = 10;
        int area = l * w;
        int perimeter = (l + w) * 2;
        System.out.println("长方形的面积为：" + area + ",周长为：" + perimeter);
    }

    //  第二题
    public static void test2() {
        /*
         * 1. 定义类 Test2
         * 2. 定义 main方法
         * 3. 定义两个byte类型变量b1,b2,并分别赋值为10和20
         * 4. 定义变量b3,保存b1和b2的和,并输出.
         * 5. 定义两个short类型变量s1,s2,并分别赋值为1000和2000
         * 6. 定义变量s3,保存s1和s2的和,并输出
         * */

        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2;
        System.out.println("byte类型b1和b2的和为：" + b3);

        short s1 = 1000;
        short s2 = 2000;
        int s3 = s1 + s2;
        System.out.println("short类型s1和s2的和为：" + s3);
    }

    //  第三题
    public static void test3() {
/*      1. 定义类 Test2
        2. 定义 main方法
        3. 定义 int类型变量i1 和 long类型变量l1
        4. 定义变量add,保存i1和l1的和,并输出.
        5. 定义 long类型变量l2 和 float类型变量f2
        6. 定义变量add2,保存l2和f2的和,并输出.
        7. 定义 int类型变量i3 和 double类型变量d3
        8. 定义变量add3,保存i3和d3的和,并输出.
        */

        int i1 = 100;
        long l1 = 200;
        long add = i1 + l1;
        System.out.println("add 的值：" + add);
        long l2 = 1000000;
        float f2 = (float) 0.44;
        float add2 = l2 + f2;
        System.out.println("add2的值：" + add2);
        int i3 = 1000000;
        double d3 = 0.45;
        double add3 = i3 + d3;
        System.out.println("add3的值：" + add3);
    }

    //  第四题
    public static void test4() {
//        1. 定义类 Test4
//        2. 定义 main方法
//        3. 定义两个int类型变量a1和a2,分别赋值10,11,判断变量是否为偶数,拼接输出结果
//        4. 定义两个int类型变量b1和b2,分别赋值12,13,判断变量是否为奇数,拼接输出结果

        int a1 = 10;
        int a2 = 11;
        boolean isa1 = a1 % 2 == 0;
        boolean isa2 = a2 % 2 == 0;
        int b1 = 12;
        int b2 = 13;
        boolean isb1 = b1 % 2 != 0;
        boolean isb2 = b2 % 2 != 0;
        System.out.println("10是偶数？" + isa1);
        System.out.println("11是偶数？" + isa2);
        System.out.println("12是奇数？" + isb1);
        System.out.println("13是奇数？" + isb2);
    }

    //  第五题
    public static void printNum() {
//        1. 定义类 Test5
//        2. 定义 main方法
//        3. 定义方法printNum,在main方法中调用printNum方法
//        4. printNum方法中,定义float变量f1赋值12345.01
//        5. printNum方法中,定义float变量f2赋值12345.00
//        6. printNum方法中,定义float 变量 var1 , 使用三元运算符赋值,当f1大于等于f2时,赋值12456 ,当f1小于f2
//        赋值12456.02
//        7. printNum方法中,定义float 变量 var2 , 保存var1 与1024的和.
//        8. printNum方法中,同时输出var1,var2的值.

        float f1 = (float) 12345.01;
        float f2 = (float) 12345.00;
        float var1 = f1 > f2 ? (float) 12456 : (float) 12456.02;
        float var2 = var1 + 1024;
        System.out.println("var1的值为：" + var1 + " " + "var2的值为：" + var2);
    }

    //  第六题
    public static void printString() {
//        1. 定义类 Test6
//        2. 定义 main方法
//        3. 定义printString方法
//        4. printString方法中,定义int类型变量num,赋为任意整数值
//        5. printString方法中,定义String 类型变量str,通过三元运算符判断num为偶数,将"偶数"赋值给str,否则
//        将"奇数"赋值给str
//        6. printString方法中,输出拼接效果

        int num = 122;
        String str = num % 2 == 0 ? "偶数" : "奇数";
        System.out.println("num：" + num + "是" + str);
    }

//    第七题
    public static void add(int x,int y){
//        求和
        int addnum = x + y;
        System.out.println("x，y的和为："+ addnum);
    }
    public static void sub(int x,int y){

    }
}