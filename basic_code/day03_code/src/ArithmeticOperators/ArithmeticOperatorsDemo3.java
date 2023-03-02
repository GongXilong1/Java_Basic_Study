package ArithmeticOperators;
/**
 * 演示 隐式转换和强制转换
 * */
import java.sql.SQLOutput;

public class ArithmeticOperatorsDemo3 {
    public static void main(String[] args) {
        // 隐式转换
        byte b1 = 10;
        byte b2 = 20;
        int result1 = b1 + b2;
        System.out.println(result1);  // int 30

        // 需要强制转换b1 + b2 计算之后的结果
        byte result2 = (byte)(b1 + b2);
        System.out.println(result2);  // byte 30


    }
}
