package Exercise1;

/**
 * 需求: 设计一个方法用于数组遍历, 要求遍历的结果是在一行上的,例如: [11, 22, 33, 44, 55]
 */
public class MethodTest5 {
    public static void main(String[] args) {
        // 1. 定义一个数组(静态)
        int[] array1 = new int[]{11, 22, 33, 44, 55};

        // 2. 调用方法,遍历数组
        printArray(array1);

        // 输出语句
        /*System.out.println("abc");  // 先打印abc,再进行换行
        System.out.print("abc");  // 只打印abc,不换行,没有ln就不换行
        System.out.println();  // 不打印任何数据,只做换行处理*/

    }
    // 定义方法用于数组的遍历---遍历数组  不需要返回值
    public static void printArray(int[]array1){
        System.out.print("[");  // 注意用print做不换行处理
        for (int i = 0; i < array1.length; i++){
            if (i == array1.length - 1){
                System.out.print(array1[i]);  // 注意用print做不换行处理
            }else {
                System.out.print(array1[i] + ", ");  // 注意用print做不换行处理
            }
        }
        System.out.println("]");
    }
}

