package cn.itcast.day07.demo02;

public class PalindromicNumber
{
    //    	18. 查找0-10000中的所有“回纹数”。
    //        （“回纹数”定义，从左向右读和从右向左读都一样的数，左右好像镜像一样。
    //        比如：1，22，121，3443，12321，56765，98989）

    public static void main(String[] args)
    {
        for (int num = 0; num <=100000 ; num++)
        {
            if (isPalindromic(num)){
                System.out.println("数字"+num+"是回纹数");
            };

        }

    }

    public static boolean isPalindromic(int num)
    {
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        for (int start = 0, end = chars.length - 1; start < end; start++, end--)
        {
            if (chars[start] != chars[end])
            {
                return false;
            }
        }
        return true;
    }
}

