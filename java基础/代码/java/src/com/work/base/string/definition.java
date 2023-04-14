package com.work.base.string;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/17 22:25
 * @注释  字符串的定义
 */
public class definition {

    public static void main(String[] args) {

//        直接定义字符
        String str = "Hello Java";
        // 或
        String str1;
        str1 = "Hello Java";

//        使用string类定义
        // 初始化一个新创建的 String 对象，表示一个空字符序列。
        String s = new String();

        // 初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列
        String s1 = new String("Hello Java");
        String s2 = new String(str1);

        // 分配一个新的字符串，将参数中的字符数组元素全部变为字符串
        char a[] = {'H','e','l','l','0'};
        String s3 = new String(a);
        System.out.println(s3);

        // 分配一个新的 String，它包含来自该字符数组参数一个子数组的字符
        String s4 = new String(a,1,4);
        System.out.println(s4);


    }

}
