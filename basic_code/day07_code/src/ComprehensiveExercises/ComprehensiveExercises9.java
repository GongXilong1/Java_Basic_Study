package ComprehensiveExercises;

import java.util.Random;

/**
 * 一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
 * 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
 * 打印效果如下：（随机顺序，不一定是下面的顺序）
 *  888元的奖金被抽出
 *  588元的奖金被抽出
 *  10000元的奖金被抽出
 *  1000元的奖金被抽出
 *  2元的奖金被抽出
 */
public class ComprehensiveExercises9 {
    public static void main(String[] args) {
        // 1. 定义数组表示奖池
        int[] array1 = new int[]{2, 588, 888, 1000, 10000};
        // 2. 定义新数组用于存储抽奖的结果
        int[] array2 = new int[]{array1.length};
        // 3. 抽奖--循环5次
        Random r1 = new Random();
        for (int i = 0; i < 5;) {
            // 获取随机索引
            int randomIndex = r1.nextInt(array1.length);
            // 获取奖项
            int prize0 = array1[randomIndex];
            // 判断当前的奖项是够存在,如果存在就重新抽取,如果不存在就是有效奖项
            if (!contains(array2,prize0)){  // 如果不存在,表示有效奖项
                // 把当前抽取到的奖项添加到array2当中
                array2[i] = prize0;
                // 添加完毕之后,移动索引
                i++;
            }
        }
        // 4. 遍历array2
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
    // 判断prize在数组中是否存在  存在true 不存在 false
    public static boolean contains(int[] array1, int prize1){
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == prize1){
                return true;
            }
        }
        return false;
    }
}
