package ObjectOrientedProgrammingAssignments.OOP_AssignmentsSubject3;

/**
 * Manager类和Coder类的测试类
 */
public class ManagerCoderTest {
    public static void main(String[] args) {
        Manager m1 = new Manager("张三",12345,15000,6000 );
        Coder c1 = new Coder("李四", 12366, 10000);

        m1.work();
        c1.work();

    }
}
