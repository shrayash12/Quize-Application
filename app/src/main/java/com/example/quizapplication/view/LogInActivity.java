package com.example.quizapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.quizapplication.R;
import com.example.quizapplication.model.User;
import com.example.quizapplication.viewmodel.UserViewModel;

public class LogInActivity extends AppCompatActivity {
    EditText logInEmail;
    EditText logInPassword;
    Button btn_Login;
    TextView new_User;
    Button btn_RegisterInLogIn;
    UserViewModel userViewModel;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);

        logInEmail = findViewById(R.id.logIn_email_id);
        logInPassword = findViewById(R.id.logIn_password);
        btn_Login = findViewById(R.id.btn_login);
        btn_RegisterInLogIn = findViewById(R.id.btn_RegisterInLogIn);

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }

    public boolean isValidLogIn(String email, String password) {


        userViewModel.g

    }
}
