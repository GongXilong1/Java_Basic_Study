package Exercise1;

import java.util.Scanner;

/**
 * 需求: 键盘录入两个数字,表示一个范围.
 * 统计这个范围中,既能被3整除,又能被5整除的数字有多少个.
 */
public class ForTest5 {
    public static void main(String[] args) {
        // 1. 键盘录入两个数字表示范围
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一个整数,表示范围的开始: ");
        int startNumber = sc1.nextInt();
        System.out.println("请输入第二个整数,表示范围的结束: ");
        int endNumber = sc1.nextInt();

        // 定义统计变量
        int count = 0;

        // 2. 利用循环获取这个范围中的每个数字
        for(int i = startNumber; i <= endNumber; i++){
            // 3. 对每一个数字进行判断,再统计有多少个满足要求的数字.
            if (i % 3 == 0 && i % 5 == 0){
                count++; // 在if中每次满足判断中的条件,count变量就加1.
            }
        }
        System.out.println("在此范围中共有" + count + "个数字满足条件");
    }
}
