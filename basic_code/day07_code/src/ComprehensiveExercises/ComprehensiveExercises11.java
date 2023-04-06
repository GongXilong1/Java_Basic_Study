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
        int[] userInputArray = userInputNumber();
        for (int i = 0; i < userInputArray.length; i++) {
            System.out.print(userInputArray[i] + " ");
        }

        // 3. 判断用户中奖情况--红球和蓝球分别判断
        int redCount = 0;
        int blueCount = 0;
        // 判断红球中奖情况
        for (int i = 0; i < userInputArray.length; i++) {
            int userRedNumber = userInputArray[i];
            for (int j = 0; j < array3.length - 1; j++) {
                if (userRedNumber == array3[j]){
                    redCount++;
                    break;  // 如果找到了,那么后面的数字就没有必要继续比较了,跳出内循环,继续判断下一个红球号码是否正确.
                }
            }
        }

        // 判断蓝球中奖情况
        int userBlueNumber = userInputArray[userInputArray.length - 1];
        if (userBlueNumber == array3.length -1){
            blueCount++;
        }
    }
    
    // 生成中奖号码的方法
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
    
    // 用户输入所选奖号的方法
    public static int[] userInputNumber(){
        // 1. 创建数组用于添加用户购买的彩票号码,6个红球,1个蓝球,数组长度7.
        int[] array4 = new int[7];

        // 2. 利用键盘输入让用户输入
        Scanner sc1 = new Scanner(System.in);
        // 让用户输入红球号码
        for (int i = 0; i < 6; ) {  // 从0开始循环
            System.out.println("请输入第" +(i + 1) + "个红球号码");  // i从0开始循环,此处需要i+1.
            int userInputRedNumber = sc1.nextInt();
            // 要求判断redNumber在1-33之间的唯一不重复
            if (userInputRedNumber >= 1 && userInputRedNumber <= 33){
                // 判断唯一性
                boolean flag2 = contains(array4, userInputRedNumber);
                if (!flag2){
                    // 不存在--即有效的,可以添加到数组中
                    array4[i] = userInputRedNumber;
                    i++;
                }else {
                    // 存在就提示
                    System.out.println("当前红球号码已经存在,请重新输入: ");
                }

            }else {
                System.out.println("当前红球号码超出范围");
            }
        }

        // 让用户输入蓝球号码
        System.out.println("请输入蓝球号码: ");
        while (true) {
            int userInputBlueNumber = sc1.nextInt();
            if (userInputBlueNumber >=1 && userInputBlueNumber <= 16){
                array4[array4.length - 1] = userInputBlueNumber;
                break;
            }else {
                System.out.println("当前蓝球号码超出范围");
            }
        }
        return array4;
    }
}
