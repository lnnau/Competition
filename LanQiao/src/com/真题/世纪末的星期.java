package com.真题;

import java.util.Calendar;

/**
 * 可以用excal函数求解
 * 或者使用java的Calendar类
 * 2299
 */
public class 世纪末的星期 {
    public static void main(String[] args) {
        //获取当前日期的初始化对象
        Calendar calendar = Calendar.getInstance();
        for(int year=1999;year<10000;year+=100) {
            //设置起始年月日
            calendar.set(year,11,31);
            if(calendar.get(Calendar.DAY_OF_WEEK)==1) {
                System.out.println(year);
            }
        }
    }
}
