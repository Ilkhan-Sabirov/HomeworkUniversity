package Homework.lab1_10.src.main.java;

import java.util.Scanner;

public class Program {
    private User[] dataBase;

    private int countUsers;

    public Program() {
        dataBase = new User[100];
        dataBase[0] = new User("Ilkhan","12345","ADMIN");
        dataBase[1] = new User("Malik","41424","USER");
        dataBase[2] = new User("Arina","77777","USER");
        dataBase[3] = new User("Sasha","12345","USER");

        countUsers = 4;
    }

    public void run() {
        User user = sigIn();
        // Если user null то заканчиваем иначе создём объект Work
        // Проверка на null
        new Work(user).showMenu();
    }

    public User sigIn() {
        // Ввод с консоли
        // checkUser
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        User user = checkUser(login,password);
        return user;
    }

    public User checkUser(String login, String password) {
        for (int i = 0; i < countUsers; i++) {
            if (login.equals(dataBase[i].getLogin()) && password.equals(dataBase[i].getPassword())) {
                return dataBase[i];
            }
        }
        System.out.println("Неверный логин или пароль, повторите попытку снова");
        return sigIn();
    }
}
