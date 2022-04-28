package cn.itcast.day05.demo01;

import java.util.ArrayList;

public class ArrayListStudent
{
    public static void main(String[] args)
    {
        ArrayList<Student> list=new ArrayList<>();
        Student stu1=new Student("洪七公",20);
        Student stu2=new Student("欧阳锋",22);
        Student stu3=new Student("黄老邪",21);
        Student stu4=new Student("一灯大师",26);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        for (int i = 0; i < list.size(); i++)
        {
            Student stu=list.get(i);
            System.out.println("姓名："+stu.getName()+",年龄"+stu.getAge());
        }

    }
}
