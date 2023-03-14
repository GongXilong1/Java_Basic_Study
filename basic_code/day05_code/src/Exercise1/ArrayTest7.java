package Exercise1;

/**
 * 需求: 定义一个数组,存入 1, 2, 3, 4, 5,交换首尾索引对应的元素,
 * 交换前: 1, 2, 3, 4, 5
 * 交换后: 5, 4, 3, 2, 1
 *
 * 第二步: 定义一个数组,将数组中 0索引和最大索引的值进行交换.
 */
public class ArrayTest7 {
    public static void main(String[] args) {
        // 1. 定义一个数组
        int[]array1 = {1, 2, 3, 4, 5};

        // 2. 将数组中0索引和最大索引的值进行交换--利用第三方变量进行交换.
        int temp = array1[0];

        array1[0] = array1[4];
        array1[4] = temp;

        // 遍历数组
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
