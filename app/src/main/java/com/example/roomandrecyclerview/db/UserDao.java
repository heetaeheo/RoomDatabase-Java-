package com.example.roomandrecyclerview.db;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {


    @Query("SELECT * FROM Table_Name")
    List<User> getAllUsers();


    @Insert
    void insertUser(User...users);

    @Delete
    void delete(User user);



}
