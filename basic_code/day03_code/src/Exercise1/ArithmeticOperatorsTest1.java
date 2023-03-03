package Exercise1;
/**
 * 键盘录入和算术运算符综合练习
 * */
import java.util.Scanner;

public class ArithmeticOperatorsTest1 {
    public static void main(String[] args) {
        // 键盘录入一个三位数,获取其中的个位 十位 百位
        // 1. 键盘录入
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个三位数: ");
        int number1 = sc1.nextInt();  //定义变量number1接收数据

        // 2. 获取 个位 十位 百位
        // 个位: 数字 % 10
        // 十位: 数字 / 10 % 10
        // 百位: 数字 / 100 % 10
        int unitsDigit = number1 % 10;  //定义个位变量unitsDigit
        int tensDigit = number1 / 10 % 10;
        int hundredDigit = number1 / 100 % 10;
        System.out.println("个位数是: " + unitsDigit);
        System.out.println("十位数是: " + tensDigit);
        System.out.println("百位数是: " + hundredDigit);


    }
}


// NOTE 函数输入快捷键:
//  System.out.println(); 快捷键: sout + Enter
//  public static void main (String[] args) { }; 快捷键: psvm + Enter

