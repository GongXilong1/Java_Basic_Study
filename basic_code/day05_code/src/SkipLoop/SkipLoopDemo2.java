package SkipLoop;

/**
 * 演示 程序运行中结束整个 for循环
 */
public class SkipLoopDemo2 {
    public static void main(String[] args) {
        // 结束整个循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第 " + i + "个包子");
            if (i == 3){
                break;  // 结束整个循环(代码会跳到循环外,执行其他的代码)
            }
        }
    }
}
