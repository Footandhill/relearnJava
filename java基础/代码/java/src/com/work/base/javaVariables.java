package com.work.base;

public class javaVariables {
    public static void main(String[] args) {

//        字符类型变量的声明
        String a;
//        布尔类型变量的声明
        boolean isb;
//        整型变量的声明
        int c;

//        变量赋值
        // 先声明，后赋值
        String username;
        username ="琪琪";
//        直接赋值
        char usersex='女';
        // 同时声明多个变量
        String address,phone,tel;
        // 同时声明并初始化多个变量
        int num1=12,num2=23,result=35;

//        创建类对象
        DataClass zc = new DataClass();

        // 对象名.变量名调用实例变量（全局变量）
        System.out.println(zc.name);        // null
        System.out.println(zc.age);         // 0
        // 对象名.变量名调用静态变量（类变量）
        System.out.println(zc.website);     // C语言中文网
        System.out.println(zc.URL);         // http://c.biancheng.net
        // 类名.变量名调用静态变量（类变量）
        System.out.println(DataClass.website);  // C语言中文网
        System.out.println(DataClass.URL);      // http://c.biancheng.net

    }

}
class DataClass {
    String name; // 成员变量、实例变量
    int age; // 成员变量、实例变量
    static final String website = "C语言中文网"; // 成员变量、静态变量(类变量)
    static String URL = "http://c.biancheng.net"; // 成员变量、静态变量(类变量)
}