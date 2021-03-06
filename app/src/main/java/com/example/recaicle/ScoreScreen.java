package com.example.recaicle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;



public class ScoreScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int count = 0;
        
        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }
        


        Python py = Python.getInstance();
        
    }

    public void goHome(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void goToLeaderboard(View view) {
        Intent i = new Intent(this,Activity3.class);
        startActivity(i);
    }

    public void goToCamera(View view) {
        Intent i = new Intent(this,CameraActivity.class);
        startActivity(i);
    }
}
