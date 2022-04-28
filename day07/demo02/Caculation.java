package cn.itcast.day07.demo02;

public class Caculation
{
    //    	16. 用户输入一组数字，计算这组数字的最大值，最小值，平均值，和求和
    //    示例输入：3，4，9，23，55，9，7，2
    //    示例输出：
    //    min=2, max=55, avg=21.332, sum=95
    public static void main(String[] args)
    {
        int[] arr = {3, 4, 9, 23, 55, 9, 7, 2};
        int max = max(arr);
        System.out.println("max=" + max);
        int min = min(arr);
        System.out.println("min=" + min);
        int sum = sum(arr);
        System.out.println("sum=" + sum);
        double ave = average(arr);
        System.out.println("ave=" + ave);
    }

    public static int max(int[] arr)
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i])
            {
               max=arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr)
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }

    public static int sum(int[] arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {
           sum=sum+arr[i];
        }
        return sum;
    }
    public static double average(int[] arr){
        double ave=sum(arr)/arr.length;
        return ave;
    }
}