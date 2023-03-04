package Exercise1;

import java.util.Scanner;

/**
 * 需求: 动物园里有两只老虎,体重分别为通过键盘录入获得,
 * 请用程序实现判断两只老虎的体重是否相同.
 * */
public class TernaryOperatorsTest1 {
    public static void main(String[] args) {
        // 1. 键盘录入两只老虎的体重
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重: ");
        int tigerWeight1 = sc1.nextInt();
        System.out.println("请输入第二只老虎的体重: ");
        int tigerWeight2 = sc1.nextInt();

        // 2. 比较--格式: 关系表达式 ? 表达式1 : 表达式2;
        String result1 = tigerWeight1 == tigerWeight2 ? "相同" : "不同";
        System.out.println(result1);


    }
}
