package LOQ.暴力枚举;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-09 15:43
 * @Description
 */
public class P3654FirstStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(),c = sc.nextInt(),k = sc.nextInt();
        String[][] strs = new String[r][c];
        sc.nextLine();
        for (int i=0;i<r;i++) {
            strs[i] = sc.nextLine().split("");
        }
        //统计符合的站位数
        int count = 0;
        //r*c次遍历
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                //遍历可能站位的位置
                if (strs[i][j].equals(".")) {
                    //往下遍历
                    if (i<r-k+1) {  //寻找站位前，先判断寻找站位可能越界，也就是不会有符合的站位
                        int tp = 0; //暂存空闲站位数量
                        for (int p=i;p<i+k;p++) {
                            if (strs[p][j].equals(".")) {
                                tp++;
                            }
                            //找到一次可行的向下站位，计数
                            if (tp>=k) {
                                count++;
                                break;
                            }
                        }
                    }
                    //特判，当只有一个站位时，只需要统一一次当前位即可
                    if (k!=1) {
                        //往右遍历
                        if (j<c-k+1) {
                            int tp = 0;
                            for (int p=j;p<j+k;p++) {
                                if (strs[i][p].equals(".")) {
                                    tp++;
                                }
                                //找到一次可行的向下站位
                                if (tp>=k) {
                                    count++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
