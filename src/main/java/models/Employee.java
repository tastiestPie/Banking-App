package models;

public class Employee {
    private int empId;
    private String empName;
    private String empUserName; //password hash should be stored in db

    public Employee(int empId, String empName, String empUserName){
        this.empId = empId;
        this.empName = empName;
        this.empUserName = empUserName;
    }

    //Getters and Setters
    public void setEmpName(String empName){this.empName = empName;} 
    public void setEmpUserName(String empUserName){this.empUserName = empUserName;}
    public int getEmpId(){return empId;}
    public String getEmpName(){return empName;}
    public String getEmpUserName(){return empUserName;}

}
