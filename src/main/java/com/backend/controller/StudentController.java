package com.backend.controller;


import com.backend.entity.StudentDepartment;
import com.backend.entity.Students;
import com.backend.pojo.Student;
import com.backend.repo.StudentDepartmentRepo;
import com.backend.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private StudentDepartmentRepo studentDepartmentRepo;
    @PostMapping("postStudent")
    public Students postStudent(@RequestBody Student student){
        Students students=new Students();
        students.setName(student.getName());
        students.setStudentEmail(student.getStudentEmail());
        students.setEntrollmentNumber(student.getEntrollmentNumber());
        students.setMobile_number(student.getMobile_number());
       Students se= studentRepo.save(students);
        StudentDepartment studentDepartment=new StudentDepartment();
        studentDepartment.setStudent(se);
        studentDepartment.setDepartment(student.getDepartment());
        studentDepartment.setCourse(student.getCourse());
        StudentDepartment st = studentDepartmentRepo.save(studentDepartment);
        return se;
    }

    @GetMapping("getStudentAll")
    public List<Student> getAllStudent(){
//        List<Students> studentsList = studentRepo.findAll();
    List<StudentDepartment> studentDepartmentList = studentDepartmentRepo.findAll();
        List<Student> studentList= new ArrayList<>();
        studentDepartmentList.forEach(a-> {
            Student s = new Student();
            s.setStudentEmail(a.getStudent().getStudentEmail());
            s.setName(a.getStudent().getName());
            s.setCourse(a.getCourse());
            s.setDepartment(a.getDepartment());
            s.setEntrollmentNumber(a.getStudent().getEntrollmentNumber());
            s.setName(a.getStudent().getName());
            s.setId(a.getStudent().getId());
            s.setMobile_number(a.getStudent().getMobile_number());
            studentList.add(s);
        });
        return studentList;
    }
//
//    @GetMapping("getStudent/{email}")
//    public Boolean getStudent(@PathVariable String email){
//        Students student;
//        student = studentRepo.findByStudentEmail(email);
//        if(student!= null && email.equalsIgnoreCase(student.getStudentEmail())){
//            return true;
//        }else {
//            return false;
//        }
//    }
    @PatchMapping("updateStudent")
    public int updatestd(@RequestBody Student student){

        List<StudentDepartment> studentDepartmentList = studentDepartmentRepo.findAll();
        studentDepartmentList.forEach(a->{
            if(student.getStudentEmail().equalsIgnoreCase(a.getStudent().getStudentEmail())){
               studentDepartmentRepo.updateCourseAndDepartmentById(student.getCourse(),student.getDepartment(),a.getId());
            }
        });
        return studentRepo.updateStudentEmailByMobile_number(student.getMobile_number(),student.getStudentEmail());
    }

    @DeleteMapping("delete/{email}")
    public int deleteStudent(@PathVariable String email){
        List<StudentDepartment> studentDepartmentList = studentDepartmentRepo.findAll();

        studentDepartmentList.forEach(a->{
            if(email.equalsIgnoreCase(a.getStudent().getStudentEmail())){
                studentDepartmentRepo.deleteById(a.getId());
            }
        });
        return studentRepo.deleteByStudentEmail(email);
    }
}
