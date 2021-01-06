package com.example.quizapplication.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Userdao {


    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void register(User user);

    @Query("DELETE FROM user_table")
    void deleteAll();

    @Query("SELECT * FROM User_Table WHERE email LIKE :email AND " +
            "password LIKE :password LIMIT 1")

     LiveData<User> login(String email, String password);

}
