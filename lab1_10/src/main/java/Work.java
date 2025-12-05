package Homework.lab1_10.src.main.java;

public class Work {
    private User user;

    public Work(User user) {
        this.user = user;
    }

    private void showAdminMenu() {
        System.out.println("Консоль ADMIN");
    }

    private void showUserMenu() {
        System.out.println("Меню пользователя");
    }


    public void showMenu() {
        switch (user.getRole()) {
            case "ADMIN": showAdminMenu(); break;
            case "USER": showUserMenu(); break;
        }
    }
}
