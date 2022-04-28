package cn.itcast.day03.demo01;

import java.util.Scanner;

public class Bubu
{

    //定义了一个学生类型的数组，用来储存创建的学生
    static Student[] studentArray = new Student[10];
    static Subject[] subjectArray = new Subject[5];

    public static void main(String[] args)
    {
        CreateSubjects();
        PrintSubjectInfoById();
        //在main方法中调用其它方法
        CreateStudents();
        PrintStudentInfoById();


    }

    public static void CreateSubjects()
    {
        Subject sub1 = new Subject();
        sub1.id = 1;
        sub1.name = "数学";
        sub1.hours = 20;

        Subject sub2 = new Subject();
        sub2.id = 2;
        sub2.name = "物理";
        sub2.hours = 25;

        Subject sub3 = new Subject();
        sub3.id = 3;
        sub3.name = "化学";
        sub3.hours = 30;

        Subject sub4 = new Subject();
        sub4.id = 4;
        sub4.name = "语文";
        sub4.hours = 10;

        Subject sub5 = new Subject();
        sub5.id = 5;
        sub5.name = "英语";
        sub5.hours = 30;

    //将sub1的地址值赋值到数组的0号元素位置
        subjectArray[0] = sub1;
        subjectArray[1] = sub2;
        subjectArray[2] = sub3;
        subjectArray[3] = sub4;
        subjectArray[4] = sub5;
    }

    public static void PrintSubjectInfoById()
    {
        System.out.println("请输入课程号：");
        Scanner sc = new Scanner(System.in);
        int inputId = sc.nextInt();
        for (int i = 0; i < subjectArray.length; i++)
        {
            if (inputId==subjectArray[i].id)
            {
                System.out.println("课程ID：" + subjectArray[i].id + ";课程名称：" + subjectArray[i].name + ";课程时长：" + subjectArray[i].hours);

            }
        }

    }

    //创建10个学生，储存到一个数组中
    public static void CreateStudents()
    {
        Student stu1 = new Student();

        stu1.id = 1;
        stu1.name = "小张";
        stu1.male = true;
        stu1.age = 18;

        Student stu2 = new Student();

        stu2.id = 2;
        stu2.name = "小李";
        stu2.male = false;
        stu2.age = 18;

        Student stu3 = new Student();
        stu3.id = 3;
        stu3.name = "小噢";
        stu3.male = false;
        stu3.age = 19;

        Student stu4 = new Student();
        stu4.id = 4;
        stu4.name = "stone";
        stu4.male = true;
        stu4.age = 40;

        Student stu5 = new Student();
        stu5.id = 5;
        stu5.name = "老高";
        stu5.male = true;
        stu5.age = 30;

        Student stu6 = new Student();
        stu6.id = 6;
        stu6.name = "悉尼奶爸";
        stu6.male = true;
        stu6.age = 42;

        Student stu7 = new Student();
        stu7.id = 7;
        stu7.name = "米虫";
        stu7.male = false;
        stu7.age = 25;

        Student stu8 = new Student();
        stu8.id = 8;
        stu8.name = "噔噔";
        stu8.male = true;
        stu8.age = 28;

        Student stu9 = new Student();
        stu9.id = 9;
        stu9.name = "破空";
        stu9.male = true;
        stu9.age = 46;

        Student stu10 = new Student();
        stu10.id = 10;
        stu10.name = "小莫";
        stu10.male = false;
        stu10.age = 20;


        studentArray[0] = stu1;
        studentArray[1] = stu2;
        studentArray[2] = stu3;
        studentArray[3] = stu4;
        studentArray[4] = stu5;
        studentArray[5] = stu6;
        studentArray[6] = stu7;
        studentArray[7] = stu8;
        studentArray[8] = stu9;
        studentArray[9] = stu10;
    }

    //打印出指定ID的学生信息
    public static void PrintStudentInfoById()
    {

        System.out.println("请输入学号：");
        Scanner sc = new Scanner(System.in);
        int userInputId = sc.nextInt();
        for (int i = 0; i < studentArray.length; i++)
        {
            if (studentArray[i].id == userInputId)
            {
                System.out.println("学生ID：" + studentArray[i].id + ";学生姓名：" + studentArray[i].name + ";学生性别：" + studentArray[i].male + ";学生年龄：" + studentArray[i].age);
            }
        }
    }


}

