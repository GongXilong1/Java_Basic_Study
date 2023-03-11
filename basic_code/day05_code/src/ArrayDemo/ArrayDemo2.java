package ArrayDemo;

/**
 * 利用索引对数组中的元素进行访问
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        // 1. 获取数组里面的元素  格式:数组名[索引]
        int[] array1 = {1, 2, 3, 4, 5};
        int number0 = array1[0];  // 定义变量number0接收数组array1中的0号元素.
        System.out.println(number0);
        System.out.println(array1[1]);  // 获取数组中1号索引上对应的数据,并直接打印出来.

        // 2. 把数据存储到数组中  格式:数组名[索引] = 具体数据/变量:
        // NOTE 细节: 一旦覆盖之后,原来的数据就不存在了.
        array1[0] = 100;
        System.out.println(array1[0]);  // 输出:100


    }
}
