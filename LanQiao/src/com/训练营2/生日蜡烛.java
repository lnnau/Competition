package com.训练营2;

/**
 * @Author Lunau
 * @Create 2022-03-11 19:55
 * @Description
 * @Result  26
 */
public class 生日蜡烛 {
    public static void main(String[] args) {
        //外层循环控制起始年龄
        for(int i=26;i<100;i++) {
            int res = 0;
            //内层循环控制当前年龄是否符合条件
            for(int j=i;res<236;j++) {
                res+=j;
            }
            if(res==236)
                System.out.println(i);
        }
    }
}
