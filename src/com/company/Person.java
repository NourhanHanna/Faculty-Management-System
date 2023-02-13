package com.company;
import java.util.Date;
abstract public class Person implements Information {
    private String id,mail;
    private Name name=new Name();
    private int age;
    private String phone;
    private Address address=new Address();
    private  DateOfBirth date_of_birth=new DateOfBirth();
    public Person() {
    }

    public Person(String id, String first_name,String last_name) {
        this.id = id;
        name=new Name(first_name, last_name);
    }

    public Person(String id, String first_name, String last_name,
                  int age, String phone, String street,String city,String mail,
                  int day,int month, int year) {
        this.id = id;
        name = new Name(first_name, last_name);
        this.age = age;
        this.phone = phone;
        this.address = new Address(street,city);
        this.mail=mail;
        date_of_birth=new DateOfBirth(day,month,year);

    }

    public void setId(String id) {

        this.id = id;
    }

    public String getId() {

        return id;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public String getMail(){
        return mail;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String street, String city) {
        address.setStreet(street);
        address.setCity(city);
    }
    public String getAddress() {

        return (address.getStreet()+' '+address.getCity());
    }
    public void setName(String first_name,String last_name){
        name.setFirst_name(first_name);
        name.setLast_name(last_name);
    }
    public String getName(){
        return (name.getFirst_name()+' '+name.getLast_name());
    }

    public void setDate_of_birth(int day,int month, int year) {
        date_of_birth.setDay(day);
        date_of_birth.setMonth(month);
        date_of_birth.setYear(year);
    }

    public String getDate_of_birth() {
        return (date_of_birth.getDay()+"/"+date_of_birth.getMonth()+"/"
                + date_of_birth.getYear());
    }

    public void getInformation(){
        System.out.print("Name "+name.getFirst_name());
        System.out.println(" "+name.getLast_name());
        System.out.println("ID "+id);
        System.out.println("Age "+age);
        System.out.println("Phone "+phone);
        System.out.println("Address "+this.getAddress());
        System.out.println("Mail "+mail);
        System.out.println("Date Of Birth "+this.getDate_of_birth());
    }
    public String toString()
    {
        return  "Id=" + id + ", name=" + this.getName() + ", age=" + age +
                ", phone=" + phone + ", address=" + this.getAddress()+
                ", date of birth "+this.getDate_of_birth()+", mail="+mail ;

    }
    public boolean equals(Object obj){
        Person pe=(Person)obj;
        if (id.equals(pe.id))return true;
        else return false;
    }
}
