package cn.itcast.day02.demo01;

public class demo03 {
    public static void main(String[] args) {
      Student stu=new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.name="zoe";
        stu.age=18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
        stu.study();
        stu.sleep();
    }
}
