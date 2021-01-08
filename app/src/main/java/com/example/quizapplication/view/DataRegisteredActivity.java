package com.example.quizapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.quizapplication.R;
import com.example.quizapplication.model.User;
import com.example.quizapplication.viewmodel.UserViewModel;

import java.util.List;

public class DataRegisteredActivity extends AppCompatActivity {
    UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_registered);

        userViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(UserViewModel.class);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        final UserAdapter userAdapter = new UserAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(DataRegisteredActivity.this));
        recyclerView.setAdapter(userAdapter);

    }
}