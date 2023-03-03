package ComparisonOperators;
/**
 * 演示 关系(比较)运算符
 * */
public class ComparisonOperatorsDemo1 {
    public static void main(String[] args) {
        // 1. == 判断左右两边是否相等
        int a = 10;
        int b = 10;
        int c = 20;
        System.out.println(a == b);  // true
        System.out.println(a == c);  // false

        // 2. != 判断左右两边是否不相等
        System.out.println(a != b);  // false
        System.out.println(a != c);  // true

        // 3. >
        System.out.println(a > b);  // false
        System.out.println(c > b);  // true

        // 4. >=
        System.out.println(a >= b);  // true
        System.out.println(c >= b);  // true

        // 5. <
        System.out.println(a < b);  // false
        System.out.println(b < c);  // true

        // 6. <=
        System.out.println(a <= b);  // true
        System.out.println(b <= c);  // true

    }
}
