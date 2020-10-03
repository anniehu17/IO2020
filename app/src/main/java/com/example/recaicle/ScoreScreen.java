package com.example.recaicle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScoreScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goHome(View view) {
        Intent i = new Intent(this, *EDIT:HOMESCREEN.class);
        startActivity(i);
    }

    public void goToLeaderboard(View view) {
       Intent i = new Intent(this, *EDIT:LEADERBOARDSCREEN.class);
       startActivity(i);
    }

    public void goToCamera(View view) {
       Intent i = new Intent(this, *EDIT:CAMERASCREEN.class);
       startActivity(i);
    }
}
