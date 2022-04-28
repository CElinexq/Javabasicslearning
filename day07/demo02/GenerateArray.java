package cn.itcast.day07.demo02;

import java.util.ArrayList;
import java.util.Random;

public class GenerateArray
{
    public static void main(String[] args)
    {
        int start = 4;
        int end = 9;
        printOrderArray(start, end);
        ArrayList<Integer> list=toDisorderArray(start, end);
        printArray(list);

    }
    public static ArrayList<Integer> toDisorderArray(int start, int end){
        int[] arr = generateArray(start, end);
        //将固定数组arr赋值给list1
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
        {
            list1.add(arr[i]);
        }
        // 乱序数组list2
        ArrayList<Integer> list2 = new ArrayList<>();
        Random r = new Random();
        int num = end - start + 1;
        for (int i = 0; i < end - start + 1; i++)
        {
            int index = r.nextInt(0, num);//0~6之间随机角标
            list2.add(list1.get(index));
            list1.remove(index);
            num--;
        }
        return list2;
    }

    public static void printArray(ArrayList<Integer> arr)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            if (i == 0)
            {
                System.out.print("[" + arr.get(0)+ ",");
            }
            else if (i == arr.size() - 1)
            {
                System.out.println(arr.get(i) + "]");
            }
            else System.out.print(arr.get(i) + ",");
        }
    }

    public static void printOrderArray(int start, int end)
    {
        int[] arr = generateArray(start, end);
        for (int i = 0; i < arr.length; i++)
        {
            if (i == 0)
            {
                System.out.print("[" + arr[0] + ",");
            }
            else if (i == arr.length - 1)
            {
                System.out.println(arr[i] + "]");
            }
            else System.out.print(arr[i] + ",");
        }
    }

    public static int[] generateArray(int start, int end)
    {
        //数组长度为end-start+1
        int[] arr = new int[end - start + 1];
        arr[0] = start;
        arr[end - start] = end;
        for (int i = 1; i < arr.length; i++)
        {
            arr[i] = start + 1;
            start++;
        }
        return arr;
    }
}
