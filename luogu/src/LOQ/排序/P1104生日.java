package LOQ.排序;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P1104生日 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //创建集合  生日大的出生日期靠前，所以按照出生日期小的排前面
        Set<Student> set = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getYear()-s2.getYear();
                int num1 = num==0 ? s1.getMonth()-s2.getMonth():num;
                int num2 = num1==0 ? s1.getDay()-s2.getDay() : num1;
                //靠后的先输出，也就是大的先输出
                int num3 = num2==0 ? s2.id-s1.id : num2;
                return num3;
            }
        });
        //输入数据
        sc.nextLine();
        for(int i=1;i<=n;i++) {
            //创建学生对象
            Student student = new Student();
            student.name = sc.next();
            student.birthdayStr = sc.nextLine().split(" ");
            //输入顺序
            student.id = i;
            //添加到集合
            set.add(student);
        }
        //输出结果
        int i=1;
        for(Student s:set) {
            if(i<=n) {
                System.out.println(s.name);
            }
            i++;
        }
    }
static class Student{
        int id;
        String name;
        String[] birthdayStr;
        //得到生日 birthdayStr[0]是空格要跳过
        private int getYear() {
            return Integer.parseInt(birthdayStr[1]);
        }
        private int getMonth(){
            return Integer.parseInt(birthdayStr[2]);
        }
        private int getDay() {
            return Integer.parseInt(birthdayStr[3]);
        }
    }
}
