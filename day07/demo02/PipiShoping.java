package cn.itcast.day07.demo02;

import java.util.ArrayList;

public class PipiShoping
{
    public static void main(String[] args)
    {
        //调用void
        eachItem1();
        //调用二维数组
        ArrayList<ArrayList<Integer>> outerList = eachItem();
        for (int i = 0; i < outerList.size(); i++)
        {
            ArrayList<Integer> innerList = outerList.get(i);
            for (int j = 0; j < innerList.size(); j++)
            {
                System.out.print(innerList.get(j) + ",");
            }
            System.out.println();
        }
    }


    public static void eachItem1()
    {
        int[] item = new int[3];
        int count = 0;
        for (int i = 0; i < 60; i++)
        {
            for (int j = 0; j < 23; j++)
            {
                for (int k = 0; k < 30; k++)
                {
                    if (3.5 * i + 9.5 * j + 7 * k == 209)
                    {
                        item[0] = i;
                        item[1] = j;
                        item[2] = k;
                        System.out.println(i + "," + j + "," + k);
                        count++;
                    }
                }
            }
        }
        System.out.println("count=" + count);
    }

    public static ArrayList<ArrayList<Integer>> eachItem()
    {
        int count = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 60; i++)
        {
            for (int j = 0; j < 23; j++)
            {
                for (int k = 0; k < 30; k++)
                {
                    if (3.5 * i + 9.5 * j + 7 * k == 209)
                    {
                        //System.out.println(i+","+j+","+k);
                        ArrayList<Integer> subList = new ArrayList<>();
                        subList.add(i);
                        subList.add(j);
                        subList.add(k);
                        list.add(subList);
                        count++;
                    }
                }
            }
        }
        System.out.println("count=" + count);
        return list;
    }
}
