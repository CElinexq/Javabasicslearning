package cn.itcast.day02.demo01;

public class Calculate00 {
    public static void main(String[] args) {
    int[] result=calculate(10,20,30);
        System.out.println("sum="+result[0]);
    }
    public static int[] calculate(int a, int b, int c){
        int sum= a+b+c;
        int avg=sum/3;
        /**int[]array=new int[2];
        array[0]=sum;
        array[1]=avg;*/
        int[] array={sum,avg};
        return (array);

    }
}
