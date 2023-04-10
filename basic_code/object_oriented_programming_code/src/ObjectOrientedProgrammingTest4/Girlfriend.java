package ObjectOrientedProgrammingTest3;

/**
 * 演示就近原则和 this关键字
 * --- javabean类
 */
public class Girlfriend {
    // 属性
    private int age;  // 此处的age没有赋值为默认初始化值0.

    public void method(){
        int age = 10;
        System.out.println(age);  // 就近原则,打印局部变量age为 10.
        System.out.println(this.age);  // 不使用就近原则,打印成员变量age为 0
    }
}
