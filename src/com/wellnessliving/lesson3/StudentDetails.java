package com.wellnessliving.lesson3;

public class StudentDetails {
    private String studentName;
    private String school;
    private String subject;
    private double score;

    public StudentDetails(String studentName, String school, String subject, double score) {
        this.studentName = studentName;
        this.school = school;
        this.subject = subject;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSchool() {
        return school;
    }

    public String getSubject() {
        return subject;
    }

    public double getScore() {
        return score;
    }
}
