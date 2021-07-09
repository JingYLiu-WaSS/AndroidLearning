package com.thoughtworks.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        View button1 = findViewById(R.id.constrain_layout);
        button1.setOnClickListener(
                button -> {
                    Intent constraintActivityIntent = new Intent(this, ConstraintActivity.class);
                    startActivity(constraintActivityIntent);
                }
        );
    }
}