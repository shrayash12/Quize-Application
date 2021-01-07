package com.example.quizapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.quizapplication.R;
import com.example.quizapplication.viewmodel.UserViewModel;

public class LogInActivity extends AppCompatActivity {
    EditText logInEmail;
    EditText logInPassword;
    Button btn_Login;
    TextView new_User;
    Button btn_RegisterInLogIn;
    ViewModelProvider.AndroidViewModelFactory userViewModel;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logInEmail = findViewById(R.id.logIn_email_id);
        logInPassword = findViewById(R.id.logIn_password);
        btn_Login = findViewById(R.id.btn_login);
        btn_RegisterInLogIn = findViewById(R.id.btn_RegisterInLogIn);

    }
}
