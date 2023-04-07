package com.第四届区域赛;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-18 14:43
 * @Description
 */
import java.util.*;

class A{
    static int a;
    int aa;
    static {
        a=10;
        System.out.println(a);
    }
    public A() {
        aa=a*2;
        System.out.println(aa);
    }
}
class B extends A{
    static int b;
    int bb;
    static {
        b=100;
        System.out.println(b);
    }
    {
        bb=2*b;
        System.out.println(bb);
    }
}
public class Test {
    public static void main(String[] args) {
        new B();
    }
}