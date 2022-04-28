package cn.itcast.day02.demo01;

public class demo02 {
    public static void main(String[] args) {
    int[] array={1,2,3,4,5,6,7,8,9} ;
    printArray(array);
        System.out.println("=================");
    for(int min=0,max= array.length-1;min<max;min++,max--){
        int temp=array[min];
        array[min]=array[max];
        array[max]=temp;
    }
    printArray(array);
    }
    //新方法体
    public static void printArray(int[] arrayA) {
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }
}
