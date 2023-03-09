package Exercise1;

/**
 * 需求: 世界最高峰珠穆朗玛峰(8844.43米=8844430毫米),假如有一张足够大的纸张,它的厚度是0.1毫米,
 * 请问: 折叠多少次,可以折成珠穆朗玛峰的高度.
 * 分析: 每一次折叠纸张的厚度都是原先的两倍.
 */
public class WhileTest1 {
    public static void main(String[] args) {
        // 1. 定义一个变量用来记录山峰的高度
        double mountainHeight = 8844430;
        // 2. 定义一个变量用来记录纸张的初始厚度
        double paperHeight = 0.1;
        // 定义变量用来统计折叠次数
        int count = 0;
        // 3. 循环折叠纸张, 只要纸张的厚度小于山峰的高度,循环就继续,每折叠一次,统计次数就要++.
        // 选择使用while循环理由: 此时我们不知道循环的次数,也不知道循环的范围,只知道循环的条件,所以选择用while循环.
        while (paperHeight < mountainHeight){
            // 折叠纸张
            paperHeight = paperHeight * 2;
            // 折叠一次, ++一次
            count++;
        }
        // 当循环结束,count记录的值就是折叠的次数
        System.out.println(count);
    }
}
