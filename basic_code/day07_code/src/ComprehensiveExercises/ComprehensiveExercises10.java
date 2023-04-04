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
 *  ------抽奖池的代码优化实现
 */
public class ComprehensiveExercises10 {
    public static void main(String[] args) {
        // 1. 把奖池里面的所有奖项打乱顺序
        int[] array1 = new int[]{2, 588, 888, 1000, 10000};
        Random r1 = new Random();
        for (int i = 0; i < array1.length; i++) {
            // 获取随机索引
            int randomIndex = r1.nextInt(array1.length);

            // 拿着i跟随机索引randomIndex上的值进行交换
            int temp1 =array1[i];
            array1[i] = array1[randomIndex];
            array1[randomIndex] = temp1;

        }
        // 2. 遍历奖池,从0索引开始获取每一个奖项
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
}
