package stringdemo;

import java.util.Scanner;

/**
 * 已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
 */
public class StringDemo4 {
    public static void main(String[] args) {
        /**
         * 读题拆解法:
         * 1. 定义变量
         * 2. 键盘录入用户名和密码
         * 3. 比较输入的信息和正确的信息
         * 4. 重复2-3,循环三次.
         */
        // 1. 定义两个变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        Scanner sc1 = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            // 2. 键盘录入用户名和密码
            System.out.println("请输入用户名: ");
            String inputtedUsername = sc1.next();
            System.out.println("请输入密码: ");
            String inputtedPassword = sc1.next();

            // 3. 比较
            if (inputtedUsername.equals(rightUsername) && inputtedPassword.equals(rightPassword)){
                System.out.println("用户登录成功!");
                break;
            }else {
                if (i == 2){
                    // 最后一次机会也输入错误,此时要提示账号被锁定.
                    System.out.println("账号" + inputtedUsername + "被锁定,请联系系统管理员!");
                }else {
                    System.out.println("用户登录失败,用户名或密码有误,您还剩下" + (2-i) + "次机会!");
                }
            }
        }
    }
}
