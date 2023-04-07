package com.第十二届;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-14 19:46
 * @Description 输入起始时间到要求时间的毫秒值
 * 输出当前的时分秒
 * @Result
 */
public class 时间显示 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //减去当前东八区+8h的毫秒数，因为求出时间后会自动转换为当前时区时间，导致结果＋8h
        long hm = sc.nextLong()-28800000;
        //获取到从标准时间hm毫秒后的时间对象
        Date date = new Date(hm);
        //格式化输出时间   HH 24时制 hh 12小时制
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
   }
}
