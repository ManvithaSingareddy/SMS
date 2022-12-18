package com.backend.repo;

import com.backend.entity.StudentDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface StudentDepartmentRepo extends JpaRepository<StudentDepartment, Long> {
    @Transactional
    @Modifying
    @Query("update StudentDepartment s set s.course = ?1, s.department = ?2 where s.id = ?3")
    int updateCourseAndDepartmentById(String course, String department, Long id);


    @Override
    void deleteById(Long aLong);
}
