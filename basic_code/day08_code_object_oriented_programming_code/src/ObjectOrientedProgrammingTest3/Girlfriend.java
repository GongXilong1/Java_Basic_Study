package ObjectOrientedProgrammingTest2;

/**
 * 建立女朋友类.
 * 使用就近原则和 this关键字.
 * --- 都属于javabean类
 */
public class Girlfriend {
    // 属性:
    private String name;  // 成员变量的完整定义格式:修饰符 数据类型 变量名称 = 初始化值; 一般修饰符省略,无需指定初始化值.
    private int age;  // 加private关键字是为了数据的安全性.
    private String gender;

    // 针对每一个私有化的成员变量,都要提供get和set方法
    // set方法:给成员变量赋值
    // get方法:对外提供成员变量的值

    // setName方法的作用:给成员变量name进行赋值的
    public void setName(String name1){  // 无返回值,所以用void
        // name = name1;
        this.name = name1;
        // 局部变量name1表示测试类中调用方法传递过来的数据
        // 等号的左边:就表示成员位置的name.
    }

    // getName 方法的作用:对外提供name属性的
    public String getName(){
        return name;
    }

    // setAge:给成员变量age进行赋值的
    public void setAge(int age1){
       if (age1 >= 18 && age1 <= 50){
           this.age = age1;
       }else {
           System.out.println("非法参数");
       }
    }

    // getAge: 对外提供成员变量age的值
    public int getAge(){
        return age;
    }

    // gender的两个方法
    public void setGender(String gender1){
        this.gender = gender1;
    }

    public String getGender(){
        return gender;
    }


    // 行为:
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
