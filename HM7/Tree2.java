package Homework.HM7;

import java.util.Arrays;

public class Tree2 {

    public static char[] find(int nodeIndex, int[] arr,String way) {
        int maxNumber = arr[nodeIndex];
        char[] maxPath = way.toCharArray();
        // Проверяем есть ли у узла nodeIndex левый потомок
        if (2 * nodeIndex + 1 < arr.length) {
            char[] leftPath = find( 2 * nodeIndex + 1, arr,way + 'l');
            int leftValue = getIndexFromPath(leftPath,arr);

            if (leftValue > maxNumber) {
                maxNumber = leftValue;
                maxPath = leftPath;
            }



        }
        // Проверяем есть ли у узла nodeIndex правый потомок
        if (2 * nodeIndex + 2 < arr.length) {
            char[] rightPath = find(2 * nodeIndex + 2, arr, way + 'r');
            int rightValue = getIndexFromPath(rightPath,arr);

            if (rightValue > maxNumber) {
                maxNumber = rightValue;
                maxPath = rightPath;
            }

        }
        return maxPath;
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

        char[] maxPath = find(0, tree, "");
        int maxIndex = getIndexFromPath(maxPath, tree);
        int maxValue = tree[maxIndex];

        System.out.println("Максимальное число в дереве: " + maxValue);
        System.out.println("Путь до максимального числа: " + Arrays.toString(maxPath));

    }
}
