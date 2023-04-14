package com.work.base.flowControlStatements;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/14 0:40
 * @注释 循环嵌套  练习：九九乘法表
 */

public class demo01 {

    public static void main(String[] args) {
        System.out.println("乘法口诀表：");
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        int i = 1;
        do {
            int j = 1;
            while (j<=i){
                System.out.print(j + "*" + i + "=" + j * i + "\t");
                j++;
            }
            System.out.println();
            i++;
        }while (i<=9);

    }


}
