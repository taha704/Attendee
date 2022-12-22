package com.example.attendee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class facultyLogin extends AppCompatActivity {
    Button btn_faculty_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_login);

        btn_faculty_login = findViewById(R.id.btn_faculty_login);

        btn_faculty_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(facultyLogin.this,faculty_register.class));
            }
        });
    }

}