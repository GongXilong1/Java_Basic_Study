/*
 * 实现功能: 可以输入两个数字,并做求和运算.
 * */

package Java_basic1;
// 1. 导包
import java.util.Scanner;

public class ScannerTest1 {
    public static void main(String[] args){
        // 2. 创建对象
        Scanner sc1 = new Scanner(System.in);

        System.out.println("请输入第一个数字: ");
        // 3. 接收数据
        int number1 = sc1.nextInt();

        System.out.println("请输入第二个数字: ");
        // 再次接收第二个数据
        int number2 = sc1.nextInt();

        System.out.println(number1 + number2);

    }
}
