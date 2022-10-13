package com.真题;

/**
 * 142
 */
public class 马虎的算式 {
    public static void main(String[] args) {
        int count=0;
        for(int a=1;a<=9;a++) {
            for(int b=1;b<=9;b++) {
                if(a==b) continue;
                else for(int c=1;c<=9;c++) {
                    if(a==b || a==c || b==c) continue;
                    else for(int d=1;d<=9;d++) {
                        if (a==b || a==c || a==d || b==c || b==d || c==d ) continue;
                        else {
                            for(int e=1;e<=9;e++) {
                                if(a==b||a==c||a==d||a==e||b==c||b==d||b==e||c==d||c==e||d==e) continue;
                                else
                                    if((a*10+b)*(c*100+d*10+e) == (a*100+d*10+b)*(c*10+e))
                                        count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
