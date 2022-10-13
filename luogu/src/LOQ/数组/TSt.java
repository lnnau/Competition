package LOQ.数组;
//关于强制类型转换的一点问题
public class TSt {
    public static void main(String[] args) {
        //1.计算过程中强转
        int a=25;
        double d=1.5;
        int sum=(int)d*a;   //这样写相当于把d给先强制类型转换后再进行乘法运算了
        System.out.println(sum);
        int sum2=(int)(d*a);
        System.out.println(sum2);

        //2.计算后强转
        double sum3 = d*a;
        System.out.println((int)sum3);
    }
}
