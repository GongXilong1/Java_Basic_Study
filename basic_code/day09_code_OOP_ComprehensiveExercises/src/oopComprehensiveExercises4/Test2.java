package oopComprehensiveExercises4;

import java.util.Scanner;

/**
 * 键盘录入的两套体系不能混用
 * 弊端: 先用nextInt,再用nextLine,会导致下面的nextLine接收不到数据,
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        int number1 = sc1.nextInt();
        System.out.println(number1);

        System.out.println("请输入一个字符串: ");
        String line1 = sc1.nextLine();
        System.out.println(line1);
        // 运行结果:
        /*请输入一个整数:
        125
        125
        请输入一个字符串:


        Process finished with exit code 0*/

        // 运行结果:
        /*请输入一个整数:
        123 789
        123
        请输入一个字符串:
        789

        Process finished with exit code 0*/

    }
}
