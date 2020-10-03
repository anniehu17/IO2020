package com.example.recaicle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }


        Python py = Python.getInstance();
        
    }

    public void goToCamera(View view) {
        Intent i = new Intent(this, CameraActivity.class);
        startActivity(i);
    }
}

