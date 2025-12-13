package Homework.lab1_13_1.src.main.java.ru.itis.inf503.tree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BTree bTree = new BTree();
        bTree.add(10);
        bTree.add(6);
        bTree.add(4);
        bTree.add(8);
        bTree.add(5);

        System.out.println(bTree);

        System.out.println(Arrays.toString(bTree.getPath(5)));
        System.out.println(bTree.max());
        System.out.println(bTree.min());
    }
}
