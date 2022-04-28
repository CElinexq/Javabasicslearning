package cn.itcast.day07.demo02;

import java.util.Scanner;

public class ExceptionDemo01
{
    //    使用异常处理再做一次用户输入验证，仅接受用户输入整数。
    public static void main(String[] args)
    {
        input();

    }

    public static void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入：");
        try
        {
            int num = s.nextInt();
            System.out.println(num);
        } catch (Exception e)
        {


            System.out.println("wrong");
        }

    }
}

