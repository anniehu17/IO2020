package com.example.recaicle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToCamera(View view) {
        Intent i = new Intent(this, CameraActivity.class);
        startActivity(i);
    }

    public void logOut(View view) {
        Intent i = new Intent(this, LoginScreen.class);
        startActivity(i);
    }
}

