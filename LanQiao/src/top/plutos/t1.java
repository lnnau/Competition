package top.plutos;

import java.math.BigDecimal;
public class t1 {
    public static void main(String[] args) {
        BigDecimal tp = new BigDecimal("20");
        tp = tp.pow(22).add(new BigDecimal("6"));
        System.out.println(tp);
        tp = tp.remainder(new BigDecimal("7"));
        System.out.println(tp); //0代表的是周日

    }
}
