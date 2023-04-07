package com.第四届校内模拟;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<String> inputs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            inputs.add(sc.nextLine());
        }
        int A = 0, B = 0;
        for (int i = 0; i < N; i++) {
            String input = inputs.get(i);
            if (isA(input)) A++;
            else if (isB(input)) B++;
        }
        System.out.println(A + " " + B);
    }

    public static boolean isA(String input) {
        String[] arr = input.split(" ");
        String localState = arr[0];
        String colorState = arr[1];
        String complete = arr[2];
        String res = arr[3];
        int day = Integer.parseInt(arr[4]);
        if (colorState.equals("Y") || (day < 3 && complete.equals("U") && localState.equals("T"))) {
            return true;
        }
        return false;
    }

    public static boolean isB(String input) {
        String[] arr = input.split(" ");
        String localState = arr[0];
        String colorState = arr[1];
        String complete = arr[2];
        String res = arr[3];
        int day = Integer.parseInt(arr[4]);
        if (colorState.equals("R") || res.equals("P")) {
            return true;
        }
        return false;
    }
}