package Exercise1;

import java.util.Scanner;

/**
 * 需求: 键盘录入星期数, 输出工作日 休息日.
 * (1~5)工作日,(6~7)休息日
 * 运用 case穿透方式和JDK12之后的新特性.
 */
public class SwitchTest2 {
    public static void main(String[] args) {
        // 1. 键盘录入一个整数
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入星期数: ");
        int week = sc1.nextInt();

        // 2. 利用switch语句进行选择,--运用case穿透方式
        /*switch (week){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("工作日");
                break;
            case 6 :
            case 7 :
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个选项");
                break;
        }*/

        // 2. 利用switch语句进行选择,--运用case穿透方式,再简化.
        /*switch (week){
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            case 6, 7 :
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个选项");
                break;
        }*/

        // 2. 利用switch语句进行选择,--运用case穿透方式和JDK12之后的新特性简化.
        switch (week){
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("没有这个选项");
        }
    }
}
