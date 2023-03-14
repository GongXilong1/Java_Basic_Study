package Exercise1;

import java.util.Random;

/**
 * 需求: 生成 10个 1~100之间的随机数存入数组中,
 * 1. 求出所有数组的和
 * 2. 求所有数组的平均数
 * 3. 统计有多少数据比平均值小
 */
public class ArrayTest5 {
    public static void main(String[] args) {
        // 1. 定义数组  推荐使用动态初始化
        int[] array1 = new int[10];

        // 2. 把获取到的随机数存入到数组当中
        Random r1 = new Random();

        for (int i = 0; i < array1.length; i++) {
            // 每循环一次,就会生成一个新的随机数
            int number = r1.nextInt(100) +1;

            // 把生成的随机数添加到数组中, 格式: 数组名[索引] = 数据;
            array1[i] = number;

        }

        // 遍历数组
        /*for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }*/

        // 1) 求出所有数据的和
        // 定义求和变量
        int summation = 0;
        for (int i = 0; i < array1.length; i++) {
            // 循环得到每一个元素,并把元素加到sum元素中
            summation = summation + array1[i];
        }
        System.out.println("数组中所有数据的和为: " + summation);

        // 2) 求出所有数据的平均数
        double average = summation / array1.length;
        System.out.println("数组中的平均数为: " + average);

        int count =0;
        // 3) 统计有多少数据比平均值小
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < average){
                count++;
            }
        }
        System.out.println("数组中有" + count+ "个数据比平均值小");

        // 遍历数组,验证答案
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");  // NOTE 此种打印写法,输出结果就不会换行了.
        }
    }
}
