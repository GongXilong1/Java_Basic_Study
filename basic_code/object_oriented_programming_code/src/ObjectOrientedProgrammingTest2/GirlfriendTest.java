package ObjectOrientedProgrammingTest2;

/**
 * 调用 Girlfriend类,创建 gf1和 gf2对象.
 */
public class GirlfriendTest {
    public static void main(String[] args) {
        // 创建女朋友类的对象
        Girlfriend gf1 = new Girlfriend();
        // System.out.println(gf1.name);  // name默认为null空.
        gf1.name = "刘思雅";
        gf1.age = 18;
        gf1.gender = "萌妹子";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.sleep();

        System.out.println("+++++++++++++++++");

        Girlfriend gf2 = new Girlfriend();
        gf2.name = "张佳馨";
        gf2.age = 19;
        gf2.gender = "萌妹子";
        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);
        gf2.eat();
        gf2.sleep();
    }
}
