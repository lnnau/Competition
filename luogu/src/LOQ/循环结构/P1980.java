package LOQ.循环结构;
import java.util.ArrayList;
import java.util.Scanner;

/*
试计算在区间 11 到 nn 的所有整数中，数字 xx（0\le x\le90≤x≤9）共出现了多少次？
例如，在 11 到 1111 中，即在 1,2,3,4,5,6,7,8,9,10,111,2,3,4,5,6,7,8,9,10,11 中，数字 11 出现了 44 次。
 */
public class P1980 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        /*int count=0;
        //存放1-n中的数字
        ArrayList<String> al = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            //把数字添加到集合中
            al.add(String.valueOf(i));
        }
        //比较该数字中是否存在指定字符
        for(int i=0;i<n;i++) {
            String s = al.get(i);
            for(int j=0;j<s.length();j++) {
                if(s.substring(j,j+1).equals(String.valueOf(x))) {
                    count++;
                }
            }
        }*/

        System.out.println(method(n,x));
    }
    //分割字符串求解
    private static int method(int n,int x) {
        int count = 0;
        for(int i=1;i<=n;i++) {
            String[] strs = String.valueOf(i).split("");
            for(int j=0;j<strs.length;j++) {
                if(strs[j].equals(String.valueOf(x)))
                    count++;
            }
        }
        return count;
    }
}
