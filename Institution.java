import java.util.ArrayList;

public class Institution {

    String name;
    String city;
    String type;
    int Foundedyear;

    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();

    public Institution(String name, String city, String type, int Foundedyear) {
        this.name = name;
        this.city = city;
        this.type = type;
        this.Foundedyear = Foundedyear;
        System.out.println(getValues());
    }

    public String getValues() {
        return "Name:" + name + " City:" + city +
                " Type:" + type + " FoundedYear:" + Foundedyear;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    public void showAllMembers() {
        for (Student s : students) {
            System.out.println(s);
        }
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }
}
