package ArrayDemo;

/**
 * 演示数组索引越界异常
 * 小结:
 * 出现索引越界异常的原因:访问了不存在的索引
 * 避免:注意索引的范围
 */
public class ArrayDemo5 {
    public static void main(String[] args) {
        // 1. 定义一个数组
        int[] array1 ={1, 2, 3, 4, 5};  // 长度5 索引0~4
        System.out.println(array1[3]);
    }
}

/**
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5  //数组索引越界异常,索引6超出了长度范围 5.
 * 	at ArrayDemo.ArrayDemo5.main(ArrayDemo5.java:10)  // 在ArrayDemo包ArrayDemo5类main方法中的第 10行.
 *
 */
