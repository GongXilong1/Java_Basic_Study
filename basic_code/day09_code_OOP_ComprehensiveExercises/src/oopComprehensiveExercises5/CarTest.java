package oopComprehensiveExercises5;

import java.util.Scanner;

/**
 * Car类测试类
 */
public class CarTest {
    public static void main(String[] args) {
        // 1. 创建一个数组用来存3个汽车对象
        Car[] array1 = new Car[3];

        // 2. 创建汽车对象,数据来自于键盘录入
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            // 创建汽车的对象-- NOTE 此处要这样写在循环的里面,每一次循环都是创建一个新的car对象.
            Car c1 = new Car();
            // 录入品牌
            System.out.println("请输入汽车的品牌: ");
            String brand1 = sc1.next();
            c1.setBrand(brand1);
            // 录入价格
            System.out.println("请输入汽车的价格: ");
            int price1 = sc1.nextInt();
            c1.setPrice(price1);
            // 录入颜色
            System.out.println("请输入汽车的颜色: ");
            String color1 = sc1.next();
            c1.setColor(color1);

            // 把汽车对象添加到数组当中
            array1[i] = c1;

        }
        // 3. 遍历数组
        for (int i = 0; i < array1.length; i++) {
            Car car1 = array1[i];
            System.out.println(car1.getBrand() + "," + car1.getPrice() + "元," + car1.getColor());
        }

    }
}
