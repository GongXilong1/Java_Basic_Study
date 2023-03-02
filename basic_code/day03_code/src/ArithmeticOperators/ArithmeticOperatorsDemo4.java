package ArithmeticOperators;
/**
 * 演示 字符串和字符相加的操作
 * */
public class ArithmeticOperatorsDemo4 {
    public static void main(String[] args) {

        // 字符串相加操作演示:
        System.out.println(3.7 + "abc");            // "3.7abc"
        System.out.println("abc" + true);           // "abctrue"  只要有字符串参与计算就是做拼接操作
        System.out.println('中' + "abc" + true);     // "中abctrue"  只要有字符串参与计算就是做拼接操作
        int age = 18;
        System.out.println("我的年龄是" + age + "岁");    // "我的年龄是18岁"
        System.out.println("我的年龄是" + "age" + "岁");  // "我的年龄是age岁"
        System.out.println(1 + 2 + "abc" + 2 + 1);      // "3abc21"  先计算在拼接

        // 字符和数字相加,字符和字符串相加.
        char c = 'a';
        int result = c + 0;
        System.out.println(result);  // 结果:97 (ASCII码表中a对应97,A对应65)
        System.out.println(1 + 'a'); // 98
        System.out.println('a' + "abc");  // "aabc"  NOTE 只要有字符串参与计算就是做拼接操作



    }
}
