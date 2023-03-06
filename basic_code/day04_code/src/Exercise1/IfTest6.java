package Exercise1;

import java.util.Scanner;

/**
 * 根据不同的分数送不同的礼物.
 * 如果是 95~100分,送自行车一辆
 * 如果是 90~94分,游乐场玩一天,
 * 如果是 80~89分,送变形金刚一个,
 * 如果是 80分以下,挨打一顿.
 */
public class IfTest6 {
    public static void main(String[] args) {
        // 1. 键盘录入
        Scanner sc1 =new Scanner(System.in);
        System.out.println("请输入考试分数: ");
        int examScores = sc1.nextInt();

        // 2. 判断(需要先对键盘录入的数据进行合理性判断,即:分数大于等于0小于等于100)
        if (examScores >= 0 && examScores <= 100){
            if (examScores >= 95 && examScores <= 100){
                System.out.println("赠送一辆自行车");
            } else if (examScores >=90 && examScores <= 94) {
                System.out.println("游乐场玩一天");
            } else if (examScores >= 80 && examScores <= 89) {
                System.out.println("送变形金刚一个");
            }
            else {
                System.out.println("挨打一顿");
            }
        }
        else {
            System.out.println("输入的分数无效!");
        }
    }
}
