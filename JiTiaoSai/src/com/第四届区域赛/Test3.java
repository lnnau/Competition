package com.第四届区域赛;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-18 15:27
 * @Description定义一个学生类Student，属性包括String类型的id、name和int类型的age（id属性字符串内容相同的则认为是同一个学生），为三个属性定义get和set方法。重写equals()方法和hashCode()方法，使得当使用HashSet存储Student类的对象时，id重复的学生对象不能重复添加到集合。输入4个学生类对象的属性值，创建4个Student类对象，将其添加到一个HashSet<Student>集合，遍历集合，输出集合中各个学生的信息。
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> set = new HashSet<Student>();
        for (int i=0; i<4; i++){
            Student student = new Student();
            String[] s1 = sc.nextLine().split(" ");
            student.setId(s1[0]);
            student.setName(s1[1]);
            student.setAge(Integer.parseInt(s1[0]));
            set.add(student);
        }
        for (Student student : set) {
            System.out.println(student.getId()+":"+student.getName()+":"+student.getAge());
        }
    }
}
class Student{
    String id;
    String name;
    int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int code = Integer.parseInt(id);
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        return id.equals(student.id);
    }
}
