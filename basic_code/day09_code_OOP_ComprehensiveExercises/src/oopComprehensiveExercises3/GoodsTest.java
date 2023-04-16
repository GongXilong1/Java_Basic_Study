package oopComprehensiveExercises3;

/**
 * 商品测试类
 */
public class GoodsTest {
    public static void main(String[] args) {
        // 1. 创建一个数组--动态初始化
        Goods[] array1 = new Goods[3];

        // 2. 创建三个商品对象
        Goods g1 = new Goods("001", "华为mate50",5999,100);
        Goods g2 = new Goods("002", "华为P50",5699,100);
        Goods g3 = new Goods("003", "安溪铁观音",999,100);

        // 3. 把商品添加到数组中
        array1[0] = g1;
        array1[1] = g2;
        array1[2] = g3;

        // 4. 遍历数组--验证
        for (int i = 0; i < array1.length; i++) {
            Goods goods1 = array1[i];
            System.out.println("商品ID:" + goods1.getId() + "," + goods1.getName() + "," + goods1.getPrice() + "元,库存:" + goods1.getCount());
        }
    }
}
