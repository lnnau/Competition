import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-31 15:08
 * @Description
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.nextLine().split("-");
        int y = 0, m = 0, d = 0;
        y = Integer.parseInt(date[0]);
        m = Integer.parseInt(date[1]);
        d = Integer.parseInt(date[2]);
        //求年数
        int year = y-2022;
        int x = 1;
        int days = 0;
        boolean isLeap = false;
        if ( (y%4==0 && y%100!=0) || y%400==0) {
            isLeap = true;
        }
        String res = "长跑";
        //计算完整月的天数,从第二月开始计算
        for (int i=1; i<=m; i++) {
            if (i==2) {
                if (isLeap) {
                    days+=29;
                } else {
                    days += 28;
                }
            }
            if (i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
                days+=31;
            }
            if (i==4 || i==6 || i== 9 || i==11) {
                days += 30;
            }
        }
        //把1月1日这周度过，算第一周，再减去度过花费的天数，然后求周数即可
        days += (d  - (7 - x + 1));
        double count = days / 7.0;
        if (d > 7-x+1)
            count +=1; //加上第一周
        System.out.print(res);
    }
}
