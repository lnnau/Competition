package LOQ.排序;

import java.util.*;

public class P1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //创建集合
        Set<Student> set = new TreeSet<Student>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        double num = o2.getSum()-o1.getSum();
                        double num1 = num==0 ?o2.language-o1.language:num;
                        double num2 = num1==0 ?o1.id-o2.id:num1;
                        return (int) num2;
                    }
                }
        );
        for(int i=0;i<n;i++) {
            int lg = sc.nextInt(),math = sc.nextInt(),eng = sc.nextInt();
            //创建学生对象
            Student student = new Student();
            student.id = i+1;
            student.language = lg;
            student.math = math;
            student.english = eng;
            set.add(student);
        }
        //遍历集合
        int count=0;
        for(Student s : set) {
            if(count>=5)
                return;
            System.out.println(s.id+" "+(int)s.getSum());
            count++;
        }
    }
}
 class Student{
    int id;
    double language;
    double math;
    double english;
    public double getSum() {
        return language+math+english;
    }
}
