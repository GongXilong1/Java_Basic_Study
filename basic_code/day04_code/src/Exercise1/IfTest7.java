package Exercise1;

import java.util.Scanner;

/**
 * 在实际开发中, 多种情况判断时, 会用到 if的第三种格式:
 * 需求:
 * 商场都会有 VIP的会员制, 根据不同的会员有不同的折扣.
 * 假设商品总价为 1000,
 * 键盘录入会员级别,并计算出实际支付的钱,
 * 会员 1级: 打9折.
 * 会员 2级: 打8折.
 * 会员 3级: 打7折.
 * 非会员: 不打折,要打也是打骨折.
 */
public class IfTest7 {
    public static void main(String[] args) {
        // 1. 定义变量记录总价
        int totalPrice = 1000;

        // 2. 键盘录入会员级别
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入会员等级: ");
        int membershipLevel = sc1.nextInt();

        // 2. 判断--方式1
//        if (membershipLevel >=1 && membershipLevel <= 3){
//            if (membershipLevel == 1 ){
//                System.out.println("商品总价打9折,实际支付的钱数为: " + (totalPrice * 0.9));
//            } else if (membershipLevel == 2) {
//                System.out.println("商品总价打8折,实际支付的钱数为: " + (totalPrice * 0.8));
//            } else {
//                System.out.println("商品总价打7折,实际支付的钱数为: " + (totalPrice * 0.7));
//            }
//        } else {
//            System.out.println("输入的会员等级无效,非会员不打折,实际支付的钱数为: " + totalPrice);
//        }

        // 判--方式2
        if (membershipLevel == 1){
            System.out.println("商品总价打9折,实际支付的钱数为: " + (totalPrice * 0.9));
        } else if (membershipLevel == 2){
            System.out.println("商品总价打8折,实际支付的钱数为: " + (totalPrice * 0.8));
        } else if (membershipLevel ==3 ) {
            System.out.println("商品总价打7折,实际支付的钱数为: " + (totalPrice * 0.7));
        } else {
            System.out.println("输入的会员等级无效,非会员不打折,实际支付的钱数为: " + totalPrice);
        }


    }
}


// 延伸练习: 非会员达到2000元即可打9.3折,会员是满足1000元后按照等级打折,详见IfTest8.
