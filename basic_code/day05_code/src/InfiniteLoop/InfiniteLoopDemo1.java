package InfiniteLoop;

/**
 * 几种无限循环的演示
 */
public class InfiniteLoopDemo1 {
    public static void main(String[] args) {
        // for格式的无限循环
        /*for (;;){
            System.out.println("学习");
        }*/

        // while格式的无限循环
        while(true){
            System.out.println("学习");
        }
        // NOTE 注意事项:无限循环的下面,不能再写其他代码了,因为循环永远停不下来,那么下面的代码永远执行不到.

        // System.out.println("序号"); // IDE自动提示报错,因为此句是写在无限循环下方的代码.
    }
}
