package MethodDemo;

/**
 * 目标: 掌握在带返回值方法的定义和调用格式
 */
public class MethodDemo5 {
    public static void main(String[] args) {
        // 直接调用
        // getSum(10, 20, 30);

        // 赋值调用
        // int sum0 = getSum(10, 20, 30);
        // System.out.println(sum0);

        // 输出调用
        // System.out.println(getSum(10, 20, 30));


        // 先计算每一个季度的营业额--赋值调用的方式
        int sum1 = getSum(10, 20, 30);
        int sum2 = getSum(20, 30, 40);
        int sum3 = getSum(20, 30, 40);
        int sum4 = getSum(20, 30, 40);
        // 求全年的总营业额
        int yearSum = sum1 + sum2 + sum3 + sum4;
        System.out.println(yearSum);
    }

    public static int getSum(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;  // 返回给方法的调用处
    }
}
