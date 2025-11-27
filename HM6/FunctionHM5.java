package Homework.HM6;

import java.util.Scanner;

public class FunctionHM5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(fact(n));
    }

    public static int fact(int x) {
        int result = 1;
        for (int i = 1; i < x + 1; i++) {
            result *= i;
        }

        return result;
    }
}
