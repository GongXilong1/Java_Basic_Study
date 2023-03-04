package LogicalOperators;
/**
 * 演示 逻辑运算符 ^逻辑异或; ! 逻辑非
 * */
public class LogicalOperatorsDemo2 {
    public static void main(String[] args) {
        // 1. ^ 逻辑异或--相同为false,不同为true.
        System.out.println(true ^ true);        // false
        System.out.println(false ^ false);      // false
        System.out.println(true ^ false);       // true
        System.out.println(false ^ true);       // true

        // 2. ! 逻辑非--取反
        // NOTE 提示: 取反的感叹号!不要写多次,要么不写,要么只写一次.
        System.out.println(!false);     // true
        System.out.println(!true);      // false

    }
}

