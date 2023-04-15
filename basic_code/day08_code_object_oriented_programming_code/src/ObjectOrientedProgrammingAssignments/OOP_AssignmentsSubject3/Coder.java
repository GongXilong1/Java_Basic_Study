package ObjectOrientedProgrammingAssignments.OOP_AssignmentsSubject3;

/**
 * 定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()
 */
public class Coder {
    // 属性
    private String name;
    private int id;
    private double salary;

    // 空参构造

    public Coder() {
    }

    // 有参构造

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // get和set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 行为
    public void work(){
        System.out.println("工号为" + id + ",基本工资为" + salary +"元的程序员" + name + "正在努力的写着代码......");
    }

}
