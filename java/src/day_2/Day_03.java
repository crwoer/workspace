package day_2;

public class Day_03 {
    public static void main(String[] args){
//        方法的调用
        methodName();
        operator3();
        geshibai();
    }

    /*  方法的定义
     *
     *   修饰符 返回值类型 方法名（参数列表）{
     *       代码........
     *   }
     * */
    public static void methodName(){
        System.out.println();
    }



//    定义一个方法利用三元运算符求2个数的最大值。
//    求3个数的最大值
    public static void operator3(){
        int i = 250;
        int j = 120;
        int k = 60;

        int tmp = i > j ? i : j;
        int max = tmp > k ? tmp : k ;
        System.out.println(max);
    }



//    获取一个3位数的个为、十位、百位
    public static void geshibai(){
        int num = 432;
        int b = 0;
        int s = 0;
        int g = 0;

        b = num/100;
        s = num/10%10;
        g = num%10;

        System.out.println("这个数的个、十、百位数分别为：" + g + "_" + s + "_" + b);
    }
}
