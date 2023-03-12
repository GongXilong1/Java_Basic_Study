package Exercise1;

/**
 * 需求: 定义数组求最大值: 33, 5, 22, 44, 55.
 * 扩展问题:
 * 1. 根据求最大值的思路,改写出求最小值的代码.
 * 2. 为什么max要记录array1[0],默认值不能为 0吗?
 * 答案: 不能写0,如果数组中有负数,那么比较之后数值中打印出来的最大值就是 0,数值中很有可能就没有 0.
 * 所以注意: max的初始化值一定要是数组中的值.
 * 3. 循环的开始条件一定是0吗?
 * 答案: 循环的开始条件如果为0,那么第一次循环时是自己跟自己比较了一下,对结果没有任何影响,但是效率偏低,
 * 为了提高效率,减少一次循环的次数,循环开始条件可以写 1.
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        // 1. 定义数组存5个值
        int[] array1= {33, 5, 22, 44, 55};

        // 2. 定义一个变量max用来存储最大值
        int max = array1[0];  // 临时默认0号索引的元素是最大的.

        // 3. 循环获取数组中的每一个元素,拿着每一个元素跟max进行比较
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > max){
                max = array1[i];
            }
        }
        // 4. 当循环结束,max记录的就是数组中的最大值.
        System.out.println(max);

        // 求最小值
        /*int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min){
                min = array1[i];
            }
        }
        System.out.println(min);*/
    }
}
