package ObjectOrientedProgrammingAssignments.OOP_AssignmentsSubject3;

/**
 * 定义项目经理类 Manager。属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
 * 要求：
 * 1.按照以上要求定义 Manager类和 Coder类,属性要私有,生成空参、有参构造，set和get方法
 * 2.定义测试类,在 main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
 * 3.调用成员方法,打印效果如下:
 * 工号为123基本工资为15000奖金为6000的项目经理张三正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
 * 工号为135基本工资为10000的程序员李四正在努力的写着代码......
 */
public class Manager {
    // 属性
    private String name;
    private int id;
    private double salary;
    private double bonus;

    // 空参构造方法
    public Manager() {
    }

    // 有参构造方法
    public Manager(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // 行为
    public void work(){
        System.out.println("工号为" + id + ",基本工资为" + salary + "元,奖金为" + bonus + "元的项目经理" + name + "正在努力地做着管理工作,分配任务,检查员工提交上来的代码......");
    }
}
