public class Student {
  
   private int rollNumber;
   private String name;
   private String gaurdianName;
   private int standard;
   private String schoolName;

   public int getRollNumber(){
    return rollNumber;
}
    public void setRollNumber(int rollNumber){
    this.rollNumber = rollNumber;
}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGaurdianName(){
        return gaurdianName ;
    }
    public void setGaurdianName(String gaurdianName){
        this.gaurdianName = gaurdianName;
    }
    public int getStandard(){
        return standard;
    }
    public void setStandard(int standard){
        this.standard = standard;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    public String toString(){
        return "Properties in Student are: \nSchool Name: "+schoolName+"\nStandard: "+standard+"\nRoll Number: "+rollNumber+"\nName: "+name+"\nGuardian Name: "+ gaurdianName;
    }
}
