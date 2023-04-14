package com.work.base.flowControlStatements;

import java.util.Scanner;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/17 21:40
 * @注释  练习：杨辉三角
 */
public class demo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int sum = sc.nextInt();
        calculate(sum);
    }

    public static void calculate(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(sum(i,j) + " ");
            }
            System.out.println("");
        }
    }
    public static int sum(int x, int y) {
        if (y == 1 || y == x) {
            return 1;
        }
        int c = sum(x - 1, y - 1) + sum(x - 1, y);
        return c;
    }

}
