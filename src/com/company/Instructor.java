package com.company;

public class Instructor extends Person {
    private String department;
    private double salary;
    public Instructor(){
    }
    public Instructor(String id,String first_name,String last_name, int age
            ,String phone,String street,String city,String mail,
                      int day, int month , int year,
                      double salary,String department){
        super(id, first_name,last_name, age, phone, street,city,mail,day,month,year);
        this.salary=salary;
        this.department=department;
    }
    public Instructor(String id,String first_name,String last_name){
        super(id,first_name,last_name);
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary(){
        return salary;
    }
    public void getInformation(){
        super.getInformation();
        System.out.println("Salary "+this.salary);
        System.out.println("department name "+this.department);
    }
    public String toString() {
        return "Instructor {" + super.toString()
        +" +department "+ department+ " + salary  "+salary+"}";
    }


}
