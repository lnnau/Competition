package top.plutos;
//51948 8000 43948  少了一种回文相等的情况
//54936 9000    63936
public class t2 {
    public static void main(String[] args) {
        int count = 0;  //1011111011
                        //2022222022
        for(int i=2020;i<=2022222022;i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(i);
            String s = ""+i;
            if(Integer.parseInt(s.substring(0,1))<=Integer.parseInt(s.substring(1,2)) && s.equals(sb.reverse().toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
