package com.第十二届;

import java.util.*;

/**
 * @Author Lunau
 * @Create 2022-03-16 15:28
 * @Description
 * @Result
 */
public class 直线 {
    public static void main(String[] args) {
        Set<Line> list = new TreeSet<>(new Comparator<Line>() {
            @Override
            public int compare(Line o1, Line o2) {
                double num1 = o1.k-o2.k;
                double num2 = num1==0? o1.b-o2.b:num1;
                return (int)num2;
            }
        });
        //把点直线存入集合中
        for(int x1=0;x1<20;x1++) {
            for(int y1=0;y1<21;y1++) {
                for(int x2=0;x2<20;x2++) {
                    for(int y2=0;y2<21;y2++) {
                        //把斜率不存在的筛出去
                        if(x1!=x2) {
                            double k = (double)(y1-y2)/(x1-x2);
                            double b = y1-k*x1;
                            Line line = new Line();
                            line.k=k;
                            line.b=b;
                            list.add(line);
//                            System.out.println(k+" "+b);
                        }
                    }
                }
            }
        }
        int count=0;
        //遍历集合
//        for(int i=0;i<list.size()-1;i++) {
//            if(Math.abs(list.get(i).k-list.get(i+1).k)>10e-8 || Math.abs(list.get(i).b-list.get(i+1).b)>10e-8)
//                count++;
//        }
        Iterator<Line> it = list.iterator();
        while(it.hasNext()){
            Line l1 = it.next();
            Line l2 = it.next();
            if(Math.abs(l1.k-l2.k)>10e-8 || Math.abs(l1.b-l2.b)>10e-8)
                count++;
        }

        System.out.println(count);
        System.out.println(222);
    }
}
class Line{
    double k;
    double b;
}
