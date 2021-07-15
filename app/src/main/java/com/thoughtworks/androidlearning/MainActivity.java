package com.thoughtworks.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.constrain_layout);
        button1.setOnClickListener(
                button -> {
                    Intent constraintActivityIntent = new Intent(this, ConstraintActivity.class);
                    startActivity(constraintActivityIntent);
                }
        );

        Button button2 = findViewById(R.id.login_layout);
        button2.setOnClickListener(
                button -> {
                    Intent loginActivityIntent = new Intent(this, LoginActivity.class);
                    startActivity(loginActivityIntent);
                }
        );
    }
}