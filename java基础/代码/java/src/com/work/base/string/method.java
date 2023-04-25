package com.work.base.string;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/25 23:27
 * @注释  字符串的常用方法
 */
public class method {
    public static void main(String[] args) {
//        trim()
        String str = " he llo ";         // 使用trim()方法无法去除‘字符串内’的空格
        System.out.println(str.length());    // 输出 7
        System.out.println(str.trim().length());    // 输出 5
        System.out.println("--------------------------------------");
//        str.replace()
        String words = "hello java,hello php";
        System.out.println("原始字符串是'"+words+"'");
        System.out.println("replace(\"l\",\"D\")结果："+words.replace("l","D"));
        System.out.println("replace(\"hello\",\"你好\")结果："+words.replace("hello","你好 "));
        words = "hr's dog";
        System.out.println("原始字符串是'"+words+"'");
        System.out.println("replace(\"r's\",\"is\")结果："+words.replace("r's","is"));
        System.out.println("--------------------------------------");
//        str.replaceFirst()
        String words1 = "hello java，hello php";
        String newStr = words1.replaceFirst("hello","你好 ");
        System.out.println(newStr);    // 输出：你好 java,hello php
        System.out.println("--------------------------------------");
//        str.replaceAll()
        String words2 = "hello java，hello php";
        String newStr2 = words2.replaceAll("hello","你好 ");
        System.out.println(newStr2);    // 输出：你好 java,你好 php
        System.out.println("-----------------------------------------");
//        str.substring()
        String day = "Today is Monday";    //原始字符串
        System.out.println("substring(0)结果："+day.substring(0));
        System.out.println("substring(2)结果："+day.substring(2));
        System.out.println("substring(10)结果："+day.substring(10));
        System.out.println("substring(2,10)结果："+day.substring(2,10));
        System.out.println("substring(0,5)结果："+day.substring(0,5));
        System.out.println("-----------------------------------------");
//        str.split()
        String Colors = "Red,Black|White.Yellow,Blue";
//        ",|\\.|\\|"当一个字符串有多个需要进行分割的数据，可以使用‘|’来作为连字符
//       “.”和“|”都是转义字符，必须得加“\\”，进行转义
        String[] arr1 = Colors.split(",|\\.|\\|"); // 不限制元素个数
        String[] arr2 = Colors.split(",", 3); // 限制元素个数为3
        System.out.println("所有颜色为：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("前三个颜色为：");
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }
        System.out.println("-----------------------------------------");
//        indexOf()
        String words3 = "today,monday,sunday";
        System.out.println("原始字符串是'"+words3+"'");
        System.out.println("indexOf(\"day\")结果："+words3.indexOf("day"));   	// 2
        System.out.println("indexOf(\"day\",5)结果："+words3.indexOf("day",5));   //9
        System.out.println("indexOf(\"o\")结果："+words3.indexOf("o"));   	//1
        System.out.println("indexOf(\"o\",6)结果："+words3.indexOf("o",6));   //7
        System.out.println("-----------------------------------------");
//        lastIndexOf()
        String words4="today,monday,Sunday";
        System.out.println("原始字符串是'"+words4+"'");
        System.out.println("lastIndexOf(\"day\")结果："+words4.lastIndexOf("day"));        //16
        System.out.println("lastIndexOf(\"day\",5)结果："+words4.lastIndexOf("day",5));        //2
        System.out.println("lastIndexOf(\"o\")结果："+words4.lastIndexOf("o"));        //7
        System.out.println("lastlndexOf(\"o\",6)结果："+words4.lastIndexOf("o",6));        //1
        System.out.println("-----------------------------------------");
//        chatAt()
        String words5 = "today,monday,sunday";
        System.out.println(words5.charAt(0));    // 结果：t
        System.out.println(words5.charAt(1));    // 结果：o
        System.out.println(words5.charAt(8));    // 结果：n
        System.out.println("-----------------------------------------");

    }

}
