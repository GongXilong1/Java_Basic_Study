package Exercise1;

/**
 * 方法值的传递   传递基本数据类型
 */
public class MethodTest9 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前: " + number);  // 100
        number = change(number);
        System.out.println("调用change方法后: " + number);  // 200
    }

    public static int change(int number){
        number = 200;  // 此处的number变量的作用范围是change方法内部
        return number;
    }
}
