package com.darrek;

import java.util.ArrayList;

public class Main{


    public static void main(String[] args) {
        Student student1 = new Student("Tom", "Tommy", 2018, 20, 2020);
        Student student2 = new Student("Peter", "Pete", 2019, 30, 2021);
        Student student3 = new Student("Mary", "April", 2017, 10, 2021);
        Student student4 = new Student("Mary", "April", 2017, 80, 2021);
        student1.printFullName();
        student1.changeYearIfApproved();
        Courses java = new Courses("Learn Java", "Darrek", 2021, new ArrayList<Student>());
//      Student[] newArray = new Student[3];
//      newArray[0] = student1;
//      newArray[1] = student2;
//      newArray[2] = student3;
        java.enroll(student1);
        java.enroll(student2);
        java.enroll(student3);
        java.enroll(student4);
        java.bestGrade();
        java.countStudents();
        java.averageGrade();
        java.ranking();
        java.checkingAvg(student3);

    }
}
