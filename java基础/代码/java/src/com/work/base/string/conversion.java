package com.work.base.string;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/17 23:30
 * @注释  string类型与int类型的相互转换
 */
public class conversion {

    public static void main(String[] args) {
//        string -> int
        String str = "123";
        int n = 0;
        // 第一种转换方法：Integer.parseInt(str)
        n = Integer.parseInt(str);
        System.out.println(n);         //  123
        // 第二种转换方法：Integer.valueOf(str).intValue()
        n = 0;
        n = Integer.valueOf(str).intValue();
        System.out.println(n);       //  123

//        int -> string
        int num = 10;
        // 第一种方法：String.valueOf(i);
        num = 10;
        String str1 = String.valueOf(num);
        System.out.println("str:" + str1);
        // 第二种方法：Integer.toString(i);
        num = 10;
        String str2 = Integer.toString(num);
        System.out.println("str2:" + str2);
        // 第三种方法："" + i;
        String str3 = num + "";
        System.out.println("str3:" + str3);

    }

}
