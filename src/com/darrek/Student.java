package com.darrek;

public class Student {

    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Student(String firstName, String lastName, int registration, int grade, int year){

        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public Student(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Student(int registration, int grade, int year){

        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public Student() {

    }

    public void printFullName(){
        System.out.println(this.firstName + " " + this.lastName);
    }

    public boolean isApproved(){
        return this.grade >= 60;

        //optional method
//        if (this.grade >= 60){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
      }

    public void changeYearIfApproved(){

        if (this.isApproved()){
            this.year++;
            System.out.println("Congratulation " + this.firstName + " " + this.lastName + " of " + this.year);
        }
    }

    public int returnGrade(){
        return grade;
    }


}
