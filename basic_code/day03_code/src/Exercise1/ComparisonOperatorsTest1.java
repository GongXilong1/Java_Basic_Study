package Exercise1;
/**
 * 需求:
 * 您和约会对象在餐厅获得一张桌子
 * 键盘录入两个整数,表示你和约会对象衣服的时尚程度, (手动录入0~10之间的整数, 不能录其他)
 * 如果你的时尚程度大于你约会对象的时尚程度, 相亲就成功, 输出 true, 否则输出 false.
 * */

import java.util.Scanner;

public class ComparisonOperatorsTest1 {
    public static void main(String[] args) {
        // 1. 键盘录入两个整数表示衣服的时尚程度
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入我们自己的衣服时尚程度: ");
        int myFashion = sc1.nextInt();
        System.out.println("请输入约会对象衣服的时尚程度: ");
        int girlFashion = sc1.nextInt();

        // 2. 把我和女孩的衣服时尚程度进行对比
        boolean result1 = myFashion > girlFashion;

        // 3. 打印输出结果
        System.out.println(result1);


    }
}
