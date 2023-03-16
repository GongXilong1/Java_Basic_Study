package MethodDemo;

/**
 * 目标: 利用方法最简单的格式完成当前练习
 * 需求: 在方法里面要定义两个变量,并求和.
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        getSum();
    }
    public static void getSum(){
        int number1 = 10;
        int number2 = 20;

        int result = number1 + number2;
        System.out.println(result);
    }
}

