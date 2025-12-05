package Homework.Regular;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Pushkin {

    public static final Pattern PATTERN1 = Pattern.compile("(?<!\\p{L})(Я|мне|моё)(?!\\p{L})", Pattern.CASE_INSENSITIVE);
    public static final Pattern PATTERN2 = Pattern.compile("(?<!\\p{L})мор(е|я|ем|ю|ё)(?!\\p{L})", Pattern.CASE_INSENSITIVE);
    public static final Pattern PATTERN3 = Pattern.compile("(?<!\\p{L})муза(?!\\p{L})", Pattern.CASE_INSENSITIVE);
    public static final Pattern PATTERN4 = Pattern.compile("(?<!\\p{L})любовь(?!\\p{L})", Pattern.CASE_INSENSITIVE);
    public static final Pattern PATTERN5 = Pattern.compile("ветры.*веют", Pattern.CASE_INSENSITIVE);
    public static final Pattern PATTERN6 = Pattern.compile("(?<!\\p{L})друзья(?!\\p{L})", Pattern.CASE_INSENSITIVE);
    public static final Pattern PATTERN7 = Pattern.compile("(?<!\\p{L})поэт(?!\\p{L})", Pattern.CASE_INSENSITIVE);
    public static final Pattern PATTERN8 = Pattern.compile("взор.*встревожит|взор.*тревожит", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("pushkin.txt"));
        int lineNumber = 0;

        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0;

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNumber++;

            if(count1 < 5 && PATTERN1.matcher(line).find()) { System.out.println("1: " + lineNumber); count1++; }
            if(count2 < 5 && PATTERN2.matcher(line).find()) { System.out.println("2: " + lineNumber); count2++; }
            if(count3 < 5 && PATTERN3.matcher(line).find()) { System.out.println("3: " + lineNumber); count3++; }
            if(count4 < 5 && PATTERN4.matcher(line).find()) { System.out.println("4: " + lineNumber); count4++; }
            if(count5 < 5 && PATTERN5.matcher(line).find()) { System.out.println("5: " + lineNumber); count5++; }
            if(count6 < 5 && PATTERN6.matcher(line).find()) { System.out.println("6: " + lineNumber); count6++; }
            if(count7 < 5 && PATTERN7.matcher(line).find()) { System.out.println("7: " + lineNumber); count7++; }
            if(count8 < 5 && PATTERN8.matcher(line).find()) { System.out.println("8: " + lineNumber); count8++; }
        }

        scanner.close();
    }
}
