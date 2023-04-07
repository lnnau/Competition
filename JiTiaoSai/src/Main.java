import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scores = new int[N];
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < N; i++)  {
            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        //求平均值
        avg = sum / N;
        double std = 0;
        double[] peop = new double[5];    //0 A 1 B
        double stdSum = 0;  //标准差和
        //求标准差和等级人数
        for (int i=0; i<N; i++) {
            int score = scores[i];
            stdSum = stdSum + Math.pow(score - avg,2);
            if (score >= 90 ) {
                peop[0] ++;
            } else if (score >= 81) {
                peop[1]++;
            } else if (score >= 71) {
                peop[2]++;
            } else if (score >= 61) {
                peop[3]++;
            } else if (score >= 0) {
                peop[4]++;
            }
        }
        //求标准差
        std = Math.pow(stdSum / N , 0.5);
        System.out.printf("%.2f %.2f\n",avg,std);
        System.out.printf("A:%.0f %.2f%%\n",peop[0],peop[0]/N * 100);
        System.out.printf("B:%.0f %.2f%%\n",peop[1],peop[1]/N* 100);
        System.out.printf("C:%.0f %.2f%%\n",peop[2],peop[2]/N* 100);
        System.out.printf("D:%.0f %.2f%%\n",peop[3],peop[3]/N* 100);
        System.out.printf("E:%.0f %.2f%%",peop[4],peop[4]/N* 100);
    }
}
