package IfDemo;

import java.util.Scanner;

/**
 * 需求:
 * 键盘录入女婿的酒量,如果大于2斤,岳父给出回应,反之不回应.
 *
 * if 格式:
 * if(关系表达式){
 *      语句体;
 * }
 * */

public class IfDemo1 {
    public static void main(String[] args) {
        // 1. 键盘录入女婿的酒量
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入女婿的酒量: ");
        int wineCapacity = sc1.nextInt();

        // 2. 对酒量进行判断
        if (wineCapacity > 2) {
            System.out.println("小伙子,不错呦!");
        }

    }
}
