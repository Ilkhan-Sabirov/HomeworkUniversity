package Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double sum = 1.0;

        Scanner in =  new Scanner(System.in);

        double x  = in.nextDouble();

        int n = 1;
        double ost = 1;
        while (true) {
            ost *= x / n;
            sum += ost;

            n++;
            if ( -0.00001 <= ost & ost<= 0.00001) {
                System.out.println(sum);
                break;
            }

        }

    }
}
