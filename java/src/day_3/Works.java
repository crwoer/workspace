package day_3;

public class Works {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
    }

    //    第一题
    public static void test1() {
//        1. 定义一个学生的考试成绩,类型为int,变量名为score
//        2. 使用if语句的第三种格式判断考试成绩属于哪个范围
//        3. 如果score小于0 或者 score大于100,输出"成绩有误"
//        4. 如果score大于等于90并且小于等于100,输出"优秀"
//        5. 如果score大于等于80并且小于90,输出"好"
//        6. 如果score大于等于70并且小于80,输出"良"
//        7. 如果score大于等于60并且小于70,输出"及格"
//        8. 如果score小于60,输出"不及格
        int score = 30;
        if (score < 0 || score > 100) {
            System.out.println("成绩有误");
        } else if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

    //    第二题
    public static void test2() {
//        1. 定义一个变量sum,用来记录奇数的总和
//        2. 使用for循环得到1到100之间的每个数字
//        3. 在for循环里面,使用if判断这个数字是否为奇数
//        4. 如果为奇数,就将这个数字与sum相加
//        5. for循环结束后,打印sum的值

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("1-100的奇数累加和：" + sum);

    }

    //    第三题
    public static void test3() {
//        1. 定义一个变量sum,用于累加求和
//        2. 使用for循环遍历1到100之间的每个数字
//        3. 在循环中判断该数字是否既是3的倍数又是5的倍数
//        4. 如果满足条件,对该数字进行累加求和,并打印这个数字
//        5. 循环结束后,打印求和变量sum

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("1-100之间既是3的倍数又是5的倍数之和：" + sum);
    }

    //    第四题
    public static void test4() {
//        1.定义初始化变量i=1
//        2.使用while循环,条件为i<=10进入循环
//        3.在循环内输出i的值
//        4.在循环内编写步进表达式为i++

        int i = 1;
        while (i <= 10) {
            System.out.println("i:" + i);
            i++;
        }
    }

    //    第五题
    public static void test5() {
//        1. 使用for循环,初始化变量为i=1
//        2. for循环条件为:i<=15进入循环
//        3. for循环步进表达式为i++
//        4. 在for循环里面,如果i是3的倍数,使用continue跳过
//        5. 在for循环里面,如果i不是3的倍数,打印

        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    //    第六题
    public static void test6() {
//        1. 使用for循环获取100-999中的每个数字
//        2. 在for循环中获取这个数字的百位
//        3. 在for循环中获取这个数字的十位
//        4. 在for循环中获取这个数字的个位
//        5. 如果个位的立方 + 十位的立方 + 百位的立方等于这个数本身,则打印这个水仙花数字

        for (int i = 100; i <= 999; i++) {
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100;
            if ((g * g * g + s * s * s + b * b * b) == i) {
                System.out.println(i);
            }
        }
    }

    //    第七题
    public static void test7() {
        int count = 0;
        for (int i = 1; i <= 60; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
                if (count == 5) {
                    count = 0;
                    System.out.println();
                }
            }
        }
    }

    //    第八题
    public static void test8() {
        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 1:
                    System.out.println("1:水瓶");
                    break;
                case 2:
                    System.out.println("2:双鱼");
                    break;
                case 3:
                    System.out.println("3:白羊");
                    break;
                case 4:
                    System.out.println("4:金牛");
                    break;
                case 5:
                    System.out.println("5:双子");
                    break;
                case 6:
                    System.out.println("6:巨蟹");
                    break;
                case 7:
                    System.out.println("7:狮子");
                    break;
                case 8:
                    System.out.println("8:处女");
                    break;
                case 9:
                    System.out.println("9:天秤");
                    break;
                case 10:
                    System.out.println("10:天蝎");
                    break;
                case 11:
                    System.out.println("11:射手");
                    break;
                case 12:
                    System.out.println("12:摩羯");
                    break;
            }
        }
    }

//    第九题
    public static void test9(){
        for(int i = 1; i <= 7; i++){
            for(int x = 1; x <= 7; x++){
                if(x == i || x + i == 8){
                    System.out.print("O");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}



