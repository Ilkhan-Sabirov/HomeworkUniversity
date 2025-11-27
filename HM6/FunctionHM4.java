package Homework.HM6;

import java.util.Scanner;

public class FunctionHM4 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        double x  = in.nextDouble();

        double res = exponent(x);

        System.out.println(res);
    }

    public static double exponent(double x) {
        double sum = 1.0;

        double ost = 1;
        int n = 1;

        while (true) {
            ost *= x / n;
            sum += ost;

            n++;
            if ( -0.00001 <= ost & ost<= 0.00001) {
                return sum;
            }

        }
    }
}
