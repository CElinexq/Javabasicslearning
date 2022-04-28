package cn.itcast.day07.demo01;

public class Practice
{
    public static void main(String[] args)
    {
        for (int num = 1; num <=1000; num++)
        {
            if(isPrism(num))
            {
                System.out.println(num);;
            }
        }
    }

    public static boolean isPrism(int num)
    {
        for (int i = 2; i < num; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
