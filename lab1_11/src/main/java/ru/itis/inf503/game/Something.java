package ru.itis.inf503.game;

import java.util.Random;

public class Something extends Animal {
    public Something(String name) {
        // Вызов конструктора предка
        super(name);
    }

    @Override
    public void move() {
        Random random = new Random();
        // Получаем псевдослучайное число от 0 до 3
        x = random.nextInt(1,1001);
        y = random.nextInt(1,1001);
        }
}
