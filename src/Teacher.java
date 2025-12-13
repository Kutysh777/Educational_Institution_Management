public class Teacher {
    public int ID;
    public String name;
    public String email;
    public String Teaching_disciplines;


public Teacher(int ID,String name,String email, String Teaching_disciplines){
    setValues(ID, name, email, Teaching_disciplines);
    System.out.println(getValues());

}
public void setValues(int ID,String name,String email, String Teaching_disciplines){
    this.name=name;
    this.ID=ID;
    this.email=email;
    this.Teaching_disciplines=Teaching_disciplines;
}
public String getValues(){
    String infoTeacher = "ID:" + ID + "  Name:" + name + "  Email:" + email + "  Teaching_disciplines:" + Teaching_disciplines;
    return infoTeacher;
}

}
