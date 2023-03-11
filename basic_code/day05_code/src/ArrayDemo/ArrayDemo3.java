package ArrayDemo;

/**
 * 数组的遍历
 *
 * 扩展知识: 自动的快速生成数组的遍历方式
 * IDEA提供的: 数组名.fori
 * 效果如下:
 * for (int i = 0; i < array1.length; i++) {
 *
 *          }
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        // 1. 定义数组
        int[] array1 = {1, 2, 3, 4, 5};

        // 2. 获取数组里面所有的元素  格式: 数组名[索引]
        // 利用循环: 开始条件:0, 结束条件:数组的长度-1(最大索引)
        /* for (int i = 0; i <= 4; i++) {
            System.out.println(array1[i]);
        }*/

        // 在Java中,关于数组的一个长度属性,length,调用方式: 数组名.length
        // System.out.println(array1.length);

        for (int i = 0; i <= array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}


