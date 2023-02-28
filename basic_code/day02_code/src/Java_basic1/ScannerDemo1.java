package Java_basic1;

// 1. 导包, 找到Scanner这个这个类在哪, NOTE 导包要写在类定义的上面
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args){

        // 2. 创建对象,表示现在准备要用Scanner这个类
        Scanner sc1 = new Scanner(System.in);

        System.out.println("请输入整数: ");
        // 3. 接收数据  -- 变量i记录了键盘录入的数据
        int i = sc1.nextInt();  //sc1对象调用nextInt方法接收到的数据赋值给变量i.
        System.out.println(i);

    }
}
