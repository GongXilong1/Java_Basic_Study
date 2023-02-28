package Java_basic1;

public class VariableDemo2 {
    public static void main(String [] args){
        // 1. 基本用法--定义变量, 再进行输出
        int a = 10;
        System.out.println(a);
        System.out.println(a);

        // 2. 变量参与计算
        int b = 30;
        int c = 20 ;
        System.out.println(b + c);

        // 3. 修改变量记录的值
        a = 60;  // 注意写法:是直接 变量名=变量值,而不是定义变量的写法.
        System.out.println(a);

        System.out.println("------------");

        // 注意事项:
        // 0. 一个变量只能存一个值, 变量名之间不能重复.
        // 1. 在一条语句中, 可以定义多个变量.
        int d = 100, e = 200, f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // 2. 变量在使用之前必须要赋值.
        int g;
        g = 500;  // 建议:以后在定义变量的时候直接赋值,不要把赋值分开写,这里是为了演示注意事项.
        System.out.println(g);

    }
}
