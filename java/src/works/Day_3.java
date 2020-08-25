package works;

public class Day_3 {
    public static void main(String[] args) {
//        第一题 考试成绩分类
        System.out.println("================");
        score(65);
//        第二题 奇数累加和
        System.out.println("================");
        sumFn();
//        第三题 既是3的倍数又是5的倍数之和
        System.out.println("================");
        sumFn1();
//        第四题 使用while循环输出1-10 的数
        System.out.println("================");
        whileFn();
//        第五题 使用continue方法输出不是3的倍数的数
        System.out.println("================");
        continueFn();
//        第六题 获取3位数的水仙花数
        System.out.println("================");
        shuXianHua();
//        第七题 打印1-60的所有偶数，并且5个一行
        System.out.println("================");
        oShu();
//        第八题 打印星座信息
        System.out.println("================");
        xingZuo();
//        第九题 打印『X』对称图形
        System.out.println("================");
        xFun();
    }

    public static void score(int scoreNum) {
        if (scoreNum < 0 && scoreNum > 100) {
            System.out.println("成绩有误");
        } else if (scoreNum >= 90 && scoreNum <= 100) {
            System.out.println("优秀");
        } else if (scoreNum >= 80 && scoreNum < 90) {
            System.out.println("好");
        } else if (scoreNum >= 70 && scoreNum < 80) {
            System.out.println("良");
        } else if (scoreNum >= 60 && scoreNum < 70) {
            System.out.println("及格");
        } else if (scoreNum < 60) {
            System.out.println("不及格");
        }
    }


    public static void sumFn() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("1-100的奇数累加和：" + sum);
    }


    public static void sumFn1() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("1-100之间既是3的倍数又是5的倍数的数字之和：" + sum);
    }


    public static void whileFn() {
        int i = 1;
        while (i <= 10) {
            System.out.println("i:" + i);
            i++;
        }
    }


    public static void continueFn() {
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }


    public static void shuXianHua() {
        int b = 0;
        int s = 0;
        int g = 0;
        for (int i = 100; i <= 999; i++) {
            b = i / 100;
            s = i / 10 % 10;
            g = i % 10;
            if ((b * b * b + s * s * s + g * g * g) == i) {
                System.out.println(i);
            }
        }
    }


    public static void oShu() {
        int count = 0;
        String str;
        for (int i = 1; i <= 60; i++) {
            if (i % 2 == 0) {
                str = i + " ";
                count++;
                if (count != 0 && count % 5 == 0) {
                    str += "\n";
                }
                System.out.print(str);
            }
        }
    }


    public static void xingZuo() {
        String[] arr = {"水瓶", "双鱼", "白羊", "金牛", "双子", "巨蟹", "狮子", "处女", "天秤", "天蝎", "射手", "摩羯"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ":" + arr[i]);
        }
    }


    public static void xFun() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == j || i + j == 8) {
                    System.out.print("O");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


}
