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
            int count2 = getCount(array1);
            if (count2 == array1.length){
                // 已经存满
                // 创建一个新的数组,长度 = 老数组的长度 + 1,然后把老数组中的元素拷贝到新数组中.
                Student[] newArray2 = createNewArray(array1);
                /**
                 * 老数组是[stu1,stu2,stu3]
                 * 新数组是[stu1,stu2,stu3,null]
                 */
                // 把stu4添加进去
                newArray2[count2] = stu4;

                // 要求2: 添加完毕之后,遍历所有的学生信息


            }else {
                // 没有存满
                /**
                 * 分析:
                 * [stu1,stu2,null]
                 * getCount获取到的是2,表示数组当中已经有了2个元素
                 * 还有一层意思:如果下一次要添加数据,就是添加到2 索引的位置.
                 */
                array1[count2] = stu4;  // 难点
                // 要求2: 添加完毕之后,遍历所有的学生信息
            }
        }

        // 要求2: 添加完毕之后,遍历所有的学生信息

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
    public static int getCount(Student[] array3){
        // 定义一个计数器用来统计
        int count1 = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] != null){
                count1++;
            }
        }
        // 当循环结束之后,我就知道数值中一共有几个元素
        return count1;  // 返回值的类型应该与所在的方法的传参类型一致.
    }

    // 方法目的:创建一个新的数组,长度 = 老数组的长度 + 1,然后把老数组中的元素拷贝到新数组中.
    public static Student[] createNewArray(Student[] array5){
        Student[] newArray1 = new Student[array5.length + 1];
        // 循环遍历得到老数组中的每一个元素
        for (int i = 0; i < array5.length; i++) {
            // 把老数组中的元素添加到新数组中
            newArray1[i] = array5[i];
        }
        // 把新数组返回
        return newArray1;
    }

    public static void printArray(Student[] array6){
        for (int i = 0; i < array6.length; i++) {
            Student stu1 = array6[i];
            if (stu1 != null){
                System.out.println(stu1.getId() + "," + stu1.getName() + "," + stu1.getAge());
            }
        }
    }
}
