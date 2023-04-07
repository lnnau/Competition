import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-31 15:13
 * @Description
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[][] arr = new double[128][2];  //索引为类别，0 总价 1 总数
        for (int i=0; i<N; i++) {
            char a = sc.next().toCharArray()[0];
            int b = sc.nextInt(); //单价
            int c  =sc.nextInt();   //数量
            arr[a][0] = arr[a][0] + b*c*0.95;   //算基础折扣
            arr[a][1] = arr[a][1] + c;
        }
        int score = sc.nextInt();
        double sum = 0;
        //遍历
        for (int i = 60; i < arr.length; i++) {
            //有值
            if (arr[i][1] > 0) {
                //计算数量和折扣
                if (arr[i][1]>=5) {
                    sum = sum + arr[i][0] * 0.8;
                } else if (arr[i][1] >= 3) {
                    sum = sum + arr[i][0] * 0.9;
                } else { //数量不够打折
                    sum  = sum +  arr[i][0];
                }
            }
        }
        //计算积分
        if (score > 10000) {
            sum = sum * 0.9;
        } else if (score >= 5000) {
            sum = sum * 0.95;
        }
        String result = String.format("%.1f",sum);
        //1代表小数点后面的位数, 不足补0。f代表数据是浮点类型。保留2位小数就是“%.2f”，依此累推。
        System.out.println(result);

    }
}
