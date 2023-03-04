package LogicalOperators;
/**
 *演示 逻辑运算符 &并且 ; |或者 ,以及其bit计算过程
 * */
public class LogicalOperatorsDemo1 {
    public static void main(String[] args) {
        // 1. & 并且--两边都为真, 结果才是真
        System.out.println(true & true);      // true
        System.out.println(false & false);    // false
        System.out.println(true & false);     // false
        System.out.println(false & true);     // false

        // 2. | 或者--两边都为假,结果才是假;只要有一方为真,结果就是真.
        System.out.println(true | true);        // true
        System.out.println(false | false);      // false
        System.out.println(true | false);       // true
        System.out.println(false | true);       // true


        // 逻辑与运算的bit计算过程
        int a1 = 200;                   // int 200 -- 0000 0000 0000 0000 0000 0000 1100 1000
        int b1 = 10;                    // int 10  -- 0000 0000 0000 0000 0000 0000 0000 1010
        System.out.println(a1 & b1);    // 200 & 10 - 0000 0000 0000 0000 0000 0000 0000 1000
        // 只有两个200和10对应bit位上都为1时,此bit位才为1. --0000 1000 对应的十进制是:8.

        // 逻辑或运算的bit计算过程
        int a2 = 200;                   // int 200 -- 0000 0000 0000 0000 0000 0000 1100 1000
        int b2 = 10;                    // int 10  -- 0000 0000 0000 0000 0000 0000 0000 1010
        System.out.println(a2 | b2);    // 200 | 10 - 0000 0000 0000 0000 0000 0000 1100 1010  转换成十进制为:202.
        // 200和10对应bit位上只要有一个为1,此bit位上就是1.

        // 左移运算的bit计算过程 -运算规则:向左移动,低位补0.
        int a3 = 200;                   // int 200 -- 0000 0000 0000 0000 0000 0000 1100 1000
        System.out.println(a3 << 2);    // 向左移动2位- 0000 0000 0000 0000 0000 0011 0010 0000  转换成十进制为:800
        // NOTE 公式: 左移一次,乘以2一次.

        // 右移运算的bit计算过程 -运算规则: 向右移动,高位补0或1,即原来是负数,移动时高位补1,原来是正数,移动时高位补0.
        int a4 = 200;                   // int 200 -- 0000 0000 0000 0000 0000 0000 1100 1000
        System.out.println(a4 >> 2);    // 向右移2位 - 0000 0000 0000 0000 0000 0000 0011 0010  转换成十进制为:50
        // NOTE 公式: 右移一次,除以2一次.

        // 无符号右移的bit计算过程 - 运算规则: 向右移动, 高位补0.


    }

}
