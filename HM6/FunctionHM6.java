package Homework.HM6;

public class FunctionHM6 {
    public static void main(String[] args) {

        int[] res = sort(new int[]{77, 9, 0, 17, 99, 1});

        for (int num : res) {
            System.out.println(num);
        }
    }

    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (compare(a[j], a[j+1])) {
                    swap(a,j,j+1);
                }
            }
        }
        return a;
    }

    public static boolean compare(int a, int b) {
        return a > b;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
