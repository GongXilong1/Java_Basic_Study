package ComprehensiveExercises;

import java.util.Scanner;

/**
 * 需求 :
 * 在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
 * 分析:
 * 1. 定义数组存储六位评委的打分--用键盘录入来实现
 * 2. 求出数组中的最大值
 * 3. 求出数组中在最小值
 * 4. 求出数组中 6个分数的和
 * 5. 平均分 = (总和 - 最大值 - 最小值) / 需要的数组长度
 */
// NOTE 变量的批量修改快捷键: 选中被修改的变量,然后按 Shift + F6 修改完后回车.
public class ComprehensiveExercises5 {
    public static void main(String[] args) {
        int[] scoresArray0 = getScores();  // 调用
        for (int i = 0; i < scoresArray0.length; i++) {  // 遍历
            System.out.println(scoresArray0[i]);
        }
        int scoreMaximum0 = getMaximum(scoresArray0);  // 求出最大值
        int scoreMinimum0 = getMinimum(scoresArray0);  // 求出最小值
        int sum0 = getSum(scoresArray0); // 求和
        // 平均分 = (总分 - 最大值 - 最小值) / 需要的数组长度
        int averageScore = (sum0 - scoreMaximum0 - scoreMinimum0) / (scoresArray0.length - 2);
        System.out.println("平均分即最终得分是: " + averageScore);
    }
    // 定义方法三问:
    // 1. 我要做什么?--定义数组存储六位评委的打分(0-100)
    // 2. 我需要什么?--都不需要,无参数
    // 3. 是否需要返回值?--必须要
    public static int[] getScores(){
        // 定义数组--动态格式
        int[] scoresArray1 = new int[6];
        Scanner sc1 = new Scanner(System.in);

        for (int i = 0; i < scoresArray1.length; ) {
            System.out.println("请输入评委的打分(0-100): ");
            int score1 = sc1.nextInt();
            if (score1 >=0 && score1 <=100 ){
                scoresArray1[i] = score1;  // score1这个变量接到键盘录入的值赋值给scoresArray1[i]
                i++;
            }else {
                System.out.println("录入的评分超出范围,请继续录入,当前的i为: " + i);
            }
        }
        return scoresArray1;
    }

    // 求数组的最大值方法
    public static int getMaximum(int[] scoreArray0){
        int scoreMaximum = scoreArray0[0];
        for (int i = 0; i < scoreArray0.length; i++) {
            if (scoreArray0[i] > scoreMaximum){
                scoreMaximum = scoreArray0[i];
            }
        }
        return scoreMaximum;
    }

    // 求数组的最小值方法
    public static int getMinimum(int[] scoreArray0){
        int scoreMinimum = scoreArray0[0];
        for (int i = 0; i < scoreArray0.length; i++) {
            if (scoreArray0[i] > scoreMinimum){
                scoreMinimum = scoreArray0[i];
            }
        }
        return scoreMinimum;
    }

    // 求和方法
    public static int getSum(int[] scoreArray0){
        int sum1 = 0;
        for (int i = 0; i < scoreArray0.length; i++) {
            sum1 = sum1 + scoreArray0[i];
        }
        return sum1;
    }
}

