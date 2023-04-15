package ObjectOrientedProgrammingTest;

/**
 * 描述手机的类
 */
public class Phone {
    // 属性:
    String brand;  // 品牌-字符串类型
    double price;  // 价格-double类型

    // 行为:
    public void call(){
        System.out.println("手机在打电话");
    }
    public void playGame(){
        System.out.println("手机在玩游戏");
    }
}
