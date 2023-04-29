package stringdemo;

import java.util.Scanner;

/**
 * 金额转换案例需求:
 * 把 2135变成：零佰零拾零万贰仟壹佰叁拾伍元
 * 把 789变成：零佰零拾零万零仟柒佰捌拾玖元
 */
public class StringDemo9 {
    public static void main(String[] args) {
        // 1. 键盘录入金额
        Scanner sc1 = new Scanner(System.in);
        int money;

        while (true) {
            System.out.println("请输入一个金额: ");
            money = sc1.nextInt();
            if (money >=0 && money <= 9999999){
                break;
            }else {
                System.out.println("金额无效!");
            }
        }
        System.out.println(money);

        // 2.
    }

    /**
     * 定义一个方法把数字变成大写的中文
     * 1.
     */
    public static String getCapitalNumber(int number1){
        // 定义数组,
    }

}
