package Exercise1;

import java.util.Random;

/**
 * 需求: 定义一个数组,存入 1~5,要求打乱数组中所有数据的顺序.
 * 难点:如何获取数组中的随机索引
 */
public class ArrayTest9 {
    public static void main(String[] args) {
        // 1. 定义一个数组
        int[] array1 = new int[]{1, 2, 3, 4, 5};

        // 2. 循环遍历数组,从0索引开始打乱数据的顺序
        Random r1 = new Random();  // 创建随机数
        for (int i = 0; i < array1.length; i++) {
            // 创建随机索引
            int randomIndex =  r1.nextInt(array1.length);
            // 用随机索引指向的元素跟i指向的元素进行交换
            int temp = array1[i];  // 定义临时变量记录i对应的值
            array1[i] = array1[randomIndex];
            array1[randomIndex] = temp;
        }

        // 当循环结束之后,数组中的所有数据已经打乱顺序
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
