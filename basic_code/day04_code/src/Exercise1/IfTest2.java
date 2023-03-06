package Exercise1;
/**
 * 汽车无人驾驶会涉及到大量的判断,当行驶时遇到红绿灯时,就会判断:
 * 如果是红灯亮,就停止
 * 如果是黄灯亮,就减速
 * 如果是绿灯亮,就行驶
 */
public class IfTest2 {
    public static void main(String[] args) {
        // 1. 定义三个变量表示等的状态  true为亮 false为灭
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;

        // 2. 判断
        if(isLightGreen){
            System.out.println("GoGoGo");
        }

        if(isLightYellow){
            System.out.println("Slow!!!");
        }

        if(isLightRed){
            System.out.println("Stop!!!");
        }

    }
}
