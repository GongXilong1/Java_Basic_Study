package SwitchDemo;

/**
 *  case穿透:就是语句体中没有写 break导致的.
 *  Switch的执行流程: 首先还是会拿着小括号中的表达式的值跟下面的每一个case进行匹配,
 *  如果匹配上了, 就会执行对应的语句体, 如果此时发现了 break,那么结束整个Switch语句,
 *  如果没有发现 break,那么程序会继续执行下一个case,一直遇到 break或者右大括号为止.
 *  使用场景: 如果多个case的语句体重复了, 那么我们考虑利用case穿透取简化代码.
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        int number = 10;
        switch (number) {

            case 1:
                System.out.println("number的值为:1");
                break;
            case 10:
                System.out.println("number的值为:10");
                // break;
            case 20:
                System.out.println("number的值为:20");
                break;
            default:
                System.out.println("number的值不是1, 10或20");
                // break;
        }
    }
}

/* 运行结果:
number的值为:10
number的值为:20
*/
