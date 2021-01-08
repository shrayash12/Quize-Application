package com.example.quizapplication.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.quizapplication.model.User;
import com.example.quizapplication.model.UserRepository;

import java.util.List;

public class UserViewModel extends AndroidViewModel {
  private   UserRepository userRepository;
  LiveData<User> userLiveData;

    public UserViewModel(@NonNull Application application) {
        super(application);
    }
    LiveData<User> getAllDetails(String email, String password){
       return   userRepository.login(email,password);
    }
    public void finalRegester(User user){
        userRepository.register(user);
    }
    public void delete(){
        userRepository.delete();
    }


}