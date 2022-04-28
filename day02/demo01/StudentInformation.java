package cn.itcast.day02.demo01;

public class StudentInformation {
    public static void main(String[] args) {
        PhoneParam stu=new PhoneParam();
        stu.setName("lulu");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名："+stu.getName());
        System.out.println("年龄 ："+stu.getAge());
        System.out.println("性别："+stu.isMale());

    }

}
