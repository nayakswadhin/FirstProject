public class Employee {
   private String name;
   private int addhaarNumber;
   private int employeeID;
   private String companyName;

    // public String getName(){
    //     return name;
    // }
    // public void setName(String name){
    //     this.name= name;
    // }
    // public int getAddhaarNumber(){
    //     return addhaarNumber;
    // }
    // public void setAddhaarNumber(int addhaarNumber){
    //     this.addhaarNumber= addhaarNumber;
    // }
    // public int getEmployeeID(){
    //     return employeeID;
    // }
    // public void setEmployeeID(int employeeID){
    //     this.employeeID= employeeID;
    // }
    // public String getCompanyName(){
    //     return companyName;
    // }
    // public void setCompanyName(String companyName){
    //     this.companyName= companyName;
    // }

    Employee(String name,int addhaarNumber,int employeeID, String companyName){
        this.name=name;
        this.addhaarNumber=addhaarNumber;
        this.employeeID=employeeID;
        this.companyName= companyName;
    }

    
     public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAddhaarNumber() {
        return addhaarNumber;
    }


    public void setAddhaarNumber(int addhaarNumber) {
        this.addhaarNumber = addhaarNumber;
    }


    public int getEmployeeID() {
        return employeeID;
    }


    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }


    public String getCompanyName() {
        return companyName;
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String toString(){
        return "Properties in Employee is:\nName: "+name+"\naddhaarNumber: "+addhaarNumber+"\nemployeeID: "+employeeID+"\nCompany Name: "+companyName;
    }

    
}
