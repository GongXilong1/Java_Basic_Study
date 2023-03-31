package ComprehensiveExercises;

/**
 * 把一个数组中的元素复制到另一个新数组中去。
 * 分析:
 * 1. 定义一个老数组并存储元素
 * 2. 定义一个新数组的长度很老数组一致
 * 3. 遍历老数组,得到老数组中的每一个元素,依次存入到新数组中.
 */
public class ComprehensiveExercises4 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};  // 定义一个老数组并存储元素
        int[] array2 = new int[array1.length];  // 定义一个新数组的长度很老数组一致
        for (int i = 0; i < array1.length; i++) {
            // System.out.println(array1[i]);
            // NOTE i 是老数组中的索引,因为等长,也可以看做是新数组中的每一个索引
            // array1[i]是老数组中的元素.
            array2[i] = array1[i];
        }
        // 新数组元素已经存满
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
