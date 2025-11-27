package Homework.HM7;

import java.util.Arrays;

public class Tree3 {

    public static char[] find(int nodeIndex, int[] arr,String way) {
        int minNumber = arr[nodeIndex];
        char[] minPath = way.toCharArray();
        // Проверяем есть ли у узла nodeIndex левый потомок
        if (2 * nodeIndex + 1 < arr.length) {
            char[] leftPath = find( 2 * nodeIndex + 1, arr,way + 'l');
            int leftValue = getIndexFromPath(leftPath,arr);

            if (leftValue < minNumber) {
                minNumber = leftValue;
                minPath = leftPath;
            }



        }
        // Проверяем есть ли у узла nodeIndex правый потомок
        if (2 * nodeIndex + 2 < arr.length) {
            char[] rightPath = find(2 * nodeIndex + 2, arr, way + 'r');
            int rightValue = getIndexFromPath(rightPath,arr);

            if (rightValue < minNumber) {
                minNumber = rightValue;
                minPath = rightPath;
            }

        }
        return minPath;
    }

    public static int getIndexFromPath(char[] path, int[] arr) {
        int index = 0;

        for (char direction : path) {
            if (direction == 'l') {
                index = 2 * index + 1;
            } else if (direction == 'r') {
                index = 2 * index + 2;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] tree = {7,1,7,11,4,2,5,6,3,9,13,12,14,10,17};

        char[] minPath = find(0, tree, "");
        int maxIndex = getIndexFromPath(minPath, tree);
        int minValue = tree[maxIndex];

        System.out.println("Минимальое число в дереве: " + minValue);
        System.out.println("Путь до минимального числа: " + Arrays.toString(minPath));

    }
}
