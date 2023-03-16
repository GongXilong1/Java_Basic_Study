package Exercise1;

/**
 * 需求: 定义一个方法,求 圆的面积,将面积在方法中进行打印.
 * 目标: 根据不同的需求,选择定义无参的方法,还是带参数的方法.
 */
public class MethodTest2 {
    public static void main(String[] args) {
        getAreaOfCircle(5);
    }
    public static void getAreaOfCircle(double radius){
        double areaOfCircle = radius * radius * 3.14;
        System.out.println(areaOfCircle);
    }
}
