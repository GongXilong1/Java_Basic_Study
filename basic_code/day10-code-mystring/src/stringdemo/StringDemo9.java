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

        // 2. 得到money里面的每一位数字
        while(true){
            // 从右往左获取数据,因为右侧是数据的个位
            int unitsDigit = money % 10;
            // 去掉刚刚获取的数据
            money = money / 10;
            // 如果数字上的每一位全部获取到了,那么money记录的就是0,此时循环结束.
            if (money == 0){
                break;
            }
        }
    }

    /**
     * 定义一个方法把数字变成大写的中文
     * 1. 1--壹
     */
    public static String getCapitalNumber(int number1){  // 索引0和数组内的零对应上.
        // 定义数组,让数字跟大写的中文产生一个对应的关系
        String[] array1 = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        // 返回结果
        return array1[number1];
    }

}
