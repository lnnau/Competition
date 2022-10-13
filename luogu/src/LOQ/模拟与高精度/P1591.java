package LOQ.模拟与高精度;

import java.math.BigInteger;
import java.util.Scanner;

//阶乘数码
public class P1591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] strs = new String[t];
        //输入数据
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            strs[i] = sc.nextLine();
        }
        //求每行的阶乘
        int count;
        String a = "";
        for(int i=0;i<t;i++) {
            //重置计数器
            count=0;
            String[] split = strs[i].split(" ");
            //获取到求阶乘的最终值
            BigInteger n = new BigInteger(split[0]);
            //调用求阶乘方法
            String resStr = getFactor(n);
            //计算数码出现阶乘结果中的次数
            for(int j=0;j<resStr.length();j++) {
                String[] split1 = resStr.split("");
                if(split1[j].equals(split[1])) {
                    count++;
                }
            }
            //输出结果
            System.out.println(count);
        }
    }
    //求阶乘方法
    public static String getFactor(BigInteger n) {
        int foctorMax = Integer.parseInt(n.toString());
        for(int i=1;i<foctorMax;i++) {
            n=n.multiply(new BigInteger(String.valueOf(i)));
        }
        return n.toString();
    }
}
