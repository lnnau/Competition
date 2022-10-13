package LOQ.暴力枚举;

import java.util.Scanner;

public class P2089烤鸡 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        //开始进入开端
        for(int n1=1;n1<=3;n1++) {
            for(int n2=1;n2<=3;n2++) {
                for(int n3=1;n3<=3;n3++) {
                    for(int n4=1;n4<=3;n4++) {
                        for(int n5=1;n5<=3;n5++) {
                            for(int n6=1;n6<=3;n6++) {
                                for(int n7=1;n7<=3;n7++) {
                                    for(int n8=1;n8<=3;n8++){
                                        for(int n9=1;n9<=3;n9++) {
                                            for(int n0=1;n0<=3;n0++) {
                                                if(n1+n2+n3+n4+n5+n6+n7+n8+n9+n0==n)
                                                count++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
        for(int n1=1;n1<=3;n1++) {
            for(int n2=1;n2<=3;n2++) {
                for(int n3=1;n3<=3;n3++) {
                    for(int n4=1;n4<=3;n4++) {
                        for(int n5=1;n5<=3;n5++) {
                            for(int n6=1;n6<=3;n6++) {
                                for(int n7=1;n7<=3;n7++) {
                                    for(int n8=1;n8<=3;n8++){
                                        for(int n9=1;n9<=3;n9++) {
                                            for(int n0=1;n0<=3;n0++) {
                                                if(n1+n2+n3+n4+n5+n6+n7+n8+n9+n0==n)
                                                    System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7+" "+n8+" "+n9+" "+n0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
