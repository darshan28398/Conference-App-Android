package com.example.user.comp3074_assignment_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Speakers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speakers);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
