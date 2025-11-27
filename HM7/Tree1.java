package Homework.HM7;

import java.util.Arrays;

public class Tree1 {

    public static char[] find(int x, int nodeIndex, int[] arr,String way) {
        if (x == arr[nodeIndex]) return way.toCharArray();
        char[] r;
        // Проверяем есть ли у узла nodeIndex левый потомок
        if (2 * nodeIndex + 1 < arr.length) {
            r = find(x, 2 * nodeIndex + 1, arr,way + 'l');

            if (r.length > 0) return r;
        }
        // Проверяем есть ли у узла nodeIndex правый потомок
        if (2 * nodeIndex + 2 < arr.length) {
            r = find(x, 2 * nodeIndex + 2, arr, way + 'r');
            if (r.length > 0) return r;
        }
        return new char[0];
    }
    public static void main(String[] args) {
        int[] tree = {7,1,7,11,4,2,5,6,3,9,13,12,14,10,17};
        int x = 12;
        System.out.println(Arrays.toString(find(x, 0, tree,"")));
    }
}
