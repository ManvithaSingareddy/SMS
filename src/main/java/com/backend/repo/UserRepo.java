package com.backend.repo;

import com.backend.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepo extends JpaRepository<UserDetail, Long > {
    UserDetail findByUserName(String userName);

    @Transactional
    @Modifying
    @Query("update UserDetail u set u.password = ?1 where u.userName = ?2")
    int updatePasswordByUserName(String password, String userName);

    long deleteByUserName(String userName);

    UserDetail findByUserNameAndPassword(String userName, String password);

    @Transactional
    @Modifying
    @Query("delete from UserDetail u where u.userId = ?1")
    int deleteByUserId(Long userId);




}
