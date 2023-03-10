package Exercise1;

import java.util.Scanner;

/**
 * 需求: 键盘录入一个正整数 x,判断该整数是否为一个质数.
 * 质数: 质数是指在大于 1的自然数中，除了 1和它本身以外不再有其他因数的自然数。
 */
public class LoopTest3 {
    public static void main(String[] args) {
        // 1. 键盘录入
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个正整数: ");
        int number = sc1.nextInt();

        // 定义一个变量,表示标记,标记number是否为一个质数
        boolean numberFlag = true;  // 表示number最初是一个质数.

        // 2. 判断是否为质数
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                numberFlag = false;
                // System.out.println(number + "不是一个质数");
                break;
            }
        }

        // 只有当这个循环结束了,表示这个范围之内所有的数字都判断完毕了,此时才能断定number是一个质数.
        if (numberFlag){
            System.out.println(number + "是一个质数");
        }else {
            System.out.println(number + "不是一个质数");
        }
    }
}
