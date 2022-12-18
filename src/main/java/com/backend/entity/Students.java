package com.backend.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
public class Students {

    @Column(name = "mobile_number", nullable = false, unique = true)
    private String mobile_number;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

//    @Column(name = "department")
//    private String department;

  //  @OneToMany(fetch = FetchType.EAGER,mappedBy="student",cascade = CascadeType.ALL)
//  @ManyToOne
//  @JoinColumn(name = "student_department_id")
//  private StudentDepartment studentDepartment;

    @Column(name = "name")
    private String name;

//    @Column(name = "course")
//    private String course;

    @Column(name = "student_email", nullable = false, unique = true)
    private String studentEmail;

    @Column(name = "entrollment_number", nullable = false, unique = true)
    private String entrollmentNumber;

//    public StudentDepartment getStudentDepartment() {
//        return studentDepartment;
//    }
//
//    public void setStudentDepartment(StudentDepartment studentDepartment) {
//        this.studentDepartment = studentDepartment;
//    }

//    public Set<StudentDepartment> getStudentDepartment() {
//        return studentDepartment;
//    }
//
//    public void setStudentDepartment(Set<StudentDepartment> studentDepartment) {
//        this.studentDepartment = studentDepartment;
//    }

    public String getEntrollmentNumber() {
        return entrollmentNumber;
    }

    public void setEntrollmentNumber(String entrollmentNumber) {
        this.entrollmentNumber = entrollmentNumber;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
