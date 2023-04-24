package apidemo;

import java.util.Scanner;

/**
 * 演示通过API文档学习Scanner类
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        // 1. 创建对象
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个小数: ");
        // 2. 接收一个小数
        double result1 = sc1.nextDouble();
        // 3. 输出打印
        System.out.println(result1);

    }
}
