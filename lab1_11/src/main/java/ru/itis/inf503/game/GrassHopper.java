package ru.itis.inf503.game;

import java.util.Random;

public class GrassHopper extends Animal {
    public GrassHopper(String name) {
        // Вызов конструктора предка
        super(name);

    }

    @Override
    public void move() {
        Random random = new Random();
        // Получаем псевдослучайное число от 0 до 3
        int direction = random.nextInt(1,4);
        // 0 - назад 1 - вправо 2 - вперед 3 - влево
        switch (direction) {
            case 1: if (x < Game.WIDTH) x = x + 2; break;
            case 2: if (y < Game.HEIGHT) y = y + 2; break;
            case 3: if (x > 0 ) x = x - 2;
        }
    }
}
