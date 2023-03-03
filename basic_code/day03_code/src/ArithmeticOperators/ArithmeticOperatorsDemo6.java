package ArithmeticOperators;
/**
 * 演示 自增运算符 ++ 参与计算
 * */
public class ArithmeticOperatorsDemo6 {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;  // 先用后加  x先赋值给y,再x+1
        int z = ++x;  // 先加后用  x先+1,再赋值给z
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);


    }
}
