package Homework.lab1_13_1.src.main.java.ru.itis.inf503.tree;

public interface IntCollection {
    void add(int value);
    int size();
    String[] getPath(int value);
    int max();
    int min();

}