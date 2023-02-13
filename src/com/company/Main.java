package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Instructor> instructors = new ArrayList<>();
        ArrayList<Administrator> administrators = new ArrayList<>();
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<Technician> technicians = new ArrayList<>();

            while (true){
            int person=0;
            try{
        System.out.println("If you want student section enter 1");
        System.out.println("If you want instructor section enter 2");
        System.out.println("If you want administrator section enter 3");
        System.out.println("If you want worker section enter 4");
        System.out.println("If you want Technician section enter 5");
        System.out.println("If you want to exit enter -1");
        person = input.nextInt();
            }catch(Exception e){
                System.out.println("The following error occurred: "+e.getMessage());
                System.out.println("Please, Enter valid data");
                person=-1;
            }
        int enter=0;
            try{
        if (person == 1) {
            while (true) {

                    Option.operation(person);
                    enter = input.nextInt();

                    if (enter == 1) {
                        Student s1 = new Student();
                        String temp;
                        System.out.println("Please, enter student's ID");
                        temp = input.next();
                        s1.setId(temp);
                        System.out.println("Please, enter the student's first name");
                        String first_name = input.next();
                        System.out.println("Please, enter the student's last name");
                        String last_name=input.next();
                        s1.setName(first_name, last_name);
                        System.out.println("Please, enter student's age");
                        int age = input.nextInt();
                        s1.setAge(age);
                        System.out.println("Please, enter student's phone number");
                        temp = input.next();
                        s1.setPhone(temp);
                        System.out.println("Please, enter student's street name");
                        String street = input.next();
                        System.out.println("Please, enter student's city name");
                        String city=input.next();
                        s1.setAddress(street,city);
                        System.out.println("Please, enter student's level");
                        int level = input.nextInt();
                        s1.setLevel(level);
                        System.out.println("Please, enter student's GPA");
                        float gpa = input.nextFloat();
                        s1.setGPA(gpa);
                        System.out.println("Date Of Birth:");
                        System.out.println("Please, enter the day");
                        int day=input.nextInt();
                        System.out.println("Please, enter the month");
                        int month=input.nextInt();
                        System.out.println("Please, enter the year");
                        int year=input.nextInt();
                        s1.setDate_of_birth(day,month,year);
                        System.out.println("Please, enter the student's mail");
                        temp=input.next();
                        s1.setMail(temp);
                        System.out.println("Please, enter student's department name");
                        temp = input.next();
                        s1.setDep_name(temp);

                        students.add(s1);
                        System.out.println("The student has been added successfully");
                        System.out.println("The information has been added is :");
                       System.out.println( s1.toString());
                    }
                    else if (enter == 2) {
                        int type;
                       Option.optionsShow(person);
                        type = input.nextInt();
                        if (type == 1) {
                            boolean found=false;
                            System.out.println("Please, enter the student's id");
                            String id = input.next();
                            for (int i = 0; i < students.size(); i++){
                                if (students.get(i).getId().equals(id)) {
                                    students.get(i).getInformation();
                                    found = true;
                                    break;
                                }
                            }
                           if (!found)System.out.println("The student not found");
                        } else {
                            for (int i = 0; i < students.size(); i++) {
                                Student s1 = new Student();
                                s1 = students.get(i);
                                s1.getInformation();
                                System.out.println();
                            }
                        }
                    }
                    else if (enter == 3) {
                        System.out.println("Please, enter the student's id");
                        String id = input.next();
                        boolean found = false;
                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).getId().equals( id)) {
                                found = true;
                                String temp;
                                System.out.println("Please, enter student's new first" +
                                        " name");
                                String first_name = input.next();
                                System.out.println("Please, enter student's new last" +
                                        " name");
                                String last_name=input.next();
                                students.get(i).setName(first_name,last_name);
                                System.out.println("Please, enter student's new age");
                                int age = input.nextInt();
                                students.get(i).setAge(age);
                                System.out.println("Please, enter student's new" +
                                        " phone number");
                                temp = input.next();
                                students.get(i).setPhone(temp);
                                System.out.println("Please, enter student's new street");
                                String street = input.next();
                                System.out.println("Please, enter student's new city");
                                String city=input.next();
                                students.get(i).setAddress(street,city);
                                System.out.println("Please, enter student's new GPA");
                                float gpa = input.nextFloat();
                                students.get(i).setGPA(gpa);
                                System.out.println("Please, enter student's new level");
                                int level = input.nextInt();
                                students.get(i).setLevel(level);
                                System.out.println("Please, enter student's " +
                                        "new department name");
                                temp = input.next();
                                students.get(i).setDep_name(temp);
                                System.out.println("Date Of Birth:");
                                System.out.println("Please, enter the day");
                                int day=input.nextInt();
                                System.out.println("Please, enter the month");
                                int month=input.nextInt();
                                System.out.println("Please, enter the year");
                                int year=input.nextInt();
                                students.get(i).setDate_of_birth(day,month,year);
                                System.out.println("Please, enter the student's new mail");
                                temp=input.next();
                                students.get(i).setMail(temp);
                                System.out.println("The student's Information has been " +
                                        "updated successfully");
                                System.out.println("The updated information : ");
                                System.out.println(students.get(i).toString());
                            }
                        }
                        if (!found)System.out.println("Student not found");

                    }
                    else if (enter == 4) {
                        boolean found=false;
                        System.out.println("Please, enter the student's id");
                        String id = input.next();
                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).getId().equals( id)) {
                                students.remove(i);
                                found=true;
                                break;
                            }
                        }
                        if (found)System.out.println("The student has been " +
                                "removed successfully");
                        else System.out.println("Student not found");
                    }
                    else  break;


            }
            }
            }catch(Exception e){
                System.out.println("The following error occurred: "+e.getMessage());
                System.out.println("Please, Enter valid data");
                enter=-1;person=-1;
            }
        if (enter>4)continue;
        else if (enter==-1||person==-1)break;

                try{
        if (person==2){
            while (true) {
               Option.operation(person);
                enter = input.nextInt();
                if (enter == 1) {
                    Instructor in1 = new Instructor();
                    String temp;
                    System.out.println("Please, enter Instructor's ID");
                    temp = input.next();
                    in1.setId(temp);
                    System.out.println("Please, enter Instructor's first_name");
                    String first_name = input.next();
                    System.out.println("Please, enter Instructor's last_name");
                    String last_name=input.next();
                    in1.setName(first_name,last_name);
                    System.out.println("Please, enter Instructor's age");
                    int age = input.nextInt();
                    in1.setAge(age);
                    System.out.println("Please, enter Instructor's phone number");
                    temp = input.next();
                    in1.setPhone(temp);
                    System.out.println("Please, enter Instructor's street");
                    String street = input.next();
                    System.out.println("Please, enter Instructor's city");
                    String city=input.next();
                    in1.setAddress(street,city);
                    System.out.println("Date Of Birth:");
                    System.out.println("Please, enter the day");
                    int day=input.nextInt();
                    System.out.println("Please, enter the month");
                    int month=input.nextInt();
                    System.out.println("Please, enter the year");
                    int year=input.nextInt();
                    in1.setDate_of_birth(day,month,year);
                    System.out.println("Please, enter the instructor's mail");
                    temp=input.next();
                    in1.setMail(temp);
                    System.out.println("Please, enter Instructor's salary");
                    double salary = input.nextDouble();
                    in1.setSalary(salary);
                    System.out.println("Please, enter Instructor's department name");
                    temp = input.next();
                    in1.setDepartment(temp);
                    instructors.add(in1);
                    //System.out.println(store2.size());
                    System.out.println("The instructor has been added successfully");
                    System.out.println("The information has been added is :");
                    System.out.println(in1.toString());
                }
                else if (enter == 2) {
                    int type;
                    Option.optionsShow(person);
                    type = input.nextInt();
                    if (type == 1) {
                        boolean found=false;
                        System.out.println("Please, enter the instructor's id");
                        String id = input.next();
                        for (int i = 0; i < instructors.size(); i++) {
                            if (instructors.get(i).getId().equals( id)) {
                                instructors.get(i).getInformation();
                                found=true;
                                break;
                            }
                        }
                        if (!found)System.out.println("The instructor not found");
                    } else {
                        for (int i = 0; i < instructors.size(); i++) {
                            Instructor in1 = new Instructor();
                            in1 = instructors.get(i);
                            in1.getInformation();
                        }
                    }
                } else if (enter == 3) {
                    System.out.println("Please, enter the instructor's id");
                    int id = input.nextInt();
                    boolean found = false;
                    for (int i = 0; i < instructors.size(); i++) {
                        if (instructors.get(i).getId().equals( id)) {
                            found = true;
                            String temp;
                            System.out.println("Please, enter instructor's new" +
                                    " first name");
                            String first_name=input.next();
                            System.out.println("Please, enter instructor's new" +
                                    " last name");
                            String last_name = input.next();
                            instructors.get(i).setName(first_name,last_name);
                            System.out.println("Please, enter instructor's new age");
                            int age = input.nextInt();
                            instructors.get(i).setAge(age);
                            System.out.println("Please, enter instructor's" +
                                    " new phone number");
                            temp = input.next();
                            instructors.get(i).setPhone(temp);
                            System.out.println("Please, enter instructor's new street");
                            String street = input.next();
                            System.out.println("Please, enter instructor's new city");
                            String city=input.next();
                            instructors.get(i).setAddress(street,city);
                            System.out.println("Date Of Birth:");
                            System.out.println("Please, enter the day");
                            int day=input.nextInt();
                            System.out.println("Please, enter the month");
                            int month=input.nextInt();
                            System.out.println("Please, enter the year");
                            int year=input.nextInt();
                            instructors.get(i).setDate_of_birth(day,month,year);
                            System.out.println("Please, enter the instructor's new mail");
                            temp=input.next();
                            instructors.get(i).setMail(temp);
                            System.out.println("Please, enter instructor's new salary");
                            double salary = input.nextDouble();
                            instructors.get(i).setSalary(salary);
                            System.out.println("Please, enter instructor's new" +
                                    " department name");
                            temp = input.next();
                            instructors.get(i).setDepartment(temp);
                            System.out.println("The instructor's Information has been " +
                                    "updated successfully");
                            System.out.println("The updated information");
                            System.out.println(instructors.get(i).toString());

                        }
                    }
                } else if (enter == 4) {
                    boolean found=false;
                    System.out.println("Please, enter the instructor's id");
                    String id = input.next();
                    for (int i = 0; i < instructors.size(); i++) {
                        if (instructors.get(i).getId().equals( id)) {
                            instructors.remove(i);
                            found=true;
                            break;
                        }
                    }
                    if (found)System.out.println("The instructor has been " +
                            "removed successfully");
                    else System.out.println("The instructor not found");
                }
                else break;
            }
        }
                }catch(Exception e){
                    System.out.println("The following error occurred: "+e.getMessage());
                    System.out.println("Please, Enter valid data");
                    enter=-1;person=-1;
                }
        if (enter>4)continue;
        else if (enter==-1||person==-1)break;

                try{
        if (person == 3) {
            while (true) {

                Option.operation(person);
                enter = input.nextInt();
                if (enter == 1) {
                    Administrator ad = new Administrator();
                    String temp;
                    System.out.println("Please, enter administrator's ID");
                    temp = input.next();
                    ad.setId(temp);
                    System.out.println("Please, enter administrator's first name");
                    String first_name = input.next();
                    System.out.println("Please, enter administrator's last name");
                    String last_name=input.next();
                    ad.setName(first_name,last_name);
                    System.out.println("Please, enter administrator's age");
                    int age = input.nextInt();
                    ad.setAge(age);
                    System.out.println("Please, enter administrator's phone number");
                    temp = input.next();
                    ad.setPhone(temp);
                    System.out.println("Please, enter administrator's street");
                    String street = input.next();
                    System.out.println("Please, enter administrator's city");
                    String city= input.next();
                    ad.setAddress(street,city);
                    System.out.println("Date Of Birth:");
                    System.out.println("Please, enter the day");
                    int day=input.nextInt();
                    System.out.println("Please, enter the month");
                    int month=input.nextInt();
                    System.out.println("Please, enter the year");
                    int year=input.nextInt();
                    ad.setDate_of_birth(day,month,year);
                    System.out.println("Please, enter the administrator's mail");
                    temp=input.next();
                    ad.setMail(temp);
                    System.out.println("Please, enter the administrator's salary");
                    double salary=input.nextDouble();
                    ad.setSalary(salary);
                    System.out.println("Please, enter administrator's responsibility");
                    temp=input.next();
                    ad.setResponsibility(temp);
                    System.out.println("Please, enter administrator's role");
                    temp=input.next();
                    ad.setRole(temp);
                    administrators.add(ad);
                    // System.out.println(store1.size());
                    System.out.println("The administrator has been added successfully");
                    System.out.println("The information has been added is :");
                    System.out.println(ad.toString());
                }
                else if (enter == 2) {
                    int type;
                    Option.optionsShow(person);
                    type = input.nextInt();
                    if (type == 1) {
                        boolean found=false;
                        System.out.println("Please, enter the administrator's id");
                        String id = input.next();
                        for (int i = 0; i < administrators.size(); i++) {
                            if (administrators.get(i).getId().equals( id)) {
                                administrators.get(i).getInformation();
                                found=true;
                                break;
                            }
                        }
                        if (!found)System.out.println("The administrator not found");
                    } else {
                        for (int i = 0; i < administrators.size(); i++) {
                            Administrator ad = new Administrator();
                            ad = administrators.get(i);
                            ad.getInformation();
                            System.out.println();
                        }
                    }
                }
                else if (enter == 3) {
                    System.out.println("Please, enter the administrator's id");
                    String id = input.next();
                    boolean found = false;
                    for (int i = 0; i < administrators.size(); i++) {
                        if (administrators.get(i).getId().equals( id)) {
                            found = true;
                            String temp;
                            System.out.println("Please, enter administrator's new" +
                                    " first name");
                            String first_name = input.next();
                            System.out.println("Please, enter administrator's new" +
                                    " last name");
                            String last_name= input.next();
                            administrators.get(i).setName(first_name,last_name);
                            System.out.println("Please, enter administrator's new age");
                            int age = input.nextInt();
                            administrators.get(i).setAge(age);
                            System.out.println("Please, enter administrator's new" +
                                    " phone number");
                            temp = input.next();
                            administrators.get(i).setPhone(temp);
                            System.out.println("Please, enter administrator's" +
                                    " new street");
                            String street = input.next();
                            System.out.println("Please, enter administrator's" +
                                    " new city");
                            String city=input.next();
                            administrators.get(i).setAddress(street,city);
                            System.out.println("Date Of Birth:");
                            System.out.println("Please, enter the day");
                            int day=input.nextInt();
                            System.out.println("Please, enter the month");
                            int month=input.nextInt();
                            System.out.println("Please, enter the year");
                            int year=input.nextInt();
                            administrators.get(i).setDate_of_birth(day,month,year);
                            System.out.println("Please, enter the administrator's mail");
                            temp=input.next();
                            administrators.get(i).setMail(temp);
                            System.out.println("Please, enter the administrator's new salary");
                            double salary=input.nextDouble();
                            administrators.get(i).setSalary(salary);
                            System.out.println("Please, enter administrator's" +
                                    " new responsibility");
                            temp=input.next();
                            administrators.get(i).setResponsibility(temp);
                            System.out.println("Please, enter administrator's" +
                                    " new role");
                            temp=input.next();
                            administrators.get(i).setRole(temp);
                            System.out.println("The administrator's Information has been " +
                                    "updated successfully");
                            System.out.println("The updated information is:");
                            System.out.println(administrators.get(i).toString());
                        }
                    }
                    if (!found)System.out.println("Administrator not found");
                }
                else if (enter == 4) {
                    boolean found=false;
                    System.out.println("Please, enter the administrator's id");
                    String id = input.next();
                    for (int i = 0; i < administrators.size(); i++) {
                        if (administrators.get(i).getId().equals( id)) {
                            administrators.remove(i);
                            found=true;
                            break;
                        }
                    }
                    if (found)System.out.println("The administrator has been " +
                            "removed successfully");
                    else System.out.println("The administrator not found");
                }
                else  break;
                    }
                }
                }catch(Exception e){
                    System.out.println("The following error occurred: "+e.getMessage());
                    System.out.println("Please, Enter valid data");
                    enter=-1;person=-1;
                }
                if (enter>4)continue;
                else if (enter==-1||person==-1)break;

                try{
                if (person == 4) {
                    while (true) {

                        Option.operation(person);
                        enter = input.nextInt();
                        if (enter == 1) {
                            Worker wo = new Worker();
                            String temp;
                            System.out.println("Please, enter worker's ID");
                            temp = input.next();
                            wo.setId(temp);
                            System.out.println("Please, enter worker's first name");
                            String first_name = input.next();
                            System.out.println("Please, enter worker's last name");
                            String last_name=input.next();
                            wo.setName(first_name,last_name);
                            System.out.println("Please, enter worker's age");
                            int age = input.nextInt();
                            wo.setAge(age);
                            System.out.println("Please, enter worker's phone number");
                            temp = input.next();
                            wo.setPhone(temp);
                            System.out.println("Please, enter worker's street");
                            String street = input.next();
                            System.out.println("Please, enter worker's city");
                            String city= input.next();
                            wo.setAddress(street,city);
                            System.out.println("Date Of Birth:");
                            System.out.println("Please, enter the day");
                            int day=input.nextInt();
                            System.out.println("Please, enter the month");
                            int month=input.nextInt();
                            System.out.println("Please, enter the year");
                            int year=input.nextInt();
                            wo.setDate_of_birth(day,month,year);
                            System.out.println("Please, enter the worker's mail");
                            temp=input.next();
                            wo.setMail(temp);
                            System.out.println("Please, enter the worker's salary");
                            double salary=input.nextDouble();
                            wo.setSalary(salary);
                            System.out.println("Please, enter the worker's bonus");
                            double bonus=input.nextDouble();
                            wo.setBonus(bonus);
                            System.out.println("Please, enter the worker's deduction");
                            double deduction=input.nextDouble();
                            wo.setDeduction(deduction);
                            System.out.println("Please, enter worker's responsibility");
                            temp=input.next();
                            wo.setResponsibility(temp);
                            System.out.println("Please, enter worker's role");
                            temp=input.next();
                            wo.setRole(temp);
                            workers.add(wo);
                            System.out.println("The worker has been added successfully");
                            System.out.println("The information has been added is:");
                            System.out.println(wo.toString());
                        }
                        else if (enter == 2) {
                            int type;
                            Option.optionsShow(person);
                            type = input.nextInt();
                            if (type == 1) {
                                boolean found=false;
                                System.out.println("Please, enter the worker's id");
                                String id = input.next();
                                for (int i = 0; i < workers.size(); i++) {
                                    if (workers.get(i).getId().equals( id)) {
                                        workers.get(i).getInformation();
                                        found=true;
                                        break;
                                    }
                                }
                                if (!found)System.out.println("The worker not found");
                            } else {
                                for (int i = 0; i < workers.size(); i++) {
                                    Worker s1 = new Worker();
                                    s1 = workers.get(i);
                                    s1.getInformation();
                                    System.out.println();
                                }
                            }
                        }
                        else if (enter == 3) {
                            System.out.println("Please, enter the worker's ID");
                            String id = input.next();
                            boolean found = false;
                            for (int i = 0; i < workers.size(); i++) {
                                if (workers.get(i).getId().equals( id)) {
                                    found = true;
                                    String temp;
                                    System.out.println("Please, enter worker's new" +
                                            " first name");
                                    String first_name = input.next();
                                    System.out.println("Please, enter worker's new" +
                                            " last name");
                                    String last_name= input.next();
                                    workers.get(i).setName(first_name,last_name);
                                    System.out.println("Please, enter worker's new age");
                                    int age = input.nextInt();
                                    workers.get(i).setAge(age);
                                    System.out.println("Please, enter worker's new" +
                                            " phone number");
                                    temp = input.next();
                                    workers.get(i).setPhone(temp);
                                    System.out.println("Please, enter worker's" +
                                            " new street");
                                    String street = input.next();
                                    System.out.println("Please, enter worker's" +
                                            " new city");
                                    String city=input.next();
                                    workers.get(i).setAddress(street,city);
                                    System.out.println("Date Of Birth:");
                                    System.out.println("Please, enter the day");
                                    int day=input.nextInt();
                                    System.out.println("Please, enter the month");
                                    int month=input.nextInt();
                                    System.out.println("Please, enter the year");
                                    int year=input.nextInt();
                                    workers.get(i).setDate_of_birth(day,month,year);
                                    System.out.println("Please, enter the worker's mail");
                                    temp=input.next();
                                    workers.get(i).setMail(temp);
                                    System.out.println("Please, enter the worker's " +
                                            "new salary");
                                    double salary=input.nextDouble();
                                    workers.get(i).setSalary(salary);
                                    System.out.println("Please, enter the worker's" +
                                            " new bonus");
                                    double bonus=input.nextDouble();
                                    workers.get(i).setBonus(bonus);
                                    System.out.println("Please, enter the worker's " +
                                            "new deduction");
                                    double deduction=input.nextDouble();
                                    workers.get(i).setDeduction(deduction);
                                    System.out.println("Please, enter worker's" +
                                            " new responsibility");
                                    temp=input.next();
                                    workers.get(i).setResponsibility(temp);
                                    System.out.println("Please, enter worker's" +
                                            " new role");
                                    temp=input.next();
                                    workers.get(i).setRole(temp);
                                    System.out.println("The worker's Information has been " +
                                            "updated successfully");
                                    System.out.println("The updated information is:");
                                    System.out.println(workers.get(i).toString());
                                }
                            }
                            if (!found)System.out.println("Worker not found");
                        }
                        else if (enter == 4) {
                            boolean found=false;
                            System.out.println("Please, enter the worker's id");
                            String id = input.next();
                            for (int i = 0; i < workers.size(); i++) {
                                if (workers.get(i).getId().equals( id)) {
                                    workers.remove(i);
                                    found=true;
                                    break;
                                }
                            }
                            if (found)System.out.println("The worker has been " +
                                    "removed successfully");
                            else System.out.println("The worker not found");
                        }
                        else  break;
                    }
                } }catch(Exception e){
                    System.out.println("The following error occurred: "+e.getMessage());
                    System.out.println("Please, Enter valid data");
                    enter=5;
                }
                if (enter>4)continue;
                else if (enter==-1||person==-1)break;

                try{
                if (person == 5) {
                    while (true) {

                        Option.operation(person);
                        enter = input.nextInt();
                        if (enter == 1) {
                            Technician te = new Technician();
                            String temp;
                            System.out.println("Please, enter technician's ID");
                            temp = input.next();
                            te.setId(temp);
                            System.out.println("Please, enter technician's first name");
                            String first_name = input.next();
                            System.out.println("Please, enter technician's last name");
                            String last_name=input.next();
                            te.setName(first_name,last_name);
                            System.out.println("Please, enter technician's age");
                            int age = input.nextInt();
                            te.setAge(age);
                            System.out.println("Please, enter technician's phone number");
                            temp = input.next();
                            te.setPhone(temp);
                            System.out.println("Please, enter technician's street");
                            String street = input.next();
                            System.out.println("Please, enter technician's city");
                            String city= input.next();
                            te.setAddress(street,city);
                            System.out.println("Date Of Birth:");
                            System.out.println("Please, enter the day");
                            int day=input.nextInt();
                            System.out.println("Please, enter the month");
                            int month=input.nextInt();
                            System.out.println("Please, enter the year");
                            int year=input.nextInt();
                            te.setDate_of_birth(day,month,year);
                            System.out.println("Please, enter the technician's mail");
                            temp=input.next();
                            te.setMail(temp);
                            System.out.println("Please, enter the technician's salary");
                            double salary=input.nextDouble();
                            te.setSalary(salary);
                            System.out.println("Please, enter the technician's bonus");
                            double bonus=input.nextDouble();
                            te.setBonus(bonus);
                            System.out.println("Please, enter the technician's deduction");
                            double deduction=input.nextDouble();
                            te.setDeduction(deduction);
                            System.out.println("Please, enter technician's responsibility");
                            temp=input.next();
                            te.setResponsibility(temp);
                            System.out.println("Please, enter technician's role");
                            temp=input.next();
                            te.setRole(temp);
                            technicians.add(te);
                            System.out.println("The technician has been added successfully");
                            System.out.println("The information has been added is:");
                            System.out.println(te.toString());
                        }
                        else if (enter == 2) {
                            int type;
                            Option.optionsShow(person);
                            type = input.nextInt();
                            if (type == 1) {
                                boolean found=false;
                                System.out.println("Please, enter the technician's ID");
                                String id = input.next();
                                for (int i = 0; i < technicians.size(); i++) {
                                    if (technicians.get(i).getId().equals( id)) {
                                        technicians.get(i).getInformation();
                                        found=true;
                                        break;
                                    }
                                }
                                if (!found)System.out.println("The technician not found");
                            } else {
                                for (int i = 0; i < technicians.size(); i++) {
                                    Technician s1 = new Technician();
                                    s1 = technicians.get(i);
                                    s1.getInformation();
                                    System.out.println();
                                }
                            }
                        }
                        else if (enter == 3) {
                            System.out.println("Please, enter the technician's id");
                            String id = input.next();
                            boolean found = false;
                            for (int i = 0; i < technicians.size(); i++) {
                                if (technicians.get(i).getId().equals( id)) {
                                    found = true;
                                    String temp;
                                    System.out.println("Please, enter technician's new" +
                                            " first name");
                                    String first_name = input.next();
                                    System.out.println("Please, enter technician's new" +
                                            " last name");
                                    String last_name= input.next();
                                    technicians.get(i).setName(first_name,last_name);
                                    System.out.println("Please, enter technician's new age");
                                    int age = input.nextInt();
                                    technicians.get(i).setAge(age);
                                    System.out.println("Please, enter technician's new" +
                                            " phone number");
                                    temp = input.next();
                                    technicians.get(i).setPhone(temp);
                                    System.out.println("Please, enter technician's" +
                                            " new street");
                                    String street = input.next();
                                    System.out.println("Please, enter technician's" +
                                            " new city");
                                    String city=input.next();
                                    technicians.get(i).setAddress(street,city);
                                    System.out.println("Date Of Birth:");
                                    System.out.println("Please, enter the day");
                                    int day=input.nextInt();
                                    System.out.println("Please, enter the month");
                                    int month=input.nextInt();
                                    System.out.println("Please, enter the year");
                                    int year=input.nextInt();
                                    technicians.get(i).setDate_of_birth(day,month,year);
                                    System.out.println("Please, enter the technician's mail");
                                    temp=input.next();
                                    technicians.get(i).setMail(temp);
                                    System.out.println("Please, enter the technician's" +
                                            " new salary");
                                    double salary=input.nextDouble();
                                    technicians.get(i).setSalary(salary);
                                    System.out.println("Please, enter the technician's" +
                                            " new bonus");
                                    double bonus=input.nextDouble();
                                    technicians.get(i).setBonus(bonus);
                                    System.out.println("Please, enter the technician's" +
                                            " new deduction");
                                    double deduction=input.nextDouble();
                                    technicians.get(i).setDeduction(deduction);
                                    System.out.println("Please, enter technician's" +
                                            " new responsibility");
                                    temp=input.next();
                                    technicians.get(i).setResponsibility(temp);
                                    System.out.println("Please, enter technician's" +
                                            " new role");
                                    temp=input.next();
                                    technicians.get(i).setRole(temp);
                                    System.out.println("The technician's Information" +
                                            " has been updated successfully");
                                    System.out.println("The updated information is:");
                                    System.out.println(technicians.get(i).toString());
                                }
                            }
                            if (!found)System.out.println("Technician not found");
                        }
                        else if (enter == 4) {
                            boolean found=false;
                            System.out.println("Please, enter the technician's id");
                            String id = input.next();
                            for (int i = 0; i < technicians.size(); i++) {
                                if (technicians.get(i).getId().equals( id)) {
                                    technicians.remove(i);
                                    found=true;
                                    break;
                                }
                            }
                            if (found)System.out.println("The technician has been " +
                                    "removed successfully");
                            else System.out.println("The technician not found");
                        }
                        else  break;
                    }
                }
                }catch(Exception e){
                    System.out.println("The following error occurred: "+e.getMessage());
                    System.out.println("Please, Enter valid data");
                    enter=-1;person=-1;
                }
                if (enter>4)continue;
                else if (enter==-1||person==-1)break;

            }

    }

}
