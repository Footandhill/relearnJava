package com.work.base.flowControlStatements;

import java.util.Scanner;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/10 23:03
 * @注释 if-else 选择语句的使用
 */
public class javaIfElse {

    public static void main(String[] args) {
        //编写一个 Java 程序，允许用户从键盘输入一个数字，再判断该数是否大于 100。使用 if 语句的实现代码如下：
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input);
        // 判断用户输入的数据是否大于100
        if (input > 100) {
            System.out.println("输入的数字大于100");
        }
        // 判断用户输入的数据是否等于100
        if (input == 100) {
            System.out.println("输入的数字等于100");
        }
        // 判断用户输入的数据是否小于100
        if (input < 100) {
            System.out.println("输入的数字小于100");
        }
//假设有 num1 和 num2 两个变量，它们的值分别是 50 和 34。下面编写程序，要求使用 if 语句判断 num1 和 num2 的大小关系，并输出比较结果
        int num1 = 35;
        int num2 = 40;
        if (num1>num2){
            System.out.println("num1大于num2");
        }else if (num1<num2) {
            System.out.println("num1等于num2");
        }else {
            System.out.println("num1小于num2");
        }
//在上述两个案例代码中，由于每个 if 语句的语句块中只包含一条语句，所以省略了大括号。本实例在登录系统中要求用户名、密码和验证码都必须正确，否则将显示登录失败及错误提示。其中的语句块有多条语句，所以需要使用大括号
        String username = "admin"; // 用户名
        String userpass = "123456"; // 密码
        String code = "0000"; // 验证码
        if (username != "admin" && userpass != "123456" && code != "0000") {
            System.out.println("登录失败！");
            System.out.println("请检查输入的用户名、密码和验证码是否正确！");
        }
    }

}
