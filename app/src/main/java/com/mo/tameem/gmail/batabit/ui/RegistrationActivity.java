package com.mo.tameem.gmail.batabit.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mo.tameem.gmail.batabit.R;

public class RegistrationActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        findViewById(R.id.submit).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
        findViewById(R.id.txt_go_reg).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), LoginActivity.class)));
    }
}