public class Main {
    public static void main(String[] args) {

        Student S1 = new Student(4,"Alisher",4.0f, "Software Engineering");
        Student S2 = new Student(8,"Aikyn",3.67f, "Computer Science");
        Student S3 = new Student(13,"Kuttybay",3.33f, "Software Engineering");
        Student S4 = new Student(17,"Serzhan",2.0f, "Multimedia Technology");

        Teacher T1 = new Teacher(1,"Orazova Arailym",
                "Arailym.Orazova@astanait.edu.kz",
                "Object-Oriented Programming");

        Institution I1 = new Institution("Astana IT University",
                "Astana","University",2019);

        I1.addStudent(S1);
        I1.addStudent(S2);
        I1.addStudent(S3);
        I1.addStudent(S4);

        I1.addTeacher(T1);

        System.out.println("\n==== ALL MEMBERS ====\n");
        I1.showAllMembers();

        Course oop = new Course("OOP", T1);
        System.out.println(oop);
    }
}
