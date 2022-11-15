package com.example.SMS.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.SMS.Entity.Course;
import com.example.SMS.Entity.Student;
import com.example.SMS.repository.CourseRepo;
import com.example.SMS.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="*")
public class Controller {

	@Autowired
	public StudentRepo stuRepo;

	@Autowired
	public CourseRepo couRepo;

	@GetMapping("StudentDetails")
	public List<Course> getStudentDetails() {

		Student student1 = new Student();
		student1.studentId=1;
		student1.studentFirstName="john";
		student1.studentSurName="deo";
		student1.gender="Male";

		Course course1 = new Course();
		course1.courseId=1;
		course1.courseName="Adv Web Engineering";
		course1.student=student1;

		Course course2=new Course();
		course2.courseId=2;
		course2.courseName="Data Mining";
		course2.student=student1;

		List<Course> list=new ArrayList<>();
		list.add(course1);
		list.add(course2);



//		return Stream.of(new Student(1,"john","deo","M"),
//				new Student(2,"sita","singh","F"),
//				new Student(3,"kyle","biden","M")).collect(Collectors.toList());

		return couRepo.saveAll(list);


	}

	@GetMapping("coursedetails/{id}")
	public Course courseDetails(@PathVariable int id){
		return couRepo.findById(id).get();

	}
	

}
