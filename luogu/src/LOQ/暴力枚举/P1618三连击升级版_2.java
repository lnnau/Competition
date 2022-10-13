package LOQ.暴力枚举;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-03 17:16
 * @Description
 * @Result
 */
public class P1618三连击升级版_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A：B：C
        double t1 = sc.nextInt();
        double t2 = sc.nextInt();
        double t3 = sc.nextInt();
        double b,c;
        //计数器
        int count = 0;
        for(double a = 123;a<=329;a++) {
            //求出比值，可能为小数
            b = a * (t2/t1);
            c = a * (t3/t1);
            if (judge(a,b,c)) {
                System.out.println((int)a+" "+(int)b+" "+(int)c);
                count++;
            }
        }
        if (count==0) {
            System.out.println("No!!!");
        }
    }
    public static Boolean judge(double a,double b,double c) {
        String str = ""+(int)a+(int)b+(int)c;
        if (str.contains("1")&&str.contains("2")&&str.contains("3")&&str.contains("4")
                &&str.contains("5")&&str.contains("6")&&str.contains("7")&&str.contains("8")&&str.contains("9")
        &&str.length()==9) {
            return true;
        }
        return false;
    }
}
