package Assignments;

/**
 * 定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
 */
public class AssignmentsSubject2 {
    public static void main(String[] args) {
        //调用
        // int maxNumber = getMaximum(12, 16, 25);
        int maxNumber2 = getMaximum1(12, 16, 25);
        System.out.println(maxNumber2);
    }
    // 实现方法一: 使用三元运算符
    public static int getMaximum(int a, int b, int c){
        int temp = a > b ? a : b;
        int maximum = temp > c ? temp : c;
        return maximum;

    }

    // 实现方法二: 使用多分支if...else
    public static int getMaximum1(int a, int b, int c){

        if (a > b){
            if (a > c){
                return a;
            }else {
                return c;
            }
        }else {
            if (b > c){
                return b;
            }else {
                return c;
            }
        }
    }
}
