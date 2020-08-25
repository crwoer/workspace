package works;

public class Day_4 {
    public static void main(String[] args) {
//        第一题 打印1-n的偶数
        System.out.println("==============");
        printEven(20);
//        第二题 封装函数求1-n的总和
        System.out.println("==============");
        int a = getSum(100);
        System.out.println("总和为：" + a);
//        第三题 矩形的周长和面积
        System.out.println("==============");
        int length = 20;
        int width = 8;
        int zc = getPerimeter(length, width);
        int area = getArea(length, width);
        System.out.println("长方形周长：" + zc);
        System.out.println("长方形面积：" + area);
//        第四题 将传递的数字转换为对应的字符
        System.out.println("==============");
//        getChar();
    }


    public static void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


    public static int getPerimeter(int length, int width) {
        int perimeter = (length + width) * 2;
        return perimeter;
    }

    public static int getArea(int length, int width) {
        int area = length * width;
        return area;
    }


//    public static char getChar(){
//
//    }
}
