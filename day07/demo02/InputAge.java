package cn.itcast.day07.demo02;

import java.util.Scanner;

public class InputAge
{
    public static void main(String[] args)
    {
        while(true){
            if(Validation()){
             return;
            }
            System.out.println("请重新输入：");
        }
    }

    public static boolean Validation()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        String input = sc.next();

        if (IsTextAreAllNumber(input))
        {
            System.out.println("Valid");
            return true;
        }
        else
        {
            System.out.println("InValid");
            return false;
        }
    }

    //判断一个字符串中每个字符是不是都是0-9
    public static boolean IsTextAreAllNumber(String inputText)
    {
        int index = 0;
        while (index < inputText.length())
        {
            char c = inputText.charAt(index);
            index++;
            if (isCharNumber(c) == false)
            {
                return false;
            }
        }
        return true;
    }

    //判断一个字符是否是0-9
    public static boolean isCharNumber(char c)
    {

        if (c >= '0' && c <= '9')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
