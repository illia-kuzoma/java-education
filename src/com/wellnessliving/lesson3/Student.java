package com.wellnessliving.lesson3;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Grade> grades;
    private String school;
    private Address address;

    public Student(String name, int age, List<Grade> grades, String school, Address address) {
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.school = school;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public String getSchool() {
        return school;
    }

    public Address getAddress() {
        return address;
    }
}
