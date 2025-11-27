package Homework;

public class BubleSort {
    public static void main(String[] args) {
        int[] arr_numbers = {77,9,0,17,99,1};

        for (int i = 0; i < arr_numbers.length - 1; i++) {
            for (int j = 0; j < arr_numbers.length - 1 - i; j++) {
                if (arr_numbers[j] > arr_numbers[j+1]) {
                    int temp = arr_numbers[j];
                    arr_numbers[j] = arr_numbers[j+1];
                    arr_numbers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr_numbers.length; i++) {
            System.out.print(i + " ");
        }
    }
}