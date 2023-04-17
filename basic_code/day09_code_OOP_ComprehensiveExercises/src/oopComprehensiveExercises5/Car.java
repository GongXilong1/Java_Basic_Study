package oopComprehensiveExercises5;

/**
 * 汽车的 JavaBean类
 */
public class Car {
    // 属性
    private String brand;
    private int price;
    private String color;

    // 构造方法--空参和有参
    public Car() {
    }

    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }


    // get和set方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
