public class Course {
    private String courseName;
    private Teacher teacher;

    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + ", Teacher: " + teacher.getName();
    }
}
