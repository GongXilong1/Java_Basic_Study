package Java_basic1;

public class ValueDemo2 {
    public static void main(String[] args){
        // 目标: 熟悉制表符的基本用法

        System.out.println("name" + "age");  //字符串的拼接,变成"nameage"打印
        System.out.println("tom" + "23");
        System.out.println("name" + '\t' + "age");  //使用制表符
        System.out.println("tom" + '\t' + '\t' + "23");  // 为了达到对齐的效果使用两个制表符.

    }

}
