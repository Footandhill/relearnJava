package com.work.base.flowControlStatements;


/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/14 0:58
 * @注释  foreach循环的应用
 */

public class javaForEach {

    public static void main(String[] args) {
//        声明数组
        /*
        一维数组：
        1、int[] arr = new int[2];
        2、int[] arr;  arr = new int[]{1,2,3,4}
        3、 下面创建方式：
         */
        int[] arr = {1,2,3,4,5};
        for (int a:arr) {
            System.out.println(a);
        }

        System.out.println("--------------------");
        for (int a:arr) {
            a = 0;
            System.out.println(a);
        }
        System.out.println(arr[0]+arr[1]);          //3



    }

}
