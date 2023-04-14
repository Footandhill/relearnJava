package com.work.base;

public class javaDateTypeConversion {
    public static void main(String[] args) {
        byte a = 10;
        short b = 2;
        int c = 30;
        long d = 200;
        float e = 25.2f;
        char h = 's';
        double f = a+b+c+d+e+h;
        System.out.println(f);      //  382.200... 可能会有数据的溢出问题
        int i = h;
        System.out.println(i);  // i = 115
//        强制转换
        int w = (int)f;
        System.out.println(w);
    }
}
