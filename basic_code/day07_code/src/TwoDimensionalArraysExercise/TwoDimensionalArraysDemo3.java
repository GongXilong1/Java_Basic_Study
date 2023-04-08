package TwoDimensionalArraysExercise;

/**
 * 某商场每个季度的营业额如下: 单位(万元)
 * 第一季度: 22,66,44
 * 第二季度: 77,33,88
 * 第三季度: 25,45,65
 * 第四季度: 11,66,99
 * 要求计算出每个季度的总营业额和全年的总营业额.
 */
public class TwoDimensionalArraysDemo3 {
    public static void main(String[] args) {
        // 1. 创建二维数组并存储数据--静态
        int[][] yearArray = new int[][] {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int yearSum = 0;  // 定义全年营业额变量并赋值初始值为0.
        // 2. 遍历二维数组,得到每一个一维数组并求和
        for (int i = 0; i < yearArray.length; i++) {
            // i 二维数组中的每一个索引
            // yearArray[i] 表示二维数组中的每一个元素,即一维数组
            int[] quarterArray = yearArray[i];  // 定义一维数组quarterArray,值为yearArray[i]
            int quarterlySum1 = getQuarterlySum(quarterArray);  // 调用方法计算当前季度的总和
            System.out.println("第" + (i + 1) + "季度营业额是: " + quarterlySum1 + "万元");
            yearSum = yearSum + quarterlySum1;
        }
        System.out.println("全年的总营业额为: " + yearSum + "万元");
    }

    // 定义一个方法,计算每一个季度的营业额
    public static int getQuarterlySum(int[] array1){
        int quarterlySum = 0;
        for (int i = 0; i < array1.length; i++) {
            quarterlySum = quarterlySum + array1[i];
        }
        return quarterlySum;
    }
}
