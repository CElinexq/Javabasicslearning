package cn.itcast.day06.demo01;

import java.util.Date;

public class StringGet
{
    public static void main(String[] args)
    {
        int length = "abekmvisokemf".length();
        System.out.println(length);

        String str1="Hello";
        String str2="World";
        String str3= str1.concat(str2);
        System.out.println(str3);
        String str4=str2.concat(str1);
        System.out.println(str4);

        char c = "elinon".charAt(0);
        System.out.println(c);
        int e = "hello2".indexOf('u');
        System.out.println(e);

        Date date=new Date();
        String s=String.format("%tc",date);
        System.out.println(s);

        String str0="jnihallejl239lni5";
        char[] chars = str0.toCharArray();
        
    }
}
