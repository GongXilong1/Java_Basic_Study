package Exercise1;

import java.util.Scanner;

/**
 * 延伸练习:
 * 在实际开发中, 多种情况判断时, 会用到 if的第三种格式:
 * 需求:
 * 商场都会有 VIP的会员制, 根据不同的消费金额和会员等级有不同的折扣.
 * 键盘录入商品总价和会员级别,并计算出实际支付的钱.
 * 非会员消费满 2000元即可打 9.3折,会员消费满 1000元后按照以下等级打折.
 * 会员 1级: 打9折.
 * 会员 2级: 打8折.
 * 会员 3级: 打7折.
 * 会员消费低于 1000元时不打折.
 * 非会员消费低于 2000元时不打折.
 */
public class IfTest8 {
    public static void main(String[] args) {
        // 1. 键盘录入消费金额
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入商品总价: ");
        int totalPrice = sc1.nextInt();

        // 2. 判断
        if (totalPrice >= 1000){
            // 3. 键盘录入会员等级
            Scanner sc2 = new Scanner(System.in);
            System.out.println("请输入会员等级(非会员请输入0): ");
            int membershipLevel = sc2.nextInt();

            if (membershipLevel == 1){
                System.out.println("商品总价打9折,实际支付的钱数为: " + (totalPrice * 0.9));
            } else if (membershipLevel == 2) {
                System.out.println("商品总价打8折,实际支付的钱数为: " + (totalPrice * 0.8));
            } else if (membershipLevel == 3) {
                System.out.println("商品总价打7折,实际支付的钱数为: " + (totalPrice * 0.7));
            } else {
                if (totalPrice >= 2000){
                    System.out.println("商品总价打9.3折,实际支付的钱数为: " + (totalPrice * 0.93));
                } else {
                    System.out.println("消费金额不满足非会员打折条件,实际支付的钱数为: " + totalPrice);
                }
            }
        } else {
            System.out.println("消费金额不满足折扣条件,实际支付的钱数为: " + totalPrice);
        }

    }
}
