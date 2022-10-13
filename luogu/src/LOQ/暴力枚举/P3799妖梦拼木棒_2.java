package LOQ.暴力枚举;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-12 16:35
 * @Description
 */
public class P3799妖梦拼木棒_2 {
    static int e = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //最大为1e5
        int[] bucket = new int[100005]; //索引是木棒长度，值代表该长度木棒的个数
        int maxLen = -1;
        for (int i = 0; i < n; i++) {
            int tp = sc.nextInt();
            bucket[tp]++;
            maxLen = maxLen > tp ? maxLen : tp;
        }

        int count = 0;
        //遍历x长度下木棒个数,木棒
        for (int i = 0; i <= maxLen; i++) {
            for (int j = i; j <= maxLen; j++) {
                if (i != j) { //a长度的木棒个数*b长度木棒个数*（从a+b长度木棒个数取两个的组合数量）
                    count = (count + (((bucket[i] * bucket[j]) % e * getCb(bucket[i + j])) % e)) % e;
                } else {    //a长度的木棒个数*b长度木棒个数（a b木棒相同，所以第二个木棒是从剩余木棒取，需要减去1）*（从a+b长度木棒个数取两个的组合数量）
                    count = (count + (getCb(bucket[i]) * getCb(bucket[i + j])) )% e;
                }
            }
        }
        System.out.println(count);
    }

    //求组合数 组合数性质公式化简n!/(n-m)!*m!
    private static int getCb(int num) {
        return ((num * num - num) / 2) % e;
    }
}
