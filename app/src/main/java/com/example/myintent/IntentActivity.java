package com.example.myintent;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class IntentActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle saveIntanceState){
        Bundle savedInstanceState = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
    }

}
