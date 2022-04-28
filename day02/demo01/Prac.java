package cn.itcast.day02.demo01;

public class Prac {
    public static void main(String[] args) {
        int[] array={4,3,1,5};
        int[] arrayA=new int[4];
        for (int i = 0; i < array.length; i++) {
            int min=array[i];
            for (int j = i; j < array.length; j++) {
                if(min>array[j]) {
                    int temp=min;
                    min=array[j];
                    array[j]=temp;
                }
            }
            arrayA[i]=min;
            System.out.println(arrayA[i]);

        }


    }

}
