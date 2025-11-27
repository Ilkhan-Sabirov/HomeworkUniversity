package Homework;//"default"      :  "\u001b[39m",
//        "black"        :  "\u001b[30m",
//        "red"          :  "\u001b[31m",
//        "green"        :  "\u001b[32m",
//        "yellow"       :  "\u001b[33m",
//        "blue"	       :  "\u001b[34m",
//        "magenta"      :  "\u001b[35m",
//        "cyan"	       :  "\u001b[36m",
//        "lightGray"	   :  "\u001b[37m",
//        "darkGrey"     :  "\u001b[90m",
//        "lightRed"     :  "\u001b[91m",
//        "lightGreen"   :  "\u001b[92m",
//        "lightYellow"  :  "\u001b[93m",
//        "lightBlue"    :  "\u001b[94m",
//        "lightMagenta" :  "\u001b[95m",
//        "lightCyan"    :  "\u001b[96m",
//        "white"        :  "\u001b[97m"

public class Zadanie1 {
    public static void main(String[] args) {
        String RESET = "\u001B[0m";

        String RED = "\u001B[91m";
        String BLACK = "\u001b[30m";
        String GREEN = "\u001b[32m";
        String WHITE = "\u001B[97m";
        String BLUE = "\u001B[34m";
        String YELLOW = "\u001b[33m";

        String RECTANGLE = "\u2588";

        String WHITE_LINE = WHITE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE+ RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE;
        String BLUE_LINE = BLUE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE+ RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE;
        String RED_LINE = RED + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE+ RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE;
        String GREEN_LINE = GREEN + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE+ RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE;
        String YELLOW_LINE = YELLOW + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE+ RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE + RECTANGLE;

        // Первый флаг

        for (int i = 0; i < 4; i++) {
            System.out.println(WHITE_LINE);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(BLUE_LINE);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(RED_LINE);
        }

        System.out.println("                                          ");

        // Второй флаг

        for (int i = 0; i < 4; i++) {
            System.out.println(WHITE_LINE);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(GREEN_LINE);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(RED_LINE);
        }

        System.out.println("                                          ");

        // Третий флаг

        for (int i = 0; i < 4; i++) {
            System.out.println(RED_LINE);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(WHITE_LINE);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(BLUE_LINE);
        }

        System.out.println("                                          ");

        // Четвёртый флаг

        for (int i = 0; i < 4; i++) {
            System.out.println(RED_LINE);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(WHITE_LINE);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(RED_LINE);
        }

        System.out.println("                                          ");

        // Пятый флаг

        for (int i = 0; i < 4; i++) {
            System.out.println(YELLOW_LINE);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(GREEN_LINE);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(RED_LINE);
        }
    }
}