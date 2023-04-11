package ObjectOrientedProgrammingTest5;

/**
 * 演示构造方法的使用
 */
public class StudentTest {
    public static void main(String[] args) {
        // 创建对象
        // Student s1 = new Student();  // 调用空参
        Student s2 = new Student("zhangsan", 23);
        // 传参,调用有参构造方法
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}
