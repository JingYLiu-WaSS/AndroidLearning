package com.thoughtworks.androidtrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public final String TAG = "MainActivity";
    public final String TAG_BUTTON = "ButtonActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        Log.i(TAG_BUTTON, "ButtonActivity created");
    }
}