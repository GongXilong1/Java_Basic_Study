package ObjectOrientedProgrammingAssignments.OOP_AssignmentsSubject1;

/**
 * 测试类
 */
public class PhoneTest {
    public static void main(String[] args) {
        // 使用空参构造方法创建对象
        Phone ph1 = new Phone();

        // 使用set方法赋值-传参
        ph1.setBrand("华为P70");
        ph1.setPrice(5999);
        ph1.setColor("黑色");

        // ph1对象调用get方法返回结果,打印
        System.out.println(ph1.getBrand());
        System.out.println(ph1.getPrice());
        System.out.println(ph1.getColor());

        ph1.call();
        ph1.sendMessage();
    }
}
