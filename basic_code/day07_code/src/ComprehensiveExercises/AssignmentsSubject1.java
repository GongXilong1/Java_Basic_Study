package Assignments;

/**
 * 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
 */
public class AssignmentsSubject1 {
    public static void main(String[] args) {
        // 1. 调用方法
        double minimumNumber = getMinimum(2.1,5.7);
        // 2. 打印
        System.out.println(minimumNumber);
    }

    public static double getMinimum(double a, double b){
        double minimum = a < b ? a :b;
        return minimum;
    }
}
