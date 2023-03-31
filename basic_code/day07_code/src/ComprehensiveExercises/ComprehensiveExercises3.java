package ComprehensiveExercises;

import java.util.Random;

/**
 * 定义方法实现随机产生一个5位的验证码
 * 验证码格式：
 * -长度为5
 * -前四位是大写字母或者小写字母
 * -最后一位是数字
 *
 * 分析:
 * 小技巧:在以后如果我们要在一堆没有什么规律的数据中随机抽取,可以先把数据放到数组中,再随机抽取索引.
 * 步骤:1 大写字母和小写字母都放到数组中.
 * 2. 随机抽取4次.
 * 3. 随机抽取一个数字 0-9
 */
public class ComprehensiveExercises3 {
    public static void main(String[] args) {
        // 1. 大写字母和小写字母都放到数组中
        char [] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            // 运用ASCII码表中数字对应的字母,通过强转数字获得字母
            if (i <=25){
                // 添加小写字母--a对应97
                chars[i] = (char) (97 + i);
            }else {  // 此时i为26并向后
                // 添加大写字母--A对应65
                chars[i] = (char) (65 + i - 26);  // 因为else条件下i是从26开始并向后循环的.
            }
        }
        // 遍历
        for (int i = 0; i < chars.length; i++) {
            // System.out.print(chars[i] + " ");
        }
        // 定义一个字符串类型的变量,用来记录最终的结果,
        String result0 = "";
        // 2. 随机抽取4次,随机抽取数组中地方索引
        Random r1 = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r1.nextInt(chars.length);   // 范围 0~51
            // 利用随机索引,获取对应的元素,利用拼接获得4位一组随机字母.
            result0 = result0 + chars[randomIndex];
        }
        // 3. 随机抽取一个数字 0-9
        int number1 = r1.nextInt(10);

        // 4. 生成最终的结果
        result0 = result0 + number1;
        System.out.println(result0);
    }
}
