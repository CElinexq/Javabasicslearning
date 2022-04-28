package cn.itcast.day04.demo01;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraydemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println("请输入数组" + i + ":");
         list.add(sc.nextInt());
        }
        System.out.println(list.size());

    }
    public static int sum(){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++)
        {
            System.out.println("请输入数组" + i + ":");
            array[i] = sc.nextInt();

        }
        //System.out.println(array[0]);
        //System.out.println(array[1]);
        //System.out.println(array[2]);
        int sum=array[0]+array[1]+array[2];
        System.out.println("总和="+sum);
        return sum;
    }
}
