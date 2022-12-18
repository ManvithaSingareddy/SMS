package com.backend.repo;

import com.backend.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface StudentRepo extends JpaRepository<Students, Long> {
    @Transactional
    @Modifying
    @Query("update Students s set s.mobile_number = ?1 where s.studentEmail = ?2")
    int updateStudentEmailByMobile_number(String mobile_number,String studentEmail);

    @Query("select s from Students s where s.studentEmail = ?1")
    Students findByStudentEmail(String studentEmail);

//    @Transactional
//    @Modifying
//    @Query("update Students s set s.course = ?1 where s.studentEmail = ?2")
//    int updateCourseByStudentEmail(String course, String studentEmail);

    @Transactional
    @Modifying
    @Query("delete from Students s where s.studentEmail = ?1")
    int deleteByStudentEmail(String studentEmail);

//    @Transactional
//    @Modifying
//    @Query("update Students s set s.course = ?1, s.department = ?2, s.mobile_number = ?3 where s.studentEmail = ?4")
//    int updateCourseAndDepartmentAndMobile_numberByStudentEmail(String course, String department, String mobile_number, String studentEmail);

}
