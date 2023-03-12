package Exercise1;

/**
 * 需求: 定义一个数组,存储 1, 2, 3, 4, 5, ...10
 * 遍历数组得到每一个元素,要求:
 * 1. 如果是奇数,则将当前数字扩大两倍
 * 2. 如果是偶数,则将当前数字变成二分之一.
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        // 1. 定义一个数组
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 2. 遍历数组得到每一个元素
        for (int i = 0; i < array1.length; i++) {
            // 3. 对每一个元素进行判断
            if (array1[i] % 2 == 0 ){
                array1[i] = array1[i] / 2;  // 偶数变成二分之一
            }else {
                array1[i] = array1[i] * 2;  // 奇数变成两倍
            }
            // System.out.println(array1[i]);  // 这个是放到第一循环里的简洁写法
        }

        // 此循环用做遍历数组,  老师建议: 一个循环只做一件事情
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
