package Exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * 需求: 程序自动生成一个 1~100 之间的随机数字,使用程序实现猜出这个数字是多少?
 * 注意事项: 生成随机数的代码: int number1 = r1.nextInt(100) + 1; 是不能写在循环内部的,否则每一次都是产生不同的随机数.
 * 扩展需求: 加一个保底机制,三次猜不中后直接提示猜中了.
 */
public class LoopTest7 {
    public static void main(String[] args) {

        int count =0;  // 设置计数器来统计猜的次数

        // 1. 生成一个 1~100 之间的随机数字
        Random r1 = new Random();
        int number1 = r1.nextInt(100) + 1;
        // System.out.println(number1);

        // 2. 猜这个数字
        Scanner sc1 = new Scanner(System.in);

        while(true){
            System.out.println("请输入你要猜的数字: ");
            int guessedNumber = sc1.nextInt();

            count++;  // 猜一次count值自增一次
            if (count == 3){
                System.out.println("猜对了");  // 猜三次之后直接提示猜中了
                break;  // 直接用break跳出循环,不再执行后续代码.
            }

            // 3. 判断两个数字给出不同的提示
            if (guessedNumber > number1){
                System.out.println("猜大了");
            } else if (guessedNumber < number1) {
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
                break;  // 猜对的时候就不需要再循环了,所以用break跳出循环.
            }
        }
    }
}
