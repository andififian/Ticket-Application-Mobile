package com.example.finalproject4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FinishRegist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_regis);
        Button btnTakeMe = findViewById(R.id.takeMe);

        btnTakeMe.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });



    }
}