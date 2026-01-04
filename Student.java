public class Student extends Person {

    public float GPA;
    public String Major;

    public Student(int ID, String name, float GPA, String Major) {
        super(ID, name);
        this.GPA = GPA;
        this.Major = Major;
        System.out.println(getValues());
    }

    public String getValues() {
        return "ID:" + ID + " Name:" + name + " GPA:" + GPA + " Major:" + Major;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return getRole() + " -> ID:" + ID + ", Name:" + name + ", GPA:" + GPA + ", Major:" + Major;
    }
}
