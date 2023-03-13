package LogicalOperators;
/**
 * 演示短路逻辑运算符
 */
public class LogicalOperatorsDemo3 {
    public static void main(String[] args) {
        // 1. 短路与 && --运行结果和单个与&是一样的,表示两边都为真,结果才为真.
        System.out.println(true && true);       // true
        System.out.println(false && false);     // false
        System.out.println(true && false);      // false
        System.out.println(false && true);      // false

        // 2. 短路或 || --表示两边都为假,结果才为假,只要有一方为真,结果就是真.
        System.out.println(true || true);       // true
        System.out.println(false || false);     // false
        System.out.println(true || false);      // true
        System.out.println(false || true);      // true

        // 3. 短路逻辑运算符具有短路效果--当左边的表达式能确定最终的结果,那么右边就不会参与运行了.
        int a = 10;
        int b = 10;
        boolean result1 = ++a < 5 && ++b < 5;   // 左边 ++a < 5的结果是false,所以&&右边不参与运行,变量b也就不会自增.
        System.out.println(result1);            // false
        System.out.println(a);      // 11
        System.out.println(b);      // 10
    }
}
