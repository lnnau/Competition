class Deom2 {
    public static void main(String args[]) {
        //1既不是质数也不是和数，使用i从2开始。
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            //注意flag的位置，我们是要在每一次判断i是否是素数前重新赋值，
            //不然在一次i不是素数后flag就会变成FALSE，后面就不会输出结果了。
            for (int j = 2; j < i; j++) {
                //把不是素数的筛选出去
                if (i % j == 0) {
                    //开关为false时当前i就不是素数
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(" " + i);
            }
        }
    }
}