package Homework.Regular;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularTaskRGB {
    private static final Pattern RGB_PATTERN = Pattern.compile(
            "^rgb\\s*\\(\\s*(?:[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\s*,\\s*" +
                    "(?:[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\s*,\\s*" +
                    "(?:[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\s*\\)$"
    );

    private static final Pattern HEX_PATTERN = Pattern.compile(
            "^#([A-Fa-f0-9]{6})$"
    );

    public static boolean isValidColor(String input) {
        return RGB_PATTERN.matcher(input).matches() || HEX_PATTERN.matcher(input).matches();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String ps = in.nextLine();

        System.out.println(isValidColor(ps));
    }
}

