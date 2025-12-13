public class Student {
    public int ID;
    public String name;
    public float GPA;
    public String Major;

public Student (int ID,String name,float GPA, String Major  ){
    setValues(ID,name,GPA,Major);
    System.out.println(getValues());
}
public void setValues(int ID,String name,float GPA,String Major){
    this.ID=ID;
    this.name=name;
    this.GPA=GPA;
    this.Major=Major;
}
public String getValues(){
    String infoStudent = "ID:" +  ID + "  Name:" +  name + "  GPA:" +  GPA + "  Major:" +  Major;
    return infoStudent;
}

}