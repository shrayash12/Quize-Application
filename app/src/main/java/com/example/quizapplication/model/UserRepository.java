package com.example.quizapplication.model;

import android.app.Application;

import androidx.lifecycle.LiveData;

public class UserRepository {
    public Userdao userdao;

   public UserRepository(Application application) {
        QuizeDataBase db = QuizeDataBase.getDatabase(application);
        userdao = db.userDao();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
     public LiveData<User> login(String emal, String password) {
        return userdao.login(emal, password);
    }


   public void register(final User user) {
        QuizeDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userdao.register(user);
            }
        });
    }

    public void delete() {
        QuizeDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userdao.deleteAll();
            }
        });
    }


}