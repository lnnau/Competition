package LOQ.函数与结构体;

import java.util.Scanner;

public class P5740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp1=-1,temp2=-1;
        //记录名字
        String name="";
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String s = sc.nextLine();
            String[] strArray = s.split(" ");
            temp1=Integer.parseInt(strArray[1])+Integer.parseInt(strArray[2])+Integer.parseInt(strArray[3]);
            if(temp1>temp2) {
                name=s;
                temp2=temp1;
            }
        }
        System.out.println(name);
    }
}
