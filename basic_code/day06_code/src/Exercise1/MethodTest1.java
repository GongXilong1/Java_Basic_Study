package Exercise1;

/**
 * 需求: 定义一个方法,求长方形的周长,将结果在方法中进行打印
 * 目标: 根据不同的需求,选择定义无参的方法,还是带参数的方法.
 */
public class MethodTest1 {
    public static void main(String[] args) {
        getWeekLength(5.2, 1.3);
    }
    // 求周长  定义长 宽
    public static void getWeekLength(double length, double width){
        double weekLength =  (length + width) * 2;
        System.out.println(weekLength);
    }


}
