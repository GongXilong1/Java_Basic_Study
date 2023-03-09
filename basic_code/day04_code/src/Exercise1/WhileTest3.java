package Exercise1;

import java.util.Scanner;

/**
 * 需求: 通过键盘输入(给定)两个整数, 被除数和除数(都是正数,且不超过int的范围).
 * 将两个整数相除,要求不使用乘法,除法和%运算符.
 * 最后得到商和余数.--- 被除数 / 除数 = 商 ... 余数
 */
public class WhileTest3 {
    public static void main(String[] args) {
        // 1. 通过键盘输入获取被除数\除数
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入被除数: ");
        int dividedNumber = sc1.nextInt();
        System.out.println("请输入除数: ");
        int divisor = sc1.nextInt();
        int count = 0;          // 定义商的变量.

        // 原来的简单版本,直接给定数值.
//        int dividedNumber = 10;
//        int divisor = 3;
//        int count = 0;

        // 2. 循环-- NOTE 在循环中不断的用被除数去减除数,只要被除数是大于等于除数的,就一直循环
        while (dividedNumber >= divisor){
            dividedNumber = dividedNumber - divisor;
            count++;  // 每减一次count自增一次,count最后反映商的值
        }
        // 当循环结束之后,dividedNumber变量记录的就是余数,
        System.out.println("最后得到的余数是: " + dividedNumber);
        System.out.println("最后得到的商是: " + count);
    }
}
