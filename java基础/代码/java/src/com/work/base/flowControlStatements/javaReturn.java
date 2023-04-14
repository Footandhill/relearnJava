package com.work.base.flowControlStatements;

import java.util.Scanner;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/14 22:49
 * @注释 return的使用
 */
public class javaReturn {

    public static void main(String[] args) {
// 当用户输入两个 double 类型的数值后需要计算这两个数值之和，而这两个操作数是可以变动的，但是求和的功能是不变的，这时就需要定义一个方法，只要在需要求和时调用该方法即可，该方法将计算之后的结果返回
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入操作数1：");
        double num1 = sc1.nextDouble();
        System.out.println("请输入操作数2：");
        double num2 = sc1.nextDouble();
        double sum = add(num1,num2);
        System.out.println(num1 + "+" + num2 + "=" + sum);
    }

    /**
     * 创建add() 方法，返回double 类型的数值
     *
     * @param i 操作数1
     * @param j 操作数2
     * @return 两个操作数之和
     */
    public static double add(double i, double j){
        double num = i + j;
        return num;
    }



}
