package LoopDemo;

/**
 * 需求: 利用while循环打印 1~100.
 */
public class WhileDemo1 {
    public static void main(String[] args) {
        // 开始条件1 结束条件100
        int i = 1;
        while (i <=100){
            System.out.println(i);
            i++; // 每次打印i以后自增一次.
        }
    }
}
