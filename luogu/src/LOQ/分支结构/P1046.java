package LOQ.分支结构;

import java.util.Scanner;

public class P1046 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] heights = sc.nextLine().split(" ");
            int height = sc.nextInt()+30;
            int count=0;
            for(String s:heights) {
                if(height>=Integer.parseInt(s)) {
                    count++;
                }
            }
        System.out.println(count);
    }
}
