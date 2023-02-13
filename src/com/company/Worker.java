package com.company;

public class Worker extends Person {
    private double bonus,salary,deduction;
    private String responsibility,role;
    public Worker(){
    }
    public Worker(String id,String first_name,String last_name,int age,String phone
            ,String street,String city,String mail,
                  int day, int month , int year, String responsibility,String role
            , double salary,double bonus, double deduction){
        super(id,first_name,last_name,age,phone,street,city,mail,day,month,year);
        this.salary=salary;
        this.bonus=bonus;
        this.deduction=deduction;
        this.responsibility=responsibility;
        this.role=role;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public void setDeduction(double deduction){
        this.deduction=deduction;
    }
    public double getSalary(){
        return salary+bonus-deduction;
    }
    public double getBonus(){
        return bonus;
    }
    public double getDeduction(){
        return deduction;
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
    public void getInformation(){
        super.getInformation();
        System.out.println("Their salary "+this.getSalary());
        System.out.println("Their responsibility "+responsibility);
        System.out.println("Their role "+ role);
    }
    public String toString ()
    {
        return "Worker {" +  super.toString() + ",salary=" + this.getSalary() +
                ",Responsibility=" + responsibility +",Role=" + role +  "}";
    }


}
