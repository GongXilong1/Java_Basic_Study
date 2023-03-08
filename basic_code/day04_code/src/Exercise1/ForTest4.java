package Exercise1;

/**
 * 需求:在实际开发中，如果要获取一个范围中的每一个数据时，会用到循环。
 * 但是此时，大多情况下，不会获取所有的数据，而是获取其中符合要求的数据。
 * 此时就需要循环和其他语句结合使用了。
 * 比如: 求1-100之间的偶数和.
 */
public class ForTest4 {
    public static void main(String[] args) {
        int sum = 0;

        // 1. 获取1~100之间的每个数
        for(int i = 0; i <= 100; i++){
            // 2. 累加求和(先判断,再求和)
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);  // NOTE 在 for循环外打印 sum,不然每次的累加循环结果都会被打印.
    }
}
