package TwoDimensionalArraysExercise;

/**
 * 二维数组动态初始化格式: 数据类型[][] 数组名 = new 数据类型[m][n];
 * m表示这个二维数组可以存放多少个一维数组.
 * n表示这个一维数组可以存放多少个元素.
 *
 */
public class TwoDimensionalArraysDemo2 {
    public static void main(String[] args) {
        // 1. 利用动态初始化格式创建二维数组
        int[][] array1 = new int[3][5];  // 3表示二维数组长度为3,可以装3个一维数组. 5表示每一个一维数组长度为5,可以装5个int类型的元素.

        // 给而二维数组赋值一个元素.
        array1[0][0] = 10;

        // 遍历二维数组,通过循环嵌套实现,
        for (int i = 0; i < array1.length; i++) {  // 外循环:遍历二维数组获取里面的每一个一维数组;
            for (int j = 0; j < array1[i].length; j++) {  // 内循环:遍历一维数组获取每一个元素.
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
