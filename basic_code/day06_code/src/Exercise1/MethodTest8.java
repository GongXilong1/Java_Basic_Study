package Exercise1;

/**
 * 需求: 定义一个方法,copyOfRange(int[] array1, int from, int to)
 * 功能: 将数组array1中从索引from(包含from)开始到索引to结束(不包含to)的元素复制到新数组中.将数组返回.
 */
public class MethodTest8 {
    public static void main(String[] args) {
        // 1. 定义原始数组
        int [] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 2. 调用方法拷贝数据
        int[] copyArray1 = copyOfRange(array1, 3, 7);

        // 3. 遍历数组copyArray
        for (int i = 0; i < copyArray1.length; i++) {
            System.out.println(copyArray1[i] + " ");
        }

    }
    // 方法功能: 将数组array1中从索引from(包含from)开始到索引to结束(不包含to)的元素复制到新数组中.将数组返回.
    public static int[] copyOfRange(int[] array1, int from, int to){
        // 1. 定义数组--不知道具体元素,所以用动态数组
        int [] newArray = new int[to - from];

        // 2. 把原始数组array1中的from到to上对应的元素,直接拷贝到newArray中
        // 运用伪造索引的思想
        int index = 0;
        for (int i = from; i < to; i++) {
            // 数组赋值格式: 数组名[索引] = 数据值;
            newArray[index] = array1[i];
            index ++;
        }
        // 3. 把新数组返回
        return newArray;
    }
}
