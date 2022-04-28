package cn.itcast.day04.demo01;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CardPrint
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(display()));
        Random r = new Random();
        int num= r.nextInt(list.size());
        System.out.println(num);
        System.out.println(list.get(num));

        list.remove(num);


        //ArrayList<String> list1=new ArrayLis t<>();
        //list.add(num);


        //调用函数
        String[] dis = new String[54];
        dis = display();




        /**String[] dis=new String[54];
         dis=display();
         Random r = new Random();
         int num= r.nextInt(54);
         System.out.println(dis[num]);
         */
    }

    private static String[] display()
    {
        String[] str = new String[4];
        str[0] = "♦";
        str[1] = "♠";
        str[2] = "♥";
        str[3] = "♣";

        String[] n = new String[13];
        n[0] = "A";
        n[1] = "2";
        n[2] = "3";
        n[3] = "4";
        n[4] = "5";
        n[5] = "6";
        n[6] = "7";
        n[7] = "8";
        n[8] = "9";
        n[9] = "10";
        n[10] = "J";
        n[11] = "Q";
        n[12] = "K";

        String[] dis = new String[54];
        int index = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                dis[index] = str[i] + n[j];
                index++;
            }
        }
        dis[52] = "大王";
        dis[53] = "小王";
        return dis;
    }
}


