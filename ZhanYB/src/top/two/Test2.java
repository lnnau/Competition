package top.two;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


/**
 * @Author Lunau
 * @Create 2022-05-11 20:43
 * @Description
 * @Result
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] strs = time.split("/");
        int[] tm = new int[3];
        for(int i=0;i<3;i++) {
            tm[i] = Integer.parseInt(strs[i]);
        }
        int flag = 0;   //记录今天之前最近出现疫情，相对今天的天数
        for(int i=0;i<m;i++) {
            int tp = sc.nextInt();
            if(tp>=1) {
                flag=i;
                break;
            } else {
                continue;
            }
        }
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat();
        Calendar calendar = Calendar.getInstance();
        calendar.set(tm[0],tm[1],tm[2]);
        System.out.println(calendar);
    }
}
