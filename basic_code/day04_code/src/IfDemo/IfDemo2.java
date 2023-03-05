package IfDemo;
/**
 * if(关系表达式){
 *     语句体;
 * }
 *
 * if的注意点:
 * 1.大括号的开头可以另起一行书写,但是建议卸载第一行的末尾.
 * 2. 在语句体中, 如果只有一句代码,大括号可以省略不写,个人建议不要省略.
 * 3. 如果对一个布尔类型的变量进行判断, 不要用==号,直接把变量写在小括号里即可.
 *
 * */
public class IfDemo2 {
    public static void main(String[] args) {
        int number1 = 10;
        if(number1 >= 10){
            System.out.println("number1大于等于10");
        }

        boolean flag = true;
        if(flag){           // if(flag) 等同于 if(flag == true)
            System.out.println("flag的值为true");
        }
    }

}
