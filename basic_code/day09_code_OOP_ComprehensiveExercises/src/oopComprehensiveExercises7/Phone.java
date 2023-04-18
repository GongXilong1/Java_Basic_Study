package oopComprehensiveExercises6;

/**
 * 需求 :
 * 定义数组存储3部手机对象。
 * 手机的属性：品牌，价格，颜色。
 * 要求，计算出三部手机的平均价格
 */
public class Phone {
    // 属性
    private String brand;
    private int price;
    private String color;

    // 构造方法
    public Phone() {
    }

    public Phone(String brand, int price, String color) {
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
