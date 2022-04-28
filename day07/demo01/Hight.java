package cn.itcast.day07.demo01;

import java.math.MathContext;
import java.util.Scanner;

public class Hight
{

    public static void main(String[] args)
    {
        //下次返回的高度为h

        //第1次返回高度为100*0.5
        //第2次返回高度为100*0.5*0.5
        //第n次返回高度为100*Math.pow(0.5,n)
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字：");
        int num = sc.nextInt();
        double h=GetHeight(num);
        System.out.println("第" + num + "次返回高度为" + h + "米");

        double l=100;
        for (int i = 1; i <=num; i++)
        {
           l+=GetHeight(i);
        }
        System.out.println("第" + num+"次落地经过路线总长度"+l);


    }

    public static double GetHeight(int num){
        double h = 100;
        for (int i = 0; i < num; i++)
        {
            h *= 0.5;
        }
        return h;
    }


}