package LOQ.模拟与高精度;

import java.util.Scanner;

public class P1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = 0;
        int l = 0;
        String str = "";
        while (sc.hasNext()) {
            String line = sc.nextLine();
            str += line;
            if(str.contains("E"))
                break;
        }
        for (int i = 0; i <= str.length();i++) {
            if (str.charAt(i) == 'W') {
                w++;
            } else if (str.charAt(i) == 'L') {
                l++;
            } else {
                break;
            }
            if(w==11||l==11 && Math.abs(w-l)>=2) {
                System.out.println(w+":"+l);
                w=0;
                l=0;
            }
        }
        System.out.println(w+":"+l);
        w=0;
        l=0;
        System.out.println();
        for (int i = 0; i <str.length();i++) {
            if (str.charAt(i) == 'W') {
                w++;
            } else if (str.charAt(i) == 'L') {
                l++;
            } else {
                break;
            }
            if(w==21||l==21 && Math.abs(w-l)>=2) {
                System.out.println(w+":"+l);
                w=0;
                l=0;
            }
        }
        System.out.println(w+":"+l);
    }
}
