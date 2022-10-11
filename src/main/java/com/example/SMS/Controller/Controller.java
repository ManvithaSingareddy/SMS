package com.example.SMS.Controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SMS.Entity.Student;

@RestController
@CrossOrigin(origins="*")
public class Controller {

	@GetMapping("StudentDetails")
	public List<Student> getStudentDetails(){
		
		return Stream.of(new Student(1,"john","deo","M"),
				new Student(2,"sita","singh","F"),
				new Student(3,"kyle","biden","M")).collect(Collectors.toList());
		
	}
	

}
