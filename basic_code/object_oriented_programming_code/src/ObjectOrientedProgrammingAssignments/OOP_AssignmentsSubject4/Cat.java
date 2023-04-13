package ObjectOrientedProgrammingAssignments.OOP_AssignmentsSubject4;

/**
 * 定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
 * 要求:
 * 1.按照以上要求定义Cat类和 Dog类,属性要私有,生成空参、有参构造，set和get方法
 * 2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
 * 3.调用成员方法,打印格式如下:
 * 花色的波斯猫正在吃鱼.....
 * 花色的波斯猫正在逮老鼠....
 * 黑色的藏獒正在啃骨头.....
 * 黑色的藏獒正在看家.....
 */
public class Cat {
    // 属性
    private String color;
    private String bread;


    // 无参构造
    public Cat() {
    }

    // 有参构造
    public Cat(String color, String bread) {
        this.color = color;
        this.bread = bread;
    }

    // get和set方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    // 行为
    public void eat(){
        System.out.println(color + "的" + bread + "正在吃鱼......");
    }
    public void catchMouse(){
        System.out.println(color + "的" + bread + "正在逮老鼠......");
    }


}
