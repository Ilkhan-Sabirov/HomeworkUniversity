package Homework.Regular;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularTaskDate {
    private static final Pattern CALENDAR1 = Pattern.compile(
            "^((0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(?!0000)[0-9]{4})$"
    );

    private static final Pattern CALENDAR2 = Pattern.compile(
            "^((0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(?!00)[0-9]{2})$"
    );

    private static final Pattern CALENDAR3 = Pattern.compile(
            "^((?!0000)[0-9]{4}\\.(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01]))$"
    );

    private static final Pattern CALENDAR4 = Pattern.compile(
            "^((0[1-9]|[12][0-9]|3[01])\\.(I|II|III|IV|V|VI|VII|VIII|IX|X|XI|XII)\\.(?!0000)[0-9]{4})$"
    );

    public static boolean isValidColor(String input) {
        return CALENDAR1.matcher(input).matches() || CALENDAR2.matcher(input).matches() || CALENDAR3.matcher(input).matches() || CALENDAR4.matcher(input).matches();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ps = in.nextLine();

        System.out.println(isValidColor(ps));

    }
}
