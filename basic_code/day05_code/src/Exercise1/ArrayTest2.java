package Exercise1;

/**
 * 定义一个数组, 存储 1, 2, 3, 4, 5, ...10
 * 遍历数组得到每一个元素,统计数组里面一共有多少个能被 3 整除的数字
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        // 1. 定义一个数组
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int count = 0;

        // 2. 遍历数组,得到每一个元素
        for (int i = 0; i < array1.length; i++) {
            // 3. 判断当前的元素是否为3的倍数,如果是那么统计变量就需要自增一次.
            if (array1[i] % 3 == 0){
                // System.out.println(array1[i]);
                count++;
            }
        }
        System.out.println("数组中能被3整除的数字有" + count + "个");
    }
}
