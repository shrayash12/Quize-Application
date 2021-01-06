package com.example.quizapplication.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class},version = 1,exportSchema = false)
public abstract class QuizeDataBase extends RoomDatabase {
    private static QuizeDataBase quizeDataBase;
    private static final int NUMBER_OF_THREADS = 4;

    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);


    static QuizeDataBase getDatabase(final Context context) {
        synchronized (QuizeDataBase.class) {
            if (quizeDataBase == null) {
                quizeDataBase = Room.databaseBuilder(context.getApplicationContext(),
                        QuizeDataBase.class, "User_database")
                        .build();
            }
        }
        return quizeDataBase;
    }

    public abstract Userdao userDao();
}
