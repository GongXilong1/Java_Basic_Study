package ComprehensiveExercises;

/**
 * 把上一题加密之后的数据进行解密
 * 解密的难点在于: 还原对10取余的计算
 *
 */
public class ComprehensiveExercises8 {
    public static void main(String[] args) {
        // 1. 定义数组记录解密之后的结果
        int[] array1 = new int[]{8, 3, 4, 6};

        // 2. 先反转
        for (int i = 0, j = array1.length - 1; i < j; i++, j--) {
            int temp1 = array1[i];
            array1[i] = array1[j];
            array1[j] = temp1;
        }
        /*for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+ " ");  // 反转后的结果:6438
        }*/

        // 3. 由于加密是通过对10取余的方式进行获取的, NOTE 所以在解密的时候就需要判断:0-4之间 +10  5-9数字不变
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= 0 && array1[i] <= 4) {
                array1[i] = array1[i] + 10;
            }
        }

        /*for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");  // 运行结果: 6 14 13 8
        }*/

        // 4. 每一位减5
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] - 5;
        }

        /*for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");  // 运行结果:1 9 8 3
        }*/

        // 5. 获取数组里面的每一位数字,拼接成最终的结果
        int number1 = 0;
        for (int i = 0; i < array1.length; i++) {
            number1 = number1 * 10 + array1[i];
        }
        System.out.println(number1);
    }
}
