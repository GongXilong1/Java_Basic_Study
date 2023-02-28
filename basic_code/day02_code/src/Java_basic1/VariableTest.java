package Java_basic1;

public class VariableTest {
    public static void main(String[] args){
        // 一开始没有乘客
        int passengersCount = 0;  // 定义变量passengers_count表示乘客数量,并赋值初始值为0表示没有乘客.
        // 第一站: 上车一位乘客--在原有基础上加1
        passengersCount = passengersCount + 1;  // 先计算等号后边的,再将计算结果赋值给左边的变量.
        // 第二站: 上车两位乘客,下车一位乘客
        passengersCount = passengersCount + 2 - 1;
        // 第三站: 上车两位乘客,下车一位乘客
        passengersCount = passengersCount + 2 - 1;
        // 第四站: 下车一位乘客.
        passengersCount = passengersCount -1;
        // 第五站; 上车一位乘客.
        passengersCount = passengersCount + 1;
        // 请问: 到终点站,车上还剩几位乘客?
        System.out.println(passengersCount);


    }
}
