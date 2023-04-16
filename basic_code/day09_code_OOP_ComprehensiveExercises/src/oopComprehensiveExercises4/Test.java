package oopComprehensiveExercises4;

import java.util.Scanner;

/**
 * 练习键盘录入
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 键盘录入第一套体系:
         * nextInt();   接收整数
         * nextDouble();接收小数
         * next();      接收字符串 "abc"
         * --特点: 遇到空格,制表符(/t),回车这些符号就停止接收.
         * ******************
         * 键盘录入第二套体系:
         * nextLine();  接收字符串
         * --特点: 可以接收空格,制表符,遇到回车才停止接收数据.
         */


        /*Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        int number1 = sc1.nextInt();
        System.out.println(number1);

        System.out.println("请输入第二个整数：");
        int number2 = sc1.nextInt();
        System.out.println(number2);*/
        // 运行结果:
        /*请输入一个整数:
        123 123
        123
        请输入第二个整数：
        123*/

        /*Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第一个字符串: ");
        String str1 = sc2.next();
        System.out.println(str1);
        System.out.println("请输入第二个字符串: ");
        String str2 = sc2.next();
        System.out.println(str2);*/
        // 运行结果:
        /*请输入第一个字符串:
        abc def
        abc
        请输入第二个字符串:
        def*/

        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入第一个字符串: ");
        String line1 = sc3.nextLine();
        System.out.println(line1);
        System.out.println("请输入第二个字符串: ");
        String line2 = sc3.nextLine();
        System.out.println(line2);
        // 运行结果:
        /*请输入第一个字符串:
        abc def
        abc def
        请输入第二个字符串:
        123 789
        123 789*/
    }
}
