package stringdemo;

/**
 * 案例需求: 定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果,
 * 例如，键盘录入 abc，输出结果 cba
 */
public class StringDemo8 {
    public static void main(String[] args) {
            String result2 = stringReversal("abc");
            System.out.println(result2);
    }

    /**
     * 定义方法:
     * 1. 要做什么:实现字符串反转
     * 2. 需要什么:字符串
     * 3. 是否需要返回结果给调用处:需要结果
     */
    public static String stringReversal(String str1){
        String result1 = "";
        // 通过倒序循环遍历实现字符串反转
        for (int i = str1.length() - 1; i >= 0; i--) {  // i是最大索引,所以要length-1,最小索引是0,所以要>=0.
            // i依次表示字符串中的每一个索引(倒着的)
            char char1 = str1.charAt(i);
            result1 = result1 + char1;
        }
        return result1;
    }
}
