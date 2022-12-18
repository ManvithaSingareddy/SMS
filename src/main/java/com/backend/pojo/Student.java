package com.backend.pojo;

public class Student {


    private String mobile_number;

    private Long id;

    private String department;

    private String name;

    private String course;

    private String studentEmail;

    private String entrollmentNumber;

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getEntrollmentNumber() {
        return entrollmentNumber;
    }

    public void setEntrollmentNumber(String entrollmentNumber) {
        this.entrollmentNumber = entrollmentNumber;
    }
}
