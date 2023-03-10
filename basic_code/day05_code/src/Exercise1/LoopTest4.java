package Exercise1;

/**
 * 优化:
 * 需求: 键盘录入一个正整数 x,判断该整数是否为一个质数.
 * 质数: 质数是指在大于 1的自然数中，除了 1和它本身以外不再有其他因数的自然数。
 * 简化的思路:
 * 以 81为例,
 * 以 81的平方根 9为中心,而且 a * b = 81,
 * 那么a 和 b中,其中有一个必定大于等于 9的,另外一个是小于等于 9的.
 */
public class LoopTest4 {
    public static void main(String[] args) {
        // 判断 100000
        int number = 100;
        // 如果这个范围之内,所有的数字都不能被number整除,那么number就一定是一个质数
        /*for (int i = 2; i <= number的平方根; i++) {
            后续学习再完成此处代码
        }*/
    }
}
