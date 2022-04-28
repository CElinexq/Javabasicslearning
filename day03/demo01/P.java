package cn.itcast.day03.demo01;

import java.util.ArrayList;
import java.util.Random;

public class P
{
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("赵丽颖");
        list.add("古力娜扎");
        list.add("张靓颖");
        list.add("李小璐");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.remove(3) );
        System.out.println(list);

    }
}
