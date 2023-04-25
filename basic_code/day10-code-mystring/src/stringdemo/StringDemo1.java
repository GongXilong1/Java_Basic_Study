package stringdemo;

/**
 * 演示String的使用 赋值
 */
public class StringDemo1 {
    public static void main(String[] args) {
        // 1. 使用直接赋值的方式获取一个字符串对象
        String str1 = "avc";
        System.out.println(str1);  // 运行结果:avc

        // 2. 使用new的方式类获取一个字符串对象
        // 空参构造: 可以获取一个空白的字符串对象
        String str2 = new String();
        System.out.println("@" + str2 + "!");  // 运行结果:@!

        // 传递一个字符串,根据传递的字符串内容再创建一个新的字符串对象(多此一举的情况)
        String str3 = new String("abc");
        System.out.println(str3);  // 运行结果:abc

        /**
         * 传递一个字符数组,根据字符数组内容再创建一个新的字符串对象
         * 需求: 我要吸怪字符串的内容.  abc--Qbc
         * --实现过程: abc --> {'a','b','c'} --> {'Q','b','c'} --> "Qbc"
         */
        char[] chs1 = {'a','b','c','d'};
        String str4 = new String(chs1);
        System.out.println(str4);  // 运行结果:abcd


        /**
         * 传递字节数组,根据字节数组内的内存再创建一个新的字符串对象
         * 应用场景: 以后在网络中传输的数据其实都是字节信息
         * 我们一般要把字节信息进行转换,转换成字符串,此时就要用到这个构造了.
         */
        byte[] bytes1 = {97,98,99,100};
        String str5 = new String(bytes1);
        System.out.println(str5);  // 运行结果:abcd  -- 97,98,99,100对应的ascii码对应的是abcd.

    }
}
