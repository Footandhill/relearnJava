package com.work.base.flowControlStatements;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/13 23:52
 * @注释  while和do_while循环语句的使用
 */
public class javaWhile {

    public static void main(String[] args) {
//        使用 while 语句计算 10 的阶乘
        int i = 0;
        int n = 0;
        while (i<5){
            n = n+i;
            i++;
        }
        System.out.println(n);     // 10


//        编写一个程序，计算 10 的阶乘
        int number = 1,result = 1;
        do {
            result*=number;
            number++;
        }while(number <= 10);
        System.out.print("10阶乘结果是："+result);      //3628800

//        在一个图书系统的推荐图书列表中保存了 50 条信息，现在需要让它每行显示 10 条，分 5 行进行显示。下面使用 do-while 循环语句来实现这个效果
        int books = 50;
        do{
            System.out.print(books+"\t");
            if (books %10 == 1){
                System.out.println();
            }
            books --;
        }while (books>0);

    }


}
