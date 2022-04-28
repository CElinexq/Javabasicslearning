package cn.itcast.day04.demo01;


import java.util.Scanner;

public class Prac
{
    public static void main(String[] args)
    {

        System.out.println("♥♠");


    }

    static void draw(int a, int b)
    {
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
