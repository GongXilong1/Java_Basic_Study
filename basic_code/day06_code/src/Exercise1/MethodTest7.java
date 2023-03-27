package Exercise1;

/**
 * 定义一个方法判断数组中的某一个数是否存在,将结果返回给调用处.
 */
public class MethodTest7 {
    public static void main(String[] args) {
        // 1. 定义数组
        int[]array1 = new int[]{11, 22, 33, 44, 55, 66};

        // 2.调用方法--判断一个数字在数组中是否存在
        boolean result1 = contains(array1, 55);
        System.out.println("判断结果为: " + result1);
    }

    public static boolean contains(int[]array1, int number){
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == number){
                return true;
            }
        }
        // NOTE 什么时候才能断定number在数组中是不存在的?.
        // 答: 当数组里面所有的数据全部比较完毕之后,才能断定.所以 return false; 要写在循环的外面.
        return false;
    }
}

// NOTE return和 break关键字的区别:
/**
 * return关键字: 其实跟循环没有什么关系,跟方法有关的,表示 1结束方法,2返回结果,
 *      如果方法执行到了 return, 那么整个方法全部结束, 里面的循环也会随之结束了.
 * break关键字: 其实跟方法没有什么关系,是结束循环或者switch的
 */

