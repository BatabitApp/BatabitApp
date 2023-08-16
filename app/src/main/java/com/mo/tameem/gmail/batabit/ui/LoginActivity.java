package com.mo.tameem.gmail.batabit.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mo.tameem.gmail.batabit.R;

public class LoginActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.submit).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
    }
}