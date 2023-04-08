package ObjectOrientedProgrammingTest;

/**
 *
 */
public class PhoneTest {
    public static void main(String[] args) {
        // 创建手机的对象
        Phone p1 = new Phone();

        // 给手机属性赋值
        p1.brand = "华为Mate60";
        p1.price = 5999.98;

        // 获取手机对象中的值
        System.out.println(p1.brand);
        System.out.println(p1.price);

        // 调用手机中的方法做事情
        p1.call();
        p1.playGame();

        // 定义第二部手机对象
        Phone p2 = new Phone();
        p2.brand = "荣耀Magic5";
        p2.price = 4999.98;

        p2.call();
        p2.playGame();
    }
}
