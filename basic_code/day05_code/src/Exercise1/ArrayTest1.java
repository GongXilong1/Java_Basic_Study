package Exercise1;

/**
 * 定义一个数组, 存储:1, 2, 3, 4, 5
 * 遍历数组得到每一个元素,求数组里面所有的数据之和.
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        // 1. 定义一个数组,并添加数据
        int[] array1 = {1, 2, 3, 4, 5};

        int sum = 0;

        // 2. 遍历数组得到每一个数据,并累加求和.
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];

            // i依次表示数组里面的每一个索引
            // array1[i] 依次表示数组里面的每一个元素
        }
        System.out.println(sum);

    }
}
