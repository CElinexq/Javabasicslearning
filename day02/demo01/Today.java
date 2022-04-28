package cn.itcast.day02.demo01;

import java.util.Arrays;

public class Today {
    public static void main(String[] args) {
        int[] arrayA = {10, 20, 35, 40, 50, 60, 79, 89};
        printArray(arrayA);
        System.out.println("================");
        for (int min = 0, max = arrayA.length - 1; min < max; min++, max--) {
            int temp = arrayA[min];
            arrayA[min] = arrayA[max];
            arrayA[max] = temp;
        }
        printArray(arrayA);
    }

    public static void printArray(int[] arrayA) {
        for (int i = 0; i < arrayA.length; i++) {
            if(i== arrayA.length-1){
                System.out.println(arrayA[i]);
            }else {
            System.out.print(arrayA[i]+",");}
            System.out.println("----------------");
            System.out.println(Arrays.toString(arrayA));
        }
    }
}
