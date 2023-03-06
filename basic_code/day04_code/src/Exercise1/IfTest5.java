package Exercise1;

import java.util.Scanner;

/**
 * 在实际开发中，电影院选座也会使用到 if判断,
 * 假设某影院售卖了100张票，票的序号为 1~100.
 * 其中奇数票号坐左侧，偶数票号坐右侧.
 * 键盘录入一个整数表示电影票的票号.
 * 根据不同情况，给出不同的提示:
 * 如果票号为奇数，那么打印坐左边,
 * 如果票号为偶数，那么打印坐右边.
 * */
public class IfTest5 {
    public static void main(String[] args) {
        // 1. 键盘录入一个整数表示电影票的票号
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请录入一个票号: ");
        int ticketNumber = sc1.nextInt();

        // 2. 真票验证: 只有票号在0~100之间,才是有效的票.--if的嵌套
        if(ticketNumber >= 0 && ticketNumber <= 100){
            // 3. 判断票号是奇数还是偶数
            if (ticketNumber % 2 == 1){
                System.out.println("请坐左边");
            }
            else{
                System.out.println("请坐右边");
            }
        }
        else{
            System.out.println("此票号无效");
        }
    }
}
