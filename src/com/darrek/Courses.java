package com.darrek;

import java.util.*;

public class Courses {

    String courseName;
    String professorName;
    int year;
    ArrayList<Student> enrollmentList;
    double avgGrade;

    public Courses(String courseName, String professorName, int year, ArrayList<Student> enrollmentList) {
        super();
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrollmentList = enrollmentList;
    }

    public void enroll(Student student) {

        this.enrollmentList.add(student);
        System.out.println(student.firstName + " " + student.lastName + " has enrolled.");
    }

    public void enroll(Student[] students) {
        this.enrollmentList.addAll(enrollmentList);
    }

    public void unEnroll(Student student) {

        this.enrollmentList.remove(student);
        System.out.println(student.firstName + " " + student.lastName + " has been removed.");
    }

    public int countStudents() {

        int classSize = this.enrollmentList.size();
        System.out.println("The size of the class is " + classSize);
        return classSize;
    }

    public int bestGrade() {

        int bestGrade = 0;
        for (Student student : this.enrollmentList) {
            if (student.grade > bestGrade) {
                bestGrade = student.grade;
            }
        }
        System.out.println("The best grade is " + bestGrade);
        return bestGrade;
    }

    public double averageGrade() {

        double totalGrade = 0;
        for (Student student : enrollmentList) {
            totalGrade += student.grade;
        }

        double avgGrade = totalGrade / enrollmentList.size();
        System.out.println("The average grade for the course is " + avgGrade);
        return avgGrade;
    }


    public void ranking() {

        List<Student> rank = new ArrayList(enrollmentList);
        rank.sort(Comparator.comparing(Student::returnGrade).reversed());

        int order = 1;
        for (Student student: rank) {
            System.out.println("Ranking " + order + " - "+ student.firstName + " " + student.lastName + " with a grade of " + student.grade + ".");
            order++;
        }
    }

    public void checkingAvg(Student student){

        if (student.grade > averageGrade()) {
            System.out.println(student.firstName + " " + student.lastName + " is above average.");
        } else {
            System.out.println(student.firstName + " " + student.lastName + " is below average.");

        }

    }

}


