package com_itheima.arraylistpractice_3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice3     {
//    watch video https://www.bilibili.com/video/BV17F411T7Ao?p=113
//    and https://www.bilibili.com/video/BV17F411T7Ao?p=112
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("lous", "12");
        Student s2 = new Student("lous", "12");
        Student s3 = new Student("lous", "12");

        Scanner scanner = new Scanner(System.in);
        Student sn = new Student();
        sn.setName(scanner.next());
        sn.setAge(scanner.next());
        list.add(sn);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+" "+stu.getAge());

        }






    }
}
