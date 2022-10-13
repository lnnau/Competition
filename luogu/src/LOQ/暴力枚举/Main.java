package LOQ.暴力枚举;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        Integer [] array=new Integer[]{1,2,3,4,5};

        Arrays.sort(array, new  Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for(Integer i : array) {
            System.out.println(i);
        }
    }
    }
