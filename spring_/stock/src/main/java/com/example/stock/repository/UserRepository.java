package com.example.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.stock.models.User.User;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByLastName(String lastName);

    List<User> findByLastNameContaining(String lastName);

    @Query("SELECT x from User x where x.userName = ?1")
    User findUserByUsername(String name);

    @Query("SELECT x from User x where x.userID = ?1")
    User getUserByID(int i);

    // update query
    @Modifying
    @Transactional // place this in the service layer.
    @Query(value = "update tbl_users set user_name = ?1 where id = ?2", nativeQuery = true)
    int updateUserNameById(String username, int id);

    boolean existsByUserName(String username);

}
