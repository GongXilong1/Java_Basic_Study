package stringdemo;

/**
 * 案例需求: 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
 * 并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
 */
public class StringDemo7 {
    public static void main(String[] args) {
        //
        int[] array2 = {1,2,3};
        String string1 = arrayToString(array2);
        System.out.println(string1);
    }

    /**
     * 定义方法:
     * 1. 要做什么--遍历数组并把数组拼接成一个字符串;
     * 2. 需要什么才能完成--数组;
     * 3. 是否要返回结果给调用处--返回一个拼接之后的字符串.
     */
    public static String arrayToString(int[] array1){
        if (array1 == null){
            return "";
        }

        if (array1.length == 0){
            return "[]";
        }

        String result1 = "[";
        // 当代码执行到这里表示什么?
        // 表示数组不是null,也不是长队为0的.
        for (int i = 0; i < array1.length; i++) {
            // i表示索引  array[i]表示元素
            if (i == array1.length - 1){  // 判断i是否为最后一个元素,是最后一个元素的话之后就不拼接','号了.
                result1 = result1 + array1[i];
            }else {
                result1 = result1 + array1[i] + ",";
            }
        }
        result1 = result1 + "]";  // 所有元素都循环完之后拼接上有括号.
        return result1;
    }
}
