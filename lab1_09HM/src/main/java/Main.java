import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ilkhan","11-503");
        Teacher teacher = new Teacher("Kamil Enikeev");
        Discipline discipline = new Discipline("Informatika",teacher);

        Vedomosti vedomosti  = new Vedomosti(student, "11.11.2025", "контрольную работу", discipline, teacher);

        vedomosti.Scoring(100);

        vedomosti.printVedomost();

    }
}
