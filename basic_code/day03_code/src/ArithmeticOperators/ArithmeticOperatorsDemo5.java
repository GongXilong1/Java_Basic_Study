package ArithmeticOperators;
/**
 * 演示 自增自减运算符 的两种使用方法.
 * */
public class ArithmeticOperatorsDemo5 {
    public static void main(String[] args) {
        // 自增自减运算符 ++ 和 -- 单独使用
        int a = 10;
        a++;  // 表示把变量a中的值+1
        System.out.println(a);  // 11
        int b = 10;
        ++b;  // 表示把变量b中的值+1
        System.out.println(b);  // 11

        int c = 10;
        c--;  // 表示把变量c中的值-1
        System.out.println(c);  // 9
        int d = 10;
        --d;  // 表示把变量d中的值-1
        System.out.println(d);  // 9


        // 自增自减运算符 ++ 和 -- 参与计算
        // 1. 先用后加
        int a1 = 10;
        int b1 = a1++;
        System.out.println(a1);  // 11
        System.out.println(b1);  // 10

        // 2. 先加后用
        int a2 = 10;
        int b2 = ++a2;
        System.out.println(a2);  // 11
        System.out.println(b2);  // 11



    }
}
