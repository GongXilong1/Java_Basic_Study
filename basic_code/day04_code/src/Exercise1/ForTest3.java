package Exercise1;

/**
 * 需求: 求 1~5之间的和
 */
public class ForTest3 {
    public static void main(String[] args) {
         /* NOTE 1:求和的变量不能定义咋循环的里面,因为变量只在所属的大考括号中有效.
            2: 如果把变量定义在循环的里面,那么当前变量只能在本次循环有效,当本次循环结束之后,变量就会从内存中消失,
            第二次循环开始的时候,又会重新定义一个新的变量.
            NOTE 结论: 如果以后我们要写累加求和的变量,可以把变量定义在循环的外面.
            */

        int sum = 0;  // NOTE 变量(sum)的作用范围取决于它所在的(main)大括号

        // 1. 循环1~5,得到数字,再累加
        for(int i = 1; i <= 100; i++){
            sum = sum + i;      // 累加
            // sum += i;        // 第二种写法.
        }

        // 循环结束表示已经把1~5累加到sum中
        System.out.println(sum);
    }
}
