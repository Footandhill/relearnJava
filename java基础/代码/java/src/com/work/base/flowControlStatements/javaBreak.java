package com.work.base.flowControlStatements;

import java.util.Scanner;

/**
 * @author 郭英杰
 * @version 1.0(1 / 3)
 * @Date 2023/4/14 23:11
 * @注释 break关键字的使用
 */
public class javaBreak {

    public static void main(String[] args) {
        /*
        小明参加了一个 1000 米的长跑比赛，在 100 米的跑道上，他循环地跑着，每跑一圈，剩余路程就会减少 100 米，要跑的圈数就是循环的次数。
        但是，在每跑完一圈时，教练会问他是否要坚持下去，如果回答 y，则继续跑，否则表示放弃。
         */
        Scanner input = new Scanner(System.in);
        int lc = 1000;
        int yc = 100;
        int qs = lc/yc;
        for (int i = 1; i <= qs; i++) {
            System.out.println("跑的是第" + (i) + "圈");
            System.out.println("还能坚持吗？");
            String answer = input.next();
            if (!answer.equals("y")){
                System.out.println("放弃");
                break;
            }else if(i == 10){
                System.out.println("厉害！跑完了👍");
                break;
            }
            System.out.println("继续!");
        }
//        两层循环
//        带标签的返回值
        a : for (int i = 1; i < 6; i++) {
            System.out.print(i+"\t");
            for (int j = 0; j < 6; j++) {
                System.out.print(j);
                if (j > 3){
                    break a;
                }
            }
            System.out.println();
        }


    }


}
