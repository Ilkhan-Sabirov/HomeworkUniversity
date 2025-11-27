package Homework.HM6;

public class FunctionHM7 {
    public static void main(String[] args) {
        int[] numbers = {77, 9, 0, 17, 99, 1};

        double average = calculateAverage(numbers);
        System.out.println("Среднее значение: " + average);
    }

    public static double calculateAverage(int[] arr) {
        int sum = recursiveSum(arr, 0);
        return (double) sum / arr.length;
    }

    public static int recursiveSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }

        return arr[index] + recursiveSum(arr, index + 1);
    }
}
