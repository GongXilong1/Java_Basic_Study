package SwitchDemo;
/**
 * 演示 default的位置和省略
 * 1. 位置: default 可以写在任意位置,只不过是习惯性写在下面.
 * 2. 省略: default可以省略,语法不会有问题,但是不建议省略.
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        int number = 100;
        switch (number){
            default:
                System.out.println("number的值不是1, 10或20");
                break;
            case 1:
                System.out.println("number的值为:1");
                break;
            case 10:
                System.out.println("number的值为:10");
                break;
            case 20:
                System.out.println("number的值为:20");
                break;

        }
    }
}

// NOTE: Java中同时注释多行的快捷键:Ctrl + Shift + / , 去掉注释要手动删除首尾符号.
// NOTE: 文档注释快捷键: /** + Enter, 效果如下:
/**
 * 内容
 */

