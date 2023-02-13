package com.company;

public class Administrator extends Person {
    private String responsibility,role;
    private double salary;
    public Administrator(){

    }
    public Administrator(String id, String first_name,String last_name,
                         int age, String phone,String street,String city,String mail,
                         int day, int month, int year,
                         String responsibility,String role){
        super(id,first_name,last_name, age,phone, street,city,mail,day,month,year);
        this.responsibility=responsibility;
        this.role=role;
    }
    public void setResponsibility(String responsibility){
        this.responsibility=responsibility;
    }
    public void setRole(String role){
        this.role=role;
    }
    public String getResponsibility(){
        return responsibility;
    }
    public String getRole(){
        return role;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }
    public void getInformation(){
        super.getInformation();
        System.out.println("Their salary "+salary);
        System.out.println("Their responsibility "+responsibility);
        System.out.println("Their role "+ role);
    }
    public String toString()
    {
        return " Administrator{"+ super.toString()+ ",salary=" + salary+
                ",Role=" + role +",Responsibility="+responsibility+"}";
    }


}
