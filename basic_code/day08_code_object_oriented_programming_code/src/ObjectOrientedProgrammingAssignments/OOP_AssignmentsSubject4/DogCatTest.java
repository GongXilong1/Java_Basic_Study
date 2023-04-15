package ObjectOrientedProgrammingAssignments.OOP_AssignmentsSubject4;

/**
 * Dog和 Cat类的测试类
 */
public class DogCatTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("黑色","藏獒");
        Cat c1 = new Cat("花色","波斯猫");

        c1.eat();
        c1.catchMouse();
        d1.eat();
        d1.lookHome();
    }
}
