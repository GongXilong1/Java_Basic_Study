package ArithmeticOperators;
/**
 * 算术运算符详解: 加法 减法 乘法
 * */
public class ArithmeticOperatorsDemo1 {
    public static void main(String[] args){

        // 加法+
        System.out.println(3 + 2);
        // 减法-
        System.out.println(6 - 1);
        // 乘法*
        System.out.println(7 * 9);

        // 如果在计算的时候有小数参与
        // NOTE 结论: 在代码中,如果有小数参与计算, 结果有可能不精确.为什么呢? 具体原因在JavaSE进阶中讲解.
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);

    }
}

