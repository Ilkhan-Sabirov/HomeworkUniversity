package Homework.Regular;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularTask {
    public static void main(String[] args) {
         // Первый пароль

        Scanner in = new Scanner(System.in);
        String ps = in.next();

        String PASSWORD_PATTERN = "^[a-zA-z^$%@#&*!?\\d]+";

        System.out.println(
                Pattern.matches(PASSWORD_PATTERN,ps)
        );
        // Второй пароль

        Scanner pl = new Scanner(System.in);
        String hs = pl.next();

        String PASSWORD_PATTERN2 = "^.{8,}";

        System.out.println(
                Pattern.matches(PASSWORD_PATTERN2,hs)
        );
           //Третий пароль

        Scanner po = new Scanner(System.in);
        String kl = po.next();

        String PASSWORD_PATTERN3 = "^.*[A-Z]+.*";

        System.out.println(
                Pattern.matches(PASSWORD_PATTERN3,kl)
        );

           //Четвёртый пароль

        Scanner pr = new Scanner(System.in);
        String lk = pr.next();

        String PASSWORD_PATTERN4 = "^.*[a-z]+.*";

        System.out.println(
                Pattern.matches(PASSWORD_PATTERN4,lk)
        );

        // Пятый пароль

        Scanner pr1 = new Scanner(System.in);
        String lk1 = pr1.next();

        String PASSWORD_PATTERN5 = "^.*[0-9]+.*";

        System.out.println(
                Pattern.matches(PASSWORD_PATTERN5,lk1)
        );
    }
}
