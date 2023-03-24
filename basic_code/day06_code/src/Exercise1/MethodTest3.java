package Exercise1;

/**
 * 目标: 要能区分出什么时候使用带返回值的方法
 * 需求: 定义方法,比较两个长方形的面积
 * 注意点: 方法的调用处是否需要继续使用方法的结果,如果要用,那么方法必须有返回值,如果不用,方法的返回值可写可不写.
 * 方法定义时完整的三个问题:
 * 1. 我要做什么? 求长方形的面积 -- 决定方法的方法体
 * 2. 需要做什么? 长和宽 -- 决定方法的形参
 * 3. 方法的调用处是否需要继续使用方法的结果. -- 决定方法的返回值
 */
public class MethodTest3 {
    public static void main(String[] args) {
        // 调用方法获取面积比较
        double area1 = getArea(5.3, 3.6);
        double area2 = getArea(6.3, 3.9);

        if (area1 > area2){
            System.out.println("第一个长方形面积更大");
        }else {
            System.out.println("第二个长方形面积更大");
        }
    }

    // 定义一个方法求长方形的面积
    public static double getArea(double length, double width){
        double area0 = length * width;
        return area0;
    }
}
