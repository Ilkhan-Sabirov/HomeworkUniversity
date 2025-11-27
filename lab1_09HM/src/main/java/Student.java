public class Student {
    public String name;
    public String group;
    double rating = 0;

    Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public double countScore(double points) {
        return rating = rating + points;
    }
}
