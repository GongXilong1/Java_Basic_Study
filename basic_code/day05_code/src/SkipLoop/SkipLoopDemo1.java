package SkipLoop;

/**
 * 小老虎吃包子,第三个包子有虫子,跳过.
 */
public class SkipLoopDemo1 {
    public static void main(String[] args) {
        // 1. 跳过某一次循环
        for (int i = 0; i <= 5; i++) {
            if (i == 3){
                continue;  // 结束本次循环,继续下次循环.(本次循环中下面的代码就不会执行了,代码会跳转待i++,开始下一次循环.)
            }
            System.out.println("小老虎在吃第 " + i + "个包子");
        }
    }
}

// NOTE for循环输入快捷键,循环五次就按: 5.for i + enter
