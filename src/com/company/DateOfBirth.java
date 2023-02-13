package com.company;

public class DateOfBirth {
    private int day,month,year;
    public DateOfBirth(){

    }
    public DateOfBirth(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public void setDay(int day){
        if (day>31||day<1)System.out.println("Invalid day");
        else this.day=day;
    }
    public void setMonth(int month){
        if (month>12||month<1)System.out.println("Invalid month");
        else this.month=month;
    }
    public void setYear(int year){
        if (year<1)System.out.println("Invalid year");
        else this.year=year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
}
