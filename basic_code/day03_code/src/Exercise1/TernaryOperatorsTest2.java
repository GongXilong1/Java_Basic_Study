package Exercise1;
/**
 * 需求:
 * 一座寺庙中有三个和尚,已知它们的是高分别为150cm\210cm\165cm.
 * 请用程序实现获取三个和尚的最高身高.
 * */
public class TernaryOperatorsTest2 {
    public static void main(String[] args) {
        // 1. 定义三个变量记录三个和尚的身高
        int monkHeight1 = 150;
        int monkHeight2 = 210;
        int monkHeight3 = 165;

        // 2. 拿着第一个和尚和第二个和尚的身高进行比较
        // 再拿着第一次比较的结果跟第三个和尚进行比较
        int tempResult = monkHeight1 > monkHeight2 ? monkHeight1 : monkHeight2;
        int finalResult = tempResult > monkHeight3 ? tempResult : monkHeight3;
        System.out.println(finalResult);

    }
}

// NOTE 快捷键: Ctrl + Alt + L  自动地格式化代码

