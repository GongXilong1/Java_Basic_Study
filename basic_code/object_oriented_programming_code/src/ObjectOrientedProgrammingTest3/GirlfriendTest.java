package ObjectOrientedProgrammingTest2;

/**
 * 调用 Girlfriend类,创建 gf1和 gf2对象.
 * 使用就近原则和 this关键字.
 * --- 测试类
 */
public class GirlfriendTest {
    public static void main(String[] args) {
        // 创建女朋友类的对象
        Girlfriend gf1 = new Girlfriend();

        // 赋值
        gf1.setName("刘诗雅");  // gf1对象通过调用setName方法并传入参数实现赋值.
        gf1.setAge(18);
        gf1.setGender("女");

        String name1 = gf1.getName();
        System.out.println(name1);
        int age1 = gf1.getAge();
        System.out.println(age1);
        String gender1 = gf1.getGender();
        System.out.println(gender1);

        gf1.eat();
        gf1.sleep();

        System.out.println("+++++++++++++++++");


        Girlfriend gf2 = new Girlfriend();

        gf2.setName("张佳馨");
        gf2.setAge(19);
        gf2.setGender("女");

        String name2 = gf2.getName();
        System.out.println(name2);
        System.out.println(gf2.getAge());
        System.out.println(gf2.getGender());

        gf2.eat();
        gf2.sleep();
    }
}
