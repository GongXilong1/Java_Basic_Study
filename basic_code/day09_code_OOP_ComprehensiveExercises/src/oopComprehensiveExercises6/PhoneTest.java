package oopComprehensiveExercises6;

/**
 * 测试类
 */
public class PhoneTest {
    public static void main(String[] args) {
        // 1. 创建一个数组
        Phone[] array1 = new Phone[3];

        // 2. 创建手机对象
        Phone p1 = new Phone("华为Mate60",5999,"黑色");
        Phone p2 = new Phone("华为P60",5699,"深蓝色");
        Phone p3 = new Phone("荣耀Magic6",4999,"星空灰色");

        // 3. 把手机对象添加到数组中
        array1[0] = p1;
        array1[1] = p2;
        array1[2] = p3;

        // 4. 获取三部手机的总价格
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            Phone phone1 = array1[i];
            sum = sum + phone1.getPrice();
        }

        // 5. 求平均价格
        // int average = sum / array1.length;  // 数据能不写死就不写死. ---- 整数版
        double average2 = (sum * 1.0) / array1.length;  // 小数版  运行结果:5565.666666666667元
        // NOTE 想要小数精确/保留两位以及四舍五入的结果,需要用到 BigDecimal.

        // System.out.println(average + "元");
        System.out.println(average2 + "元");


    }
}
