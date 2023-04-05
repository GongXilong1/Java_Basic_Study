package ComprehensiveExercises;

import java.util.Random;
import java.util.Scanner;

/**
 * 六个红球一个蓝色球
 *
 */
public class ComprehensiveExercises11 {
    public static void main(String[] args) {
        // 1. 生成中奖号码  数组长度7
        int [] array3 = createNumber();
        /*for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }*/

        // 2. 用户输入彩票号码(红球 + 蓝球)


    }

    public static int[] createNumber(){
        // 1. 创建数组用于添加中奖号码,六个红球一个篮球,数组长度7.
        int[] array1 = new int[7];
        // 2. 随机生成号码并添加到数组中,红球:不能重复,蓝球:1-16之间随机选择,可以跟红球号码重复.

        // 生成红球号码添加到数组中
        Random r1 = new Random();
        for (int i = 0; i < 6; ) {
            // 获取红球号码
            int redNumber = r1.nextInt(33);
            boolean flag1 = contains(array1, redNumber);
            if (!flag1){
                // 如果标记不存在,就把红球号码添加到数组中
                array1[i] = redNumber;
                i++;  // 成功添加红球,i自增.
            }
        }
        // 生成蓝球号码并添加到数组中
        int blueNumber = r1.nextInt(16) + 1;  // 1-16之间的范围需要加1,因为是从0开始的.
        array1[array1.length - 1] = blueNumber;
        return array1;
    }
    // 用于判断数字在数组中是否存在
    public static boolean contains(int[] array2, int number1){
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == number1){
                return true;
            }
        }
        return false;
    }

    public static int[] userInputNumber(){
        // 1. 创建数组用于添加用户购买的彩票号码,6个红球,1个蓝球,数组长度7.
        int[] array4 = new int[7];
        // 2. 利用键盘输入让用户输入
        Scanner sc1 = new Scanner(System.in);
        

    }
}
