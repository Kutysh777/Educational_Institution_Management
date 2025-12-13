public class Main {
    public static void main(String[] args) {

        System.out.println("\n==== LIST OF STUDENTS ====\n");

            Student S1 = new Student(4,"Alisher",4.0f, "Software Engineering");
            Student S2 = new Student(8,"Aikyn",3.67f, "Computer Science");
            Student S3 = new Student(13,"Kuttybay",3.33f, "Software Engineering");
            Student S4 = new Student(17,"Serzhan",2.0f, "Multimedia Technology");



        System.out.println("\n==== LIST OF TEACHER ====\n");
           Teacher T1 = new Teacher(1,"Orazova Arailym", "Arailym.Orazova@astanait.edu.kz", "Object-Oriented Programming");
           Teacher T2 = new Teacher(2,"Sabyrzhan Syrym","syrym.sabyrzhan@astanait.edu.kz", "Introduction to Programming");
           Teacher T3 = new Teacher(3,"Ussipbayev Amirbek","Amirbek.Ussipbayev@astanait.edu.kz", "Calculus 1");
           Teacher T4 = new Teacher(4,"Ormanova Assel","a.ormanova@astanait.edu.kz", "Foreign language 1");

        System.out.println("\n==== LIST OF INSTITUTION ====\n");
           Institution I1 = new Institution("Astana IT University", "Astana", "University", 2019);

        System.out.println("\n==== COMPARISON BY MAJOR ====\n");

        System.out.print("Most popular major:");

        Student[] students = {S1,S2,S3,S4};
        int SE = 0;
        int MT = 0;
        int IT = 0;
        for(int i=0; i<students.length; i++){
            if (students[i].Major.equals("Software Engineering")){
                SE += 1;
            }
            else if (students[i].Major.equals("Multimedia Technology")){
                MT += 1;
            }
            else if (students[i].Major.equals("Computer Science")) {
                IT += 1;
            }}
        if (SE > MT & SE > IT){
            System.out.println("Software Engineering  Students:" + SE);
        }
        else if (MT > SE & MT > IT ){
            System.out.println("Multimedia Technology  Students:" + MT);
        }
        else if (IT > SE & IT > MT ){
            System.out.println("Computer Science  Students:" + IT);
        }
        else if (SE == MT & SE == IT){
            System.out.println("total number of students major equal Students:" + SE);
        }
        }
    }

