package Exercise1;

/**
 * 朋友聚会的时候可能会玩一个游戏:逢 7过.
 * 游戏规则:从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过:过.
 * 需求:使用程序在控制台打印出1-100之间的满足逢七必过规则的数据.
 */
public class LoopTest1 {
    public static void main(String[] args) {
        // 分析: 个位有7和十位有7和7的倍数都要过.
        // 1. 得到1~100之间的每一个数字
        for (int i = 1; i <= 100; i++) {

            // 2. 判断每一个数字,如果符合规则,就打印过,如果不符合规则就打印真实的数字
            /*if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println("过");
            }else {
                System.out.println(i);
            }*/

            // 方式二
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}

