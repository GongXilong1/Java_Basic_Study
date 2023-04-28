package stringdemo;

import java.util.Scanner;

/**
 * 案例需求: 键盘录入一个字符串，使用程序实现在控制台遍历该字符串.
 */
public class StringDemo5 {
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str1 = sc1.next();

        // 2. 遍历字符串
        for (int i = 0; i < str1.length(); i++) {
            // i依次表示字符串的索引
            char char1 = str1.charAt(i);
            System.out.println(char1);
        }
    }
}
