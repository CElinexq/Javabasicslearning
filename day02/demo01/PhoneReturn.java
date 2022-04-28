package cn.itcast.day02.demo01;

public class PhoneReturn {
    public static void main(String[] args) {

        System.out.println(getPhone().brand);
        System.out.println("==========");
        Phone pi=getPhone();
        System.out.println(pi.brand);

        method(2);
    }
    public static void method(int param){
        System.out.println(param);
    }
    public static Phone getPhone(){
        Phone one=new Phone();
        one.brand="apple";
        one.price=8999.0;
        one.colour="black";
        return one;
    }
}
