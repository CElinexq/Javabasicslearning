package cn.itcast.day07.demo02;

import java.util.ArrayList;

public class FindDuplicate
{
    //    	17. 查询一个数组中是否有重复的值，有的话，重复了几次。
    //    示例输入：3，4，9，23，55，9，7，2，9，3，8，3
    //    示例输出：
    //    Found duplicate number "9" 2 times in the list.
    //    Found duplicate number "3" 3 times in the list.
    public static void main(String[] args)
    {
        int[] arr = {3, 4, 9, 23, 55, 9, 7, 2, 9, 3, 8, 3, 23, 23, 23};
        //        int count = findDuplicate(arr);
        //        System.out.println(count);
        //        findDuplicate(arr);
        findDuplicate2(arr);

    }

    public static void findDuplicate2(int[] arr)
    {
        ArrayList<Integer> outputList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            if (count > 1 && !outputList.contains(arr[i]))
            {
                outputList.add(arr[i]);
                System.out.println("数字" + arr[i] + "出现" + count + "次");
            }
        }
    }


    public static void findDuplicate(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        outer:
        for (int j = 0; j < arr.length - 1; j++)
        {

            for (int h = 0; h < list.size(); h++)
            {
                if (arr[j] == list.get(h))
                    break outer;
            }

            int count = 0;
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[j] == arr[i])
                {
                    count++;
                }
            }
            list.add(arr[j]);
            if (count > 1)
            {
                System.out.println("数字" + arr[j] + "出现" + count + "次");
            }
        }

    }

}
