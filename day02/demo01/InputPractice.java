package cn.itcast.day02.demo01;
import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        System.out.println("Input="+input);

        if(input.equals("Y"))
        {
            System.out.println("Yes");
        }
        else if(input.equals("N")){
            System.out.println("No");
        }

    }
}
