package Exercise1;

/**
 * 方法值的传递   传递引用数据类型
 */
public class MethodTest10 {
    public static void main(String[] args) {
        int [] array1 = new int[]{10, 20, 30};
        System.out.println("调用change方法前: " + array1[1]);
        change(array1);
        System.out.println("调用change方法后: " + array1[1]);
    }

    public static void change(int[] array2){
        array2[1] = 200;
    }
}
