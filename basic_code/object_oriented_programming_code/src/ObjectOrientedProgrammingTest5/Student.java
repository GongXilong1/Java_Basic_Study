package ObjectOrientedProgrammingTest5;

/**
 * 演示构造方法的使用
 */
public class Student {
    private String name;
    private int age;

    // 如果我们没有自己写任何的构造方法,那么虚拟机给我们加一个空参构造方法.
    // 方法内容就是如下这个样子.
    /*public Student(){
        System.out.println("看看我执行了么");
    }*/

    public Student(String name2, int age2){
        this.name = name2;
        this.age = age2;
    }

    public String getName(){
        return name;
    }

    public void setName(String name1){
        this.name = name1;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age1){
        this.age = age1;
    }

}
