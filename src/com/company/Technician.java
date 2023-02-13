package com.company;

public class Technician extends Person {
    private double salary,bonus,deduction;
    private String responsibility,role;
    public Technician (){

    }
    public Technician (double salary,String responsibility, String role){
        this.salary=salary;
        this.responsibility=responsibility;
        this.role=role;
    }
    public Technician(String id,String first_name,String last_name,
                   int age,String phone,String street,String city,String mail,
                      int day, int month , int year,
                      double salary,double bonus, double deduction
            , String responsibility, String role) {
        super(id,first_name,last_name,age,phone,street,city,mail,day,month,year);
        this.salary=salary;
        this.responsibility=responsibility;
        this.role=role;
        this.bonus=bonus;
        this.deduction=deduction;
    }
    public void setSalary(double salary) {
        this.salary = salary;
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
    public String getResponsibility(){
        return responsibility;
    }
    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return role;
    }
    public void getInformation(){
        super.getInformation();
        System.out.println("Their salary "+salary);
        System.out.println("Their responsibility "+responsibility);
        System.out.println("Their role "+ role);
    }
    public String toString()
    {
        return "Technician {"+ super.toString()+"+ salary "+salary
        +"+ responsibility "+responsibility +"+ role "+role;
    }


}
