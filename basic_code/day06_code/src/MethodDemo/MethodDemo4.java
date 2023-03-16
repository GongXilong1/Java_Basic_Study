package MethodDemo;

/**
 * 目标:掌握带参数方法定义的格式和调用的格式
 */
public class MethodDemo4 {
    public static void main(String[] args) {
        getSum(20,50);
    }

    public static void getSum(int number1, int number2){
        int result = number1 + number2;
        System.out.println(result);
    }
}
