package Exercise1;

/**
 * 需求: 定义一个数组,存入 1, 2, 3, 4, 5,交换首尾索引对应的元素,
 * 交换前: 1, 2, 3, 4, 5
 * 交换后: 5, 4, 3, 2, 1
 *
 * 第一步:定义两个变量, 交换两个比变量记录的值.
 */
public class ArrayTest6 {
    public static void main(String[] args) {
        // 1.
        int a = 10;
        int b = 20;
        int temp = a;  // 定义一个临时的第三方变量

        a = b;
        b = temp;

        System.out.println(a);  // 20
        System.out.println(b);  // 10
    }
}
