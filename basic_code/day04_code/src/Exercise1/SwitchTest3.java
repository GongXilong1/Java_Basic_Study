package Exercise1;

import java.util.Scanner;

/**
 * 在实际开发中，如果我们需要在多种情况下选择其中一个，就可以使用 switch语句。
 * 当我们拨打了某些服务电话时，一般都会有按键选择。
 * 假设现在我们拨打了一个机票预定电话。电话中语音提示:
 * 1 机票查询
 * 2 机票预订
 * 3 机票改签
 * 4 退出服务
 * 其他按键也是退出服务。请使用 switch模拟该业务逻辑。
 */
public class SwitchTest3 {
    public static void main(String[] args) {
        // 1. 键盘录入一个整数表示我们的按键选择
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入您的选择: ");
        int chooseNumber = sc1.nextInt();

        // 2. 根据选择执行不同的代码
        /*switch (chooseNumber){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预订");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
        }*/

        // 2. 根据选择的按键数字执行不同的代码--代码优化
        switch (chooseNumber){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            // case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}
