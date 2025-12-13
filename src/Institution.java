public class Institution {
    String name;
    String city;
    String type;
    int Foundedyear;

public Institution(String name,String city,String type,int Foundedyear){
    setValues(name,city,type,Foundedyear);
    System.out.println(getValues());
}

public void setValues(String name,String city,String type,int Foundedyear){
    this.name=name;
    this.city=city;
    this.type=type;
    this.Foundedyear=Foundedyear;
}

public String getValues(){
    String InfoInstitution = "Name:" +  name + "  City:" +  city + "  Type:" +  type + "  FoundedYear:" +  Foundedyear;
    return InfoInstitution;
}
}
