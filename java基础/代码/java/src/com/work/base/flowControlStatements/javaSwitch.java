package com.work.base.flowControlStatements;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/10 23:57
 * @注释  switch选择语句的使用
 */
public class javaSwitch {

    public static void main(String[] args) {
        String weekDate = "";
        Date date = new Date();
        int week1 = date.getDay();
        System.out.println(week1);
        Calendar calendar = Calendar.getInstance();  // 获取当前时间
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;  // 获取星期的第几日
        switch (week) {
            case 1:
                weekDate = "星期一";
                break;
            case 2:
                weekDate = "星期二";
                break;
            case 3:
                weekDate = "星期三";
                break;
            case 4:
                weekDate = "星期四";
                break;
            case 5:
                weekDate = "星期五";
                break;
            case 6:
                weekDate = "星期六";
                break;
            default:
                weekDate = "星期日";
                break;
        }
        System.out.println("今天是 " + weekDate);
    }

}
