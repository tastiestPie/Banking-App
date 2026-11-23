package models;

public class Customer {
    private int custId;
    private String name;
    private String userName; //password hash should be stored in db
    boolean freeze;
    
    public Customer(int custId, String name, String userName){
        this.custId = custId;
        this.name = name;
        this.userName = userName;
        this.freeze = false;
    }
    //Getters and Setters
    public void setName(String name){this.name = name;}
    public void setUserName(String userName){this.userName = userName;}
    public void setFreeze(boolean freeze){this.freeze = freeze;}
    public int getCustId(){return custId;}
    public String getName(){return name;}
    public String getUserName(){return userName;}
    public boolean isFreeze(){return freeze;}

}
