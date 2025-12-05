package ru.itis.inf503.game;

import java.util.Random;

public class Game {

    public final static int WIDTH = 1000;
    public final static int HEIGHT = 1000;

    public final static int SQ_X = 400;
    public final static int SQ_Y = 400;

    public final static int SQ_WIDTH = 200;
    public final static int SQ_HEIGHT = 200;

    public void run() {
        Random random = new Random();
        int position = random.nextInt(1,1000);
        Ant ant = new Ant("Муравьишка");
        ant.setStartPosition(position,0);

//        for (int i = 0; i < 100; i++) {
//            ant.move();
//            System.out.println("x = " + ant.getX() + " y = " + ant.getY());
//        }

        Turtle turtle = new Turtle("Тётя Мотя");
        turtle.setStartPosition(position,0);

//        for (int i = 0; i < 100; i++) {
//            turtle.move();
//            System.out.println("x = " + turtle.getX() + " y = " + turtle.getY());
//        }

        GrassHopper grassHopper = new GrassHopper("Кузя");
        grassHopper.setStartPosition(position,0);

//        for (int i = 0; i < 100; i++) {
//            grassHopper.move();
//            System.out.println("x = " + grassHopper.getX() + " y = " + grassHopper.getY());
//        }

        Something something = new Something("Пришелец");
        something.setStartPosition(position,0);

//        for (int i = 0; i < 100; i++) {
//            something.move();
//            System.out.println("x = " + something.getX() + " y = " + something.getY());
//        }

        while (true) {
            ant.move();
            turtle.move();
            grassHopper.move();
            something.move();

            if ((ant.getX() > 400 && ant.getX() < 600) && (ant.getY() > 400 && ant.getY() < 600)) {
                System.out.println("Координата X у муравья = " + ant.getX());
                System.out.println("Координата Y у муравья = " + ant.getY());
                break;
            }
            if ((turtle.getX() > 400 && turtle.getX() < 600) && (turtle.getY() > 400 && turtle.getY() < 600)) {
                System.out.println("Координата X у черепахи = " + turtle.getX());
                System.out.println("Координата Y у черепахи = " + turtle.getY());
                break;
            }
            if ((grassHopper.getX() > 400 && grassHopper.getX() < 600) && (grassHopper.getY() > 400 && grassHopper.getY() < 600)) {
                System.out.println("Координата X у кузнечика = " + grassHopper.getX());
                System.out.println("Координата Y у кузнечика = " + grassHopper.getY());
                break;
            }
            if ((something.getX() > 400 && something.getX() < 600) && (something.getY() > 400 && something.getY() < 600)) {
                System.out.println("Координата X у пришельца = " + something.getX());
                System.out.println("Координата Y у пришельца = " + something.getY());
                break;
            }
        }
    }
}
