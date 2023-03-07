package Exercise1;
/**
 * 使用 if和 else if 实现三次判断.
 * 汽车无人驾驶会涉及到大量的判断,当行驶时遇到红绿灯时,就会判断:
 * 如果是红灯亮,就停止
 * 如果是黄灯亮,就减速
 * 如果是绿灯亮,就行驶
 */
public class IfTest9 {
    public static void main(String[] args) {
        // 1. 定义三个变量表示等的状态  true为亮 false为灭
        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = false;

        // 2. 判断--此种if判断形式提高代码效率,满足第一个if后,后续代码将不执行.
        if(isLightGreen){
            System.out.println("GoGoGo");
        } else if (isLightYellow){
            System.out.println("Slow!!!");
        } else if (isLightRed) {
            System.out.println("Stop!!!");
        }
        // else 省略
    }
}
