package ComprehensiveExercises;

/**
 * 需求：
 * 某系统的数字密码（大于0），比如 1983，采用加密方式进行传输。
 * 规则如下：
 * 先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
 * 分析:
 * 1. 把整数里面的每一位数放到数组中
 * 2. 加密
 * 3. 把数组中的每一个数字进行拼接,变成加密之后的结果.
 */
public class ComprehensiveExercises6 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 9, 8, 3};
        // 每位数+5
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] + 5;
        }
        // 对10取余
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] % 10;
        }
        // 将所有数字进行反转
        for (int i = 0, j = array1.length-1;  i < j; i++, j--) {  // 定义指针i和j,i增加,j减少,当j>i时候循环结束
            int temp = array1[i];  // 定义temp变量保存array1[i]原始的值.
            array1[i] = array1[j];  // array1[j]的值赋值给array1[i]
            array1[j] = temp;  // temp变量的值,即array1[i]原值的值赋值给array1[j]
        }
        // 到此,数组array1[i]中的值为: 8 3 4 6 .

        // 循环遍历,把数组中的每一个数字进行拼接,变成加密之后的结果
        int encryptedNumbers = 0;  // 定义加密数字变量并赋值初始值为0
        for (int i = 0; i < array1.length; i++) {
            encryptedNumbers = encryptedNumbers * 10 + array1[i];
            // NOTE 算法过程:第一次循环:0*10+8=8;第二次:8*10+3=83;第三次:83*10+4=834;第四次:834*10+6=8346;最终:8436
        }
        System.out.println(encryptedNumbers);
    }
}
