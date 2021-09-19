package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {
    private TextInputLayout name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.username);
        Button begin = findViewById(R.id.signInButton);
        begin.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, go_screen.class));
        });

    }
    private void ifUserExists(){
        String user = name.getEditText().getText().toString().trim();



    }
}