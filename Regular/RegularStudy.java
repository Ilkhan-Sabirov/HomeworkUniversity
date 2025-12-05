package Homework.Regular;

import java.util.regex.Pattern;

public class RegularStudy {
    public static void main(String[] args) {
        System.out.println(
                Pattern.matches("^П.{2}а", "Папа")
        );

        String EMAIL_PATTERN = "^[a-zA-Z\\d\\-_]+@[a-zA-Z\\d\\-_]+\\.[a-z]{2,}";

        System.out.println(
                Pattern.matches(EMAIL_PATTERN,"root12test@mail-1.java")
        );
    }
}
