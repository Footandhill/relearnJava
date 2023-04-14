package com.work.base;

/**
 * @author 郭英杰
 * @version 1.0(1/3)
 * @注释：常量的创建和使用
 */
public class javaConstants {
//    静态常量
    public static final double PI = 3.14;

//    声明成员常量
    final int X = 3;

    public static void main(String[] args) {
//        声明局部常量
        final String Y = "asa";

        System.out.println(PI);
//        System.out.println(X);          无法从static中引入非static字段
        System.out.println(Y);
    }

}
