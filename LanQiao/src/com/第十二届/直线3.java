package com.第十二届;


import java.util.*;

/**
 * @Author Lunau
 * @Create 2022-03-16 15:28
 * @Description
 * @Result 40257
 */
public class 直线3 {
    public static void main(String[] args) {
        List<Line> list = new LinkedList<Line>();
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
                        }
                    }
                }
            }
        }
        //按照从k从小到大，k相同则b从小到大排序 通过集合比较器
        Collections.sort(list, new Comparator<Line>() {
            @Override
            public int compare(Line o1, Line o2) {
                if(o1.k>o2.k) {
                    return 1;
                }else if(o1.k==o2.k) {
                    if(o1.b>o2.b) {
                        return 1;
                    } else if(o1.b<o2.b) {
                        return -1;
                    } else {
                        return 0;
                    }
                } else {
                    return -1;
                }
            }
        });
        int count=1;
        //遍历集合
        for(int i=0;i<list.size()-1;i++) {
            Line l1 = list.get(i);
            Line l2 = list.get(i+1);
            //排完序后，如果两直线的斜率差或者截距差在不在这个范围内说明是不同的直线
            if(Math.abs(l1.k-l2.k)>10e-8 || Math.abs(l1.b-l2.b)>10e-8)
                count++;
        }
        System.out.println(count+20);
    }
}
