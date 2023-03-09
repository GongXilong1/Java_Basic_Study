package Exercise1;

/**
 * 需求: 给出一个整数 x,如果 x是一个回文整数,打印 true,否则,返回 false.
 * 解释: 回文数是指正序(从左向右)和倒序(从右向左)读都是同样的整数.
 * 举例: 121是回文数,123 不是.
 */
public class WhileTest2 {
    public static void main(String[] args) {
        // 核心思路: 把数字倒过来跟原来的数字进行比较.
        // 1. 定义数字
        int x = 12345;        // 原始数字
        int tempNum = x;    // 定义一个临时变量,用来记录x原始的值,用于最后进行比较.
        int resultNum = 0;  // 倒序后组成的数字

        // 2. 利用循环开始从右往左获取每一位数字
        while(x != 0){
            // 从右往左获取每一位数字
            int unitsDigit = x % 10;
            // 修改一下x 记录的值
            x = x / 10;  //  12345/10=1234余5,java中整数相除得到整数所以剩下1234,去掉了5
            // 把当前获取到的数字拼接到最右边
            resultNum = resultNum * 10 + unitsDigit;
        }
        // 3. 打印resultNum
        System.out.println("原整数的倒序数是: " + resultNum);
        System.out.println(x);  // 此时最初的x已经为
        // 0

        // 4. 比较
        System.out.println("原整数是否为回文数情况: " + (resultNum == tempNum));

        /*// 1. 定义数字
        int x = 123;
        // 获取个位 十位 百位
        int unitsDigit = x % 10;  //定义个位变量unitsDigit
        int tensDigit = x / 10 % 10;
        int hundredDigit = x / 100 % 10;
        // 倒序拼接
        int result1 = unitsDigit * 100 + tensDigit * 10 + hundredDigit;
        System.out.println(result1);*/
    }
}
