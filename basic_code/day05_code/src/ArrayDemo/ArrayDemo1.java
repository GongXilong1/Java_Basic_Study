package ArrayDemo;

/**
 * 需求 1: 定义数组存储 5个学生的年龄
 * 需求 2: 定义数组存储 3个学生的姓名
 * 需求 3: 定义数组存储 4个学生的身高
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 静态初始化完整格式: 数据类型 [] 数组名 = new 数据类型[]{元素1, 元素2, ...};
        // 静态初始化简化格式: 数据类型 [] 数组名 = {元素1, 元素2, ...};

        int [] array1 = new int[]{11, 12, 15, 16, 17};  // 完整格式  输出结果:数组的地址值:[I@65ab7765
        int [] array2 = {11, 12, 15, 16, 17};  // 简写格式

        String[] array3 = new String[]{"张三", "李四", "wangwu"};
        String[] array4 = {"张三", "李四", "wangwu"};

        double[] array5 = new double[]{1.75, 1.78, 1.80, 1.85};
        double[] array6 = {175, 178, 180, 185};

        System.out.println(array1);  // 输出:[I@65ab7765
    }
}
/**
 * 数组的地址值:[I@65ab7765 的解释：
 *         [ 表示当前是一个数组
 *         I 表示当前数组里面的元素都是int类型的
 *         D 表示当前数组里面的元素都是double类型的
 *         @ 表示一个间隔符号.(固定格式)
 *         65ab7765 才是数组真正的地址值,(十六进制),平时我们习惯性的会把这个整体叫做数组的地址值.
 */
