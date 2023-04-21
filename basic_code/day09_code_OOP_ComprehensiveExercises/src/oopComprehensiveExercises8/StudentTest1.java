package oopComprehensiveExercises8;

/**
 * 测试类
 * 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
 * 学生的属性：学号，姓名，年龄。
 * 其他测试类已完成-要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
 * 其他测试类已完成-要求2：添加完毕之后，遍历所有学生信息。
 * 要求3：通过id删除学生信息
 *       如果存在，则删除，如果不存在，则提示删除失败。
 * 要求4：删除完毕之后，遍历所有学生信息。
 * 要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
 */
public class StudentTest1 {
    public static void main(String[] args) {
        // 1. 创建一个数组用来存储学生对象
        Student[] array1 = new Student[3];

        // 2. 创建学生对象
        Student stu1 = new Student(001,"张三",15);
        Student stu2 = new Student(002,"李四",16);
        Student stu3 = new Student(003,"王五",15);

        // 3. 把学生对象添加到数组中
        array1[0] = stu1;
        array1[1] = stu2;
        array1[2] = stu3;

        // 要求3: 通过id删除学生信息,如果存在，则删除，如果不存在，则提示删除失败.
        // 要找到id在数组中对应的索引
        int index1 = getIndex(array1,2);

        if (index1 >= 0){
            // 如果存在,则删除--原理:把index对应的元素置为null.
            array1[index1] = null;
            // 要求4: 删除完毕之后，遍历所有学生信息。
            printArray(array1);
        }else {
            // 如果不存在,则提示删除失败
            System.out.println("当前id不存在,删除失败!");
        }


        //
    }

    // 方法作用:找到id在数组中的索引--需要数组和id,要返回结果
    public static int getIndex(Student[] array2, int id){
        for (int i = 0; i < array2.length; i++) {
            // 依次得到每一个学生对象
            Student student2 = array2[i];
            // 对student2进行一个非空判断
            if (student2 != null){
                int sid = student2.getId();
                if (sid == id){
                    return i;
                }
            }
        }
        // 当循环结束之后,还没有找到就表示不存在
        return -1;
    }

    // 方法的作用:打印数组内容
    public static void printArray(Student[] array6){
        for (int i = 0; i < array6.length; i++) {
            Student stu1 = array6[i];
            if (stu1 != null){
                System.out.println(stu1.getId() + "," + stu1.getName() + "," + stu1.getAge());
            }
        }
    }
}
