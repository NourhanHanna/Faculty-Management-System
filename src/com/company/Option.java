package com.company;

public class Option {
    public static String character(int person){
        String name="";
        if (person==1)name="student";
        else if (person==2)name="instructor";
        else if (person==3)name="administrator";
        else if (person==4)name="worker";
        else if (person==5)name="technician";
        return name;
    }
    public static void operation(int person){
        String name=character(person);
        System.out.println("**********");
        System.out.println("If you want to add the "+name+", enter= 1");
        System.out.println("If you want to get the "+name+"'s" +
                " information, enter=2");
        System.out.println("If you want to edit the "+name+"'s information" +
                ", enter= 3");
        System.out.println("If you want to remove the "+name+", enter= 4");
        System.out.println("if you want to change the section" +
                ", enter number greater than 4");
        System.out.println("If you want to exit, enter -1");

    }
    public static void optionsShow(int person){
        String name=character(person);
        System.out.println("**********");
        System.out.println("If you want "+name+"'s information enter 1");
        System.out.println("If you want all "+name+"s' information" +
                " enter 2");

    }
}
