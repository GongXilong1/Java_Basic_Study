package ArithmeticOperators;
/**
 * 算术运算符详解: 除法和取模
 * */
public class ArithmeticOperatorsDemo2 {
    public static void main(String[] args) {
        // 除法
        // NOTE 结论: 1. 整数参与计算,结果只能得到整数.  2. 小数参与计算,结果有可能是不精确的.
        System.out.println(10 / 2);
        System.out.println(10 / 3);     // 运行结果为3,原因是计算结果要有小数,必须有小数参与计算.
        System.out.println(10.0 / 3);   // 3.3333333333333335  结果有可能是不精确的.
        System.out.println(10 / 3.1);   // 3.225806451612903

        // 取模(取余),实际上也是除法运算,
        System.out.println(10 % 2); // 0
        System.out.println(10 % 3); // 1
        // 应用场景
        // 1. 可以用取模来判断, A是否可以被B整除.  A % B   10 % 3
        // 2. 可以判断A是否为偶数  A % 2 如果结果为0,那么证明A是偶数,结果为1,证明A是一个奇数.
        // 3. 斗地主发牌:三个玩家,,把每一张牌都定义一个序号,拿着序号 % 3 如果结果为1,就发给第一个玩家,
        // 如果结果为2,就发给第二个玩家. 结果为0,就发给第三个玩家.

    }
}
