package cn.itcast.day04.demo01;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom
{
    public static void main(String[] args)
    {
        Random r=new Random();
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < 6; i++)
        {
            int num=r.nextInt(33)+1;
            //System.out.println("array()"+array[i]);
            list.add(num);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }



}
