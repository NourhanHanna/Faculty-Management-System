package com.company;

public class Student extends Person {

    private String dep_name;
    private double GPA;
    private int level;

    public Student() {
    }

    public Student(String id,String first_name,String last_name,
                   int age,String phone,String street,String city,String mail,
                   int day, int month , int year,
                   String dep_name, double GPA,  int level) {
        super(id,first_name,last_name,age,phone,street,city,mail,day,month,year);
        this.dep_name = dep_name;
        this.GPA = GPA;
        this.level = level;
    }
    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }
    public String getDep_name() {
        return dep_name;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public double getGPA() {
        return GPA;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    public void getInformation(){
        super.getInformation();
        System.out.println("Department Name "+this.getDep_name());
        System.out.println("GPA "+this.getGPA());
        System.out.println("Level "+this.getLevel());
    }
    public String toString()
    {
        return "Student {" +super.toString()+
                ",level="+level+",Gpa"+GPA+",department name="+ dep_name+"}";
    }

}
