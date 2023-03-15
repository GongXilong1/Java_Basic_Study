package Exercise1;

import java.util.Random;

/**
 * 需求:
 * 随机数范围: 1~100
 */
public class LoopTest6 {
    public static void main(String[] args) {

        // 生成任意数到任意数之间的随机数, 比如: 7~15
        // 1. 让这个范围头尾都减去一个值,让这个范围从0开始, -7  0~8
        // 2. 尾巴+1,  8 + 1 = 9
        // 3. 最终的结果,再加上第一步减去的值.

        /*Random r1 = new Random();
        int number = r1.nextInt(9) + 7;  // 相当于0~8统一+7
        System.out.println(number);*/

        Random r1 = new Random();
        int number = r1.nextInt(100) + 1;  // 相当于0~99统一+1
        System.out.println(number);
    }
}
