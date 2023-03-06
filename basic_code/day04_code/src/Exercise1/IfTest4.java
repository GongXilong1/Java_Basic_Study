package Exercise1;

import java.util.Scanner;

/**
 * 在实际开发中,如果要根据两种不同的情况来执行不同的代码,就需要用到if的第二种格式.
 * 需求:
 * 假设, 用户在超市实际购买,商品总价为: 600元.
 * 键盘录入一个整数表示用户实际支付的钱.
 * 如果付款大于等于600元,表示付款成功, 否则付款失败.
 */
public class IfTest4 {
    public static void main(String[] args) {
        // 1. 键盘录入一个整数表示用户实际支付的钱数.
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请录入一个整数表示实际支付的钱: ");
        int money = sc1.nextInt();

        // 2. 判断
        if(money >= 600){
            System.out.println("付款成功");
        }
        else{
            System.out.println("付款失败");

        }
    }
}
