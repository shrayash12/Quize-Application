package com.example.quizapplication.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.quizapplication.model.User;
import com.example.quizapplication.model.UserRepository;

import java.util.List;

public class UserViewModel extends AndroidViewModel {
    public UserRepository userRepository;
    LiveData<User> userLiveData;
    public UserViewModel(@NonNull Application application, Object email, Object password) {
        super(application);

        userRepository = new UserRepository(application);
        userLiveData = userRepository.login(email,password);
    }




    LiveData<User>getUserLiveData() {
        return userLiveData;
    }

    public void register(User user) {
        userRepository.register(user);
    }

    public LiveData<User> login(String email,String password) {
       return userRepository.login(email,password);
    }

    public void delete() {
        userRepository.delete();
    }
}