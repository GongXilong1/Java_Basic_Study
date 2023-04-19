package oopComprehensiveExercises8;

/**
 * 测试类
 * 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
 * 学生的属性：学号，姓名，年龄。
 * 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
 * 要求2：添加完毕之后，遍历所有学生信息。
 * 要求3：通过id删除学生信息
 *       如果存在，则删除，如果不存在，则提示删除失败。
 * 要求4：删除完毕之后，遍历所有学生信息。
 * 要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
 */
public class StudentTest {
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

        // 要求1: 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        // 读题拆解法:
        Student stu4 = new Student(004,"赵六",17);

        /*唯一性的判断,以id为准.
        id已存在--不用添加
        id不存在--就可以把学生对象添加进数组.*/
        boolean flag1 = contains(array1,stu4.getId());
        if (flag1){
            // 已存在
            System.out.println("当前id重复,请修改id后再进行添加");
        }else {
            // 不存在
            /**
             * 把stu4添加到数组中
             * --1.数组已经存满,只能创建一个新的数组,新数组的长度 = 老数组 + 1;
             * --2.数组没有存满,直接添加.
             */

        }



    }

    // 定义contains方法--用于判断
    // 经典三问:1.要做什么 2.需要什么才能完成--数组和id  3.是否需要返回方法的结果?--必须返回
    public static boolean contains(Student[] array2, int id){
        for (int i = 0; i < array2.length; i++) {
            // 依次获取到数组里面的每一个学生对象
            Student student1 = array2[i];
            // 获取数组中学生对象的id
            int sid = student1.getId();
            // 比较
            if (sid == id){
                return true;
            }
        }
        // 当循环结束之后,还没哟找到一样的id,那么表示数组中哟啊查找的id是不存在的.
        return false;
    }

    // 定义方法判断数组中已经存了几个元素
    public static void getCount(Student[] array3){
        // 定义一个计数器用来统计
        int
    }
}
