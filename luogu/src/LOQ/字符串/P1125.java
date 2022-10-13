package LOQ.字符串;
import java.util.Scanner;
/*
笨小猴
 */
public class P1125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //读取字符串
        char[] chars = sc.nextLine().toCharArray();
        //数组存放出现最多的字符次数 97-122之间
        int[] arr = new int[123];
        for(int i=0;i<chars.length;i++) {
            arr[chars[i]]++;
        }
        //求最大出现次数和最小出现次数
        int min=26,max=0;
        for(int i=97;i<=122;i++) {
            if(arr[i]>=max) {
                max=arr[i];
            }
            if(arr[i]<=min && arr[i]!=0) {  //确保min不会被赋予0，因为数组中未赋值的0会影响结果
                min=arr[i];
            }
        }
        if(getSu(min,max)) {
            System.out.println("Lucky Word");
            System.out.println(max-min);
        } else {
            System.out.printf("No Answer\n0");
        }
    }
    public static boolean getSu(int min,int max) {
        boolean flag=true;
        if(max-min<2) return false; //当差值小于2时肯定不是素数，返回false
        for(int i=2;i<max-min;i++) {
            if((max-min)%i==0) {
                flag=false;
            }
        }
        return flag;
    }
}
