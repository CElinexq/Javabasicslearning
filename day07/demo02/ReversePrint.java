package cn.itcast.day07.demo02;

//14. 写一个程序，把用户输入的文字反向输出
//        示例输入：Hello World
//        示例输出：dlrow olleh

public class ReversePrint
{
    public static void main(String[] args)
    {
        String str = "Hello World";
        System.out.println(str);
        String str1 = opposite(str);
        System.out.println(str1);

    }

    public static String opposite(String str)
    {
        String strNew="";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++)
        {
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int j = 0; j < arr.length; j++)
        {
            strNew+=arr[j];
        }
        return strNew;

    }


}






