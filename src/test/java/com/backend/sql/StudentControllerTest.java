package com.backend.sql;



import com.backend.controller.StudentController;

import com.backend.entity.Students;
import com.backend.pojo.Student;
import com.backend.repo.StudentDepartmentRepo;
import com.backend.repo.StudentRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= StudentControllerTest.class)
public class StudentControllerTest {
    @Mock
    StudentRepo studentRepo;
    @Mock
    private StudentDepartmentRepo studentDepartmentRepo;

    @InjectMocks
    @Spy
    StudentController classUnderTest = new StudentController();

    @BeforeMethod
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void getstudent(){
        List<Student> t  = new ArrayList<>();
        Student e=new Student();
        e.setStudentEmail("dd");
        t.add(e);

        List<Student> d=classUnderTest.getAllStudent();
        assertNotEquals(t,d);
    }

}
