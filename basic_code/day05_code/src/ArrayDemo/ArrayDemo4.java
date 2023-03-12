package ArrayDemo;

/**
 * 定义一个数组,用来存班级中50个学生的姓名
 * 姓名未知,要等学生报到之后再进行添加.
 *
 * ----数组默认初始化值的规律:
 * 整数类型: 0
 * 小数类型: 0.0
 * 字符类型: '\u0000' 打印出来就是空格
 * 布尔类型: false
 * 引用数据类型(除了四类以外的): null
 *
 */
public class ArrayDemo4 {
    public static void main(String[] args) {

        // 1. 定义动态数组  格式: 数据类型[] 数组名 = new 数据类型[数组长度];
        String[] array1 = new String[50];

        // 添加学生姓名
        array1[0] = "zhangsan";
        array1[1] = "lisi";

        // 获取
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);  // 没有添加值的索引打印出来为:null

        // 演示int类型动态数组的默认初始化值
        int[] array2 = new int[3];
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);

    }
}
