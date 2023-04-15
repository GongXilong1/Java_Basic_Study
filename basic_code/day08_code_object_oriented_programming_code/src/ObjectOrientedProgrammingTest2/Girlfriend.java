package ObjectOrientedProgrammingTest2;

/**
 * 建立女朋友类
 */
public class Girlfriend {
    // 属性:
    private String name;  // 成员变量的完整定义格式:修饰符 数据类型 变量名称 = 初始化值; 一般修饰符省略,无需指定初始化值.
    private int age;
    private String gender;

    // 针对每一个私有化的成员变量,都要提供get和set方法
    // set方法:给成员变量赋值
    // get方法:对外提供成员变量的值

    // setName方法的作用:给成员变量name进行赋值的
    public void setName(String name1){  // 无返回值,所以用void
        name = name1;
    }

    // getName 方法的作用:对外提供name属性的
    public String getName(){
        return name;
    }

    // setAge:给成员变量age进行赋值的
    public void setAge(int age1){
       if (age1 >= 18 && age1 <= 50){
           age = age1;
       }else {
           System.out.println("非法参数");
       }
    }

    // getAge: 对外提供成员变量age的值






    // 行为:
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
