package Exercise1;

import java.util.Scanner;

/**
 * 逻辑运算符的综合练习
 *
 * 需求:
 * 数字6是一个真正伟大的数字,键盘录入两个整数,
 * 如果其中一个为 6, 最终的结果输出为 true,
 * 如果它们的和为 6 的倍数, 最终结果输出 true,
 * 其他情况都是 false.
 * */
public class LogicalOperatorsTest1 {
    public static void main(String[] args) {
        // 分析:
        // 1. 键盘录入两个整数,变量a,变量b.
        // 2. a == 6 || b == 6 || (a + b) % 6 ==0;
        // 满足上述三个条件其中一个就可以输出 true

        // 键盘录入两个整数
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一个整数: ");
        int number1 = sc1.nextInt();
        System.out.println("请输入第二个整数: ");
        int number2 = sc1.nextInt();

        // 以短路逻辑运算符取连接三个判断
        boolean result1 = number1 == 6 || number2 == 6 || (number1 + number2) % 6 ==0;

        System.out.println(result1);
    }
}

