package ComprehensiveExercises;

import java.util.Scanner;
/**
 * 使用方法先问三个问题:
 * 1. 我要干嘛?--决定方法的方法体--本练习:根据舱位和折扣确定最终的票价
 * 2. 我做这件事需要什么才能完成?--决定方法的形参--本练习:需要原价,舱位,季节,折扣.
 * 3. 方法的调用处是否需要继续使用这个结果.--决定方法的返回值及其类型--本练习:需要使用返回值
 */

// NOTE 自动抽取方法快捷键:Ctrl + Alt + M
/**
 * 需求:
 * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
 * 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
 * 分析: 1.键盘录入 机票原价 月份 头等舱
 * 2. 判断当前月份是旺季还是淡季
 * 3. 继续判断当前机票
 */
public class ComprehensiveExercises1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入机票的原价: ");
        int airfares = sc1.nextInt();
        System.out.println("请输入月份: ");
        int month = sc1.nextInt();
        System.out.println("请输入当前购买的舱位(0表示头等舱,1表示经济舱): ");
        int cabin = sc1.nextInt();

        if (month >= 5 && month <= 10){
            airfares = getPrise(airfares,cabin,0.9,0.85);
            /*// 旺季--3.继续判断当前机票是头等舱还是经济舱
            if (cabin == 0){
                // 头等舱
                // 4. 根据实际的情况计算出对应的实际票价
                airfares = (int)(airfares * 0.9);  // 乘完0.9可能有小数,所以用int强转
            } else if (cabin == 1) {
                // 经济舱
                airfares = (int)(airfares * 0.85);
            } else {
                System.out.println("没有此类型舱位");
            }*/

        } else if ((month >=1 && month <=4) || (month >=11 && month <= 12)) {
            airfares = getPrise(airfares,cabin,0.7,0.65);
            /*// 淡季
            if (cabin == 0){
                // 头等舱
                airfares = (int)(airfares * 0.7);
            } else if (cabin == 1) {
                // 经济舱
                airfares = (int)(airfares * 0.65);
            } else {
                System.out.println("没有此类型舱位");
            }*/
        }else {
            // 表示键盘录入的数据不合规
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println(airfares);
    }

    public static int getPrise(int airfares, int cabin, double discount0, double discount1){
        if (cabin == 0){
            // 头等舱折扣计算
            airfares = (int)(airfares * discount0);
        } else if (cabin == 1) {
            // 经济舱折扣计算
            airfares = (int)(airfares * discount1);
        } else {
            System.out.println("没有此类型舱位");
        }
        return airfares;
    }
}

