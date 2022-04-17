package com.practica7.practica7.repository;

import java.time.LocalDate;

import com.practica7.practica7.model.Usuario;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usuario,String>{
    @Query("SELECT * FROM USER WHERE USER.USER_ID = :userId")
    public Iterable <Usuario> getUserById(String userId);

    @Query("UPDATE USER SET USER.USERS_NAME= :usersName WHERE USER.USER_ID = :userId")
    public Usuario updateUserName(String usersName,String userId);

    @Query("UPDATE USER SET USER.USERS_PASSWORD= :usersPassword WHERE USER.USER_ID = :userId")
    public Usuario updateUserPassword(String usersPassword,String userId);

    @Query("INSERT INTO USER (USER.USER_ID, USER.USERS_NAME, USER.USERS_PASSWORD, USER.EMAIL, USER.INITIAL_DATE) VALUES (userId,usersName, usersPassword, email,inicialDate)")
    public void insertUser(String userId,String usersName,String usersPassword,String email,LocalDate inicialDate);

    @Query("DELETE FROM USER WHERE USER.USER_ID = :userId")
    public void deleteUser(String userId);
}
