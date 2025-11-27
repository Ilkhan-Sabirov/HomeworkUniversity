package Homework;

public class Main {
    public static void main(String[] args) {
        //int varInt = 100;

        //int varInt2;
        //varInt2 = 0b01100100;

        // int varInt3 = 0x64;

        // System.out.println("Значение переменной varInt1 = " + varInt/3.0);

        boolean varBool1 = true;
        boolean varBool2 = false;

        System.out.println("-------------------------------------------------");
        System.out.println("var1  | var2  |   &   |   |   |   ^    |   !   |");
        System.out.println("-------------------------------------------------");
        System.out.println("true  | true  | " + (varBool1 & varBool1) + "  | " + (varBool1 | varBool1) + "  | " + (varBool1 ^ varBool1) + "  | " + (!varBool1) + " |");
        System.out.println("false | false | " + (varBool2 & varBool2) + " | " + (varBool2 | varBool2) + " | " + (varBool2 ^ varBool2) + "  | " + (!varBool2) + "  |");
        System.out.println("true  | false | " + (varBool1 & varBool2) + " | " + (varBool1 | varBool2) + "  | " + (varBool1 ^ varBool2) + "   | " + (!varBool1) + " |");
        System.out.println("false | true  | " + (varBool2 & varBool1) + " | " + (varBool2 | varBool1) + "  | " + (varBool2 ^ varBool1) + "   | " + (!varBool2) + "  |");
        System.out.println("-------------------------------------------------");

    }
}