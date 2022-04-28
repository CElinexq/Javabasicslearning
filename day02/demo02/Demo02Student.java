package cn.itcast.day02.demo02;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("lulu");
        stu1.setAge(20);
        System.out.println("name:"+stu1.getName()+", age:"+stu1.getAge());
        Student stu2=new Student("nini",21);
        System.out.println("name:"+stu2.getName()+", age:"+stu2.getAge());


    }
}
