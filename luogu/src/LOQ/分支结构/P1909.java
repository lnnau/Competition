import java.util.*;
public class P1909{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int price1=1000000000,price;
       for(int i=0;i<3;i++){
            int Anums=sc.nextInt(),Aprice=sc.nextInt();
            // int Bnums=sc.nextInt(),Bprice=sc.nextInt();
            // int Cnums=sc.nextInt(),Cprice=sc.nextInt();
            if(nums%Anums==0) {
                price=(nums/Anums)*Aprice;
            } else {
                price=((nums/Anums)+1)*Aprice;
            }
            if(price<price1) {
                price1=price;
            }
        }
        System.out.print(price1);
    }
}