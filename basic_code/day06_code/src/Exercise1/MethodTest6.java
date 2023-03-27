package Exercise1;

/**
 * 需求: 设计一个方法求数组的最大值,并将最大值返回
 */
public class MethodTest6 {
    public static void main(String[] args) {
        // 1. 定义一个数组
        int[]array1 = new int[]{11, 22, 33, 44, 55, 66};

        // 2. 调用方法--赋值调用
        int maximum0 = getMaximum(array1);

        // 3. 打印
        System.out.println(maximum0);
    }
    // 遍历数组求最大值,需要返回值
    public static int getMaximum(int[]array1){
        int maximum = array1[0];  // 默认数组的零号元素为最大值
        for (int i = 1; i < array1.length; i++){
            if (array1[i] > maximum){
                maximum = array1[i];
            }
        }
        return maximum;
    }
}
