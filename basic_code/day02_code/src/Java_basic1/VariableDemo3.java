package Java_basic1;

// 整数和小数取值范围大小关系: double>float>long>int>short>byte.

public class VariableDemo3 {
    public static void main(String[] args){
        // byte  取值范围:-128~127
        byte b1 = 10;
        System.out.println(b1);

        // short  取值范围:-32768~32767
        short s1 = 20000;
        System.out.println(s1);

        // int  取值范围:-2147483648~2147483647  (10位数)
        int i = 1588888888;
        System.out.println(i);

        // long  取值范围:19位数
        // NOTE 如果要定义long类型的变量,需要在数据值后加一个L(建议大写)作为后缀.
        long n = 18688888888888888L;
        System.out.println(n);


        // float  浮点数
        // NOTE 定义float类型变量的时候,数据值也需要加一个F作为后缀.
        float f1 = 10.168888888F;
        System.out.println(f1);

        // double  浮点数
        double d1 = 1.99588888888888888888999;
        System.out.println(d1);

        // char
        char c = '中';
        System.out.println(c);

        // boolean  -- true/false
        boolean o = true;
        System.out.println(o);


    }
}

// 整数和小数取值范围大小关系: double>float>long>int>short>byte.
