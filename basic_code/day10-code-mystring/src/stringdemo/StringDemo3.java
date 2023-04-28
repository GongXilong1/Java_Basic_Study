package stringdemo;

import java.util.Scanner;

/**
 * 扩展内容
 */
public class StringDemo3 {
    public static void main(String[] args) {
        // 1. 假设我现在用键盘录入一个abc
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");  // 这里输入abc
        String str1 = sc1.next();   // 键盘录入得到的字符串是new出来的(通过查看java核心代码得知)

        // 2. 代码中再定义一个字符串abc
        String str2 = "abc";

        // 3. 用==号比较,这两者能一样吗?
        System.out.println(str1 == str2);  // false

        // NOTE 结论:以后只要想比较字符串的内容,就必须要用String里面的方法.

    }
}
