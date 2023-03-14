package Exercise1;

/**
 * 需求: 定义一个数组,存入 1, 2, 3, 4, 5,交换首尾索引对应的元素,
 * 交换前: 1, 2, 3, 4, 5
 * 交换后: 5, 4, 3, 2, 1
 * 完整过程
 */
public class ArrayTest8 {
    public static void main(String[] args) {
        // 1. 定义数组存储数据
        int[] array1 = {1, 2, 3, 4, 5};

        // 2. 利用循环交换数据
        for (int i = 0,j = array1.length-1; i < j; i++,j-- ){
            // 交换变量i和变量j指向的元素
            int temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;

        }

        // 当循环结束之后,那么数组中的数据就实现了首尾交换
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }
    }
}
