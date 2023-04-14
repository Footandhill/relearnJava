package com.work.base.string;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/25 22:47
 * @注释  字符串的拼接
 */
public class splice {

    public static void main(String[] args) {
        int[] no = new int[] { 501, 101, 204, 102, 334 }; // 定义学号数组
        String[] names = new String[] { "张城", "刘丽丽", "李国旺", "孟红霞", "贺宁" }; // 定义姓名数组
        String[] classes = new String[] { "数学", "语文", "数学", "英语", "英语" }; // 定义课程数组
        System.out.println("本次考试学生信息如下：");
        // 循环遍历数组，连接字符串
        for (int i = 0; i < no.length; i++) {
            System.out.println("学号：" + no[i] + "|姓名：" + names[i] + "|课程：" + classes[i] );
        }

        String info = "三国演义、";
        info = info.concat("西游记、");
        info = info.concat("水浒传、");
        info = info.concat("红楼梦");
        System.out.println(info);
        String cn = "中国";
        System.out.println(cn.concat("北京").concat("海淀区").concat("人民公园"));

    }


}
