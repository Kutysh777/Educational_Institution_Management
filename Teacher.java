public class Teacher extends Person {

    public String email;
    public String Teaching_disciplines;

    public Teacher(int ID, String name, String email, String Teaching_disciplines) {
        super(ID, name);
        this.email = email;
        this.Teaching_disciplines = Teaching_disciplines;
        System.out.println(getValues());
    }

    public String getValues() {
        return "ID:" + ID + " Name:" + name + " Email:" + email +
                " Teaching_disciplines:" + Teaching_disciplines;
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    @Override
    public String toString() {
        return getRole() + " -> ID:" + ID + ", Name:" + name +
                ", Subject:" + Teaching_disciplines;
    }
}
