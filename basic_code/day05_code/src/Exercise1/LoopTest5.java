package Exercise1;

import java.util.Random;

/**
 * 演示随机数的使用
 */
public class LoopTest5 {
    public static void main(String[] args) {
        // 获取随机数:0~10
        Random r1 = new Random();
        for (int i = 0; i < 100; i++) {
            int number = r1.nextInt(10);  // 10的含义是从0开始到9之间去生成10个随机数,包含0和9.
            // 小括号中书写的是生成随机数的范围,这个范围一定是从0开始的,到这个数-1结束.口诀:包头不包尾,包左不包右.
            System.out.println(number);
        }

    }
}
