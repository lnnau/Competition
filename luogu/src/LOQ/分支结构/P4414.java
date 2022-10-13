package LOQ.分支结构;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P4414 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        sc.nextLine();
        String[] s = sc.nextLine().split("");
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("A",0);
        hm.put("B",1);
        hm.put("C",2);
        for(int i=0;i<arr.length;i++) {
            if(i!=2){
                System.out.print(arr[hm.get(s[i])]+" ");
            } else {
                System.out.print(arr[hm.get(s[i])]);
            }
        }
    }
}
