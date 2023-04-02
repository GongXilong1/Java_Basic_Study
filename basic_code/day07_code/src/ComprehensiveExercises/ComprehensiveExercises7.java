package ComprehensiveExercises;

/**
 * 需求:
 * 把整数上的每一位都添加到数组当中
 * 运用反向推导的思维
 */
public class ComprehensiveExercises7 {
    public static void main(String[] args) {
        // 1. 计算数组的长度
        int number1 = 12345;
        int temp1 = number1;  // 定义临时变量记录number1的初始值,为了第三布
        int count = 0; // 定义一个变量进行统计
        while (number1 != 0){
            // 每一次循环去掉右边的数字
            number1 = number1 / 10;
            // System.out.println(number1);
            count++;  // 去掉一位,计数器自增一次.
        }
        // 2. 定义数组--动态初始化
        int[] array1 = new int[count];

        // 3. 把整数上的每一位都添加到数组当中
        int index1 = array1.length - 1;   // 定义变量index1表示最大索引,并指定初始值为 array1.length - 1,即最大索引值为数组长度-1.
        while (temp1 != 0){
            int unitsDigit = temp1 % 10;  // 获取temp1里面的每一位数组
            temp1 = temp1 / 10;  // 再去掉右边那位数字
            array1[index1] = unitsDigit;// 把当前获取到的个位添加到数组当中  数组名[索引] = 数据;
            index1--;  // 从最大索引到最小索引
        }
        // 验证结果:
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}


// 个位数 units digit
// 十位数 tens digit
// 百位数 hundreds digit
// 千位数 thousands digit
