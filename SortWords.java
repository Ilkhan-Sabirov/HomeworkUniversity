package Homework;

public class SortWords {
    public static void main(String[] args) {
        char[] words = {'a','c','b','d','p','o','g'};

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j] > words[j+1]) {
                    char temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
