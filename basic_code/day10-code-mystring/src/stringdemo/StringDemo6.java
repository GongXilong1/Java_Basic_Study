package stringdemo;

import java.util.Scanner;

/**
 * 案例需求: 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
 * 扩展:考虑其他字符的统计.
 */
public class StringDemo6 {
    public static void main(String[] args) {
        // 1. 键盘录入字符串
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入字符串: ");
        String str1 = sc1.next();

        // 2. 统计 -- 计数器思想
        // 定义三个计数器变量
        int capitalLettersCount = 0;
        int lowercaseLettersCount = 0;
        int numberCount = 0;
        int otherCharactersCount = 0;

        for (int i = 0; i < str1.length(); i++) {
            // i依次表示字符串中的每一个索引
            char char1 = str1.charAt(i);
            if (char1 >= 'a' && char1 <= 'z'){
                // char类型的变量在参与计算的时候自动类型提升为int -- 查询ASCII码表
                lowercaseLettersCount ++;
            }else if (char1 >= 'A' && char1 <= 'Z'){
                capitalLettersCount ++;
            }else if (char1 >= '0' && char1 <= '9'){  // 字符0到9在ASCII码表中对应的ASCII值为48-57.所以比较时要用'0',保持与char1的类型一致.
                numberCount ++;
            }else {
                otherCharactersCount ++;
            }
        }

        // 3. 输出打印
        System.out.println("小写字母字符有: " + lowercaseLettersCount + "个");
        System.out.println("大写字母字符有: " + capitalLettersCount + "个");
        System.out.println("数字字符有: " + numberCount + "个");
        System.out.println("其他字符有: " + otherCharactersCount + "个");
    }
}
