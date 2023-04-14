package com.work.base.flowControlStatements;

import java.util.Scanner;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/14 0:22
 * @注释  for循环语句的执行
 */

public class javaFor {

    public static void main(String[] args) {
//        同样是计算0-5 的和，使用 for 循环的实现代码
        int a = 0;
        for (int i = 0; i <= 5; i++) {
            a+=i;
        }
        System.out.println(a);          //15

//        编写一个 Java 程序，统计某超市上半年的总销售量，要求由用户输入每月的销量
        int m = 0;
        int t = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            System.out.println("请输入第" + i + " 个月的销售数量：");
            m = sc.nextInt();
            t+=m;
        }
        System.out.println("上半年的销售总量为：" + t);

    }

}
