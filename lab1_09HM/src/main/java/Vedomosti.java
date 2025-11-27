public class Vedomosti {
    public double score;

    Student student;
    Teacher teacher;
    Discipline discipline;
    String date;
    String cause;

    public double Scoring(double score) {
        return student.countScore(score);
    }

    Vedomosti(Student student, String date, String cause, Discipline discipline, Teacher teacher) {
        this.student = student;
        this.date = date;
        this.cause = cause;
        this.discipline = discipline;
        this.teacher = teacher;

    }

    public void printVedomost() {
        System.out.println("Студент: " + student.name + " номер группы: " + student.group);
        System.out.println("Дисциплина: " + discipline.name + " преподаватель: " + teacher.name);
        System.out.println("Баллы: " + Scoring(score) + " дата выставления: " + this.date + " выставлено за " + this.cause);
        //System.out.println("Баллы: " + Scoring(100) + " дата выставления: " + this.date + " выставлено за " + this.cause);
    }
}
