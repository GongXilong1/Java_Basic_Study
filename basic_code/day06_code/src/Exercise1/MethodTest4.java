package Exercise1;

/**
 * 需求: 使用方法重载的思想,设计比较两个整数是否相同的方法
 * 要求: 兼容全整数类型,(byte, short, int, long)
 */
public class MethodTest4 {
    public static void main(String[] args) {
        // 调用
        // compare(10, 20);
        // compare((byte)10, (byte)20);
        byte b1 = 10;
        byte b2 = 20;
        compare(b1, b2);

    }
    // 会把相同功能的方法命名一致
    public static void compare(byte b1, byte b2){
        System.out.println("byte");
        System.out.println(b1 == b2);
    }
    public static void compare(short s1, short s2){
        System.out.println("short");
        System.out.println(s1 == s2);
    }
    public static void compare(int i1, byte i2){
        System.out.println("int");
        System.out.println(i1 == i2);
    }
    public static void compare(long n1, long n2){
        System.out.println("long");
        System.out.println(n1 == n2);
    }

}
