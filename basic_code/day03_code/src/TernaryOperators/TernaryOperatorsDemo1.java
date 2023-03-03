package TernaryOperators;
/**
 * 演示 三元运算符 的使用
 *
 * 需求: 使用三元运算符获取两个数的较大值.
 * */
public class TernaryOperatorsDemo1 {
    public static void main(String[] args) {
        // 分析: 1. 定义两个变量记录两个整数
        int number1 = 10;
        int number2 = 20;

        // 2. 使用三元运算符获取两个整数的较大值
        // 格式: 关系表达式 ? 表达式1 : 表达式2;
        // 整个三元运算符的结果必须要被使用
        int maxNumber = number1 > number2 ? number1 : number2;
        System.out.println(maxNumber);
        System.out.println(number1 > number2 ? number1 : number2);



    }
}
