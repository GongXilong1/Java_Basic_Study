package SwitchDemo;
/**
 * 利用 Switch语句练习选择吃面:兰州拉面, 武汉热干面, 北京炸酱面, 陕西油泼面
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        // 1. 定义变量记录心里想吃的面
        String noodles1 = "陕西油泼面";
        // String noodles1 = "海鲜龙虾面";

        // 2. 拿着这个面利用Switch跟四种面匹配
        switch (noodles1){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
