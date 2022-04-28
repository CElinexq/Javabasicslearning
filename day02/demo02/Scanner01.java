package cn.itcast.day02.demo02;
/** 1.导包
*/
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /** 2.创建
        备注：System.in 代表从键盘输入
         */
        Scanner sc=new Scanner(System.in);
        /** 3.使用
         * 输入一个int数字：int num=sc.nextInt();
         * 输入一个字符串：String str=sc.next();
         */
        int num=sc.nextInt();
        System.out.println("输入数字是："+num);
        String str= sc.next();
        System.out.println("输入字符是："+str);
    }
}
