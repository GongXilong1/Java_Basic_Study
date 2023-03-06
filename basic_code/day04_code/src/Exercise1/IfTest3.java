package Exercise1;

import java.util.Scanner;

/**
 * 需求: 键盘录入一个整数, 表示身上的钱,
 * 如果大于等于 100元,就吃网红餐厅,
 * 否则,就吃经济实惠的沙县小吃.
 */
public class IfTest3 {
    public static void main(String[] args) {
        // 1. 键盘录入一个整数,表示身上的钱
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请录入身上的钱: ");
        int money = sc1.nextInt();

        // 2. 对钱进行判断(二选一)
        if(money >= 100 ){
            System.out.println("吃网红餐厅");
        }
        else{
            System.out.println("吃沙县小吃");
        }
    }
}
