package cn.itcast.day02.demo01;


public class Pi {
    public static void main(String[] args) {
;
        sort(new int[]{3,9,2,3,4,10,100,1});
    }


    public static void sort(int[] array){
        //空数组，负责接收排列后的结果
        int[] result=new int[array.length];

        //循环数组中的每一个元素
        for (int i = 0; i < array.length; i++) {
            //最小值
            int min=array[i];
            //最小值与当前元素之后的所有元素依次比较，找到最小值
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<min)
                {
                    int temp=min;
                    min=array[j];
                    array[j]=temp;
                }
            }
            result[i]=min;
        }
        //打印排序后的数组
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+", ");
        }
    }

    public static int time(int n) {
        int wrong = 0;
        if (n < 20 && n > 0) {
            int times = 1;

            for (int i = 1; i <= n; i++) {
                times = times * i;
            }
            return times;
        } else {
            return wrong;
        }


    }

    public static void printStarLayer(int n) {

        for (int i = 1; i <= n; i++) {
            String s = "";
            for (int j = 0; j < i; j++) {
                s += "*";
            }
            System.out.println(s);
        }


    }


}

