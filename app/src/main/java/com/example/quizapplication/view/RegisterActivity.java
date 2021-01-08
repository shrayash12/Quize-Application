package com.example.quizapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.quizapplication.R;
import com.example.quizapplication.viewmodel.UserViewModel;

public class RegisterActivity extends AppCompatActivity {
    EditText registerName;
    EditText registerEAmail;
    EditText registerPassword;
    EditText registerCity;
    Button btnR_Register;

    UserViewModel userViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);

        registerName = findViewById(R.id.register_name);
        registerEAmail = findViewById(R.id.register_email);
        registerPassword = findViewById(R.id.register_password);
        registerCity = findViewById(R.id.register_city);
        btnR_Register = findViewById(R.id.btnR_register);

        btnR_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegisterActivity.this,LogInActivity.class);
                startActivity(intent);
            }
        });

    }
}
