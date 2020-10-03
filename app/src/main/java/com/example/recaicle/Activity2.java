package com.example.recaicle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void goToHome(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void goToResults(View view) {
        Intent i = new Intent(this, Activity3.class);
        startActivity(i);
    }
}