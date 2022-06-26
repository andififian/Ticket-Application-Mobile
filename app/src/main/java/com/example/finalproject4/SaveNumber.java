package com.example.finalproject4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SaveNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_phone);
        Button btnSaveNumber = findViewById(R.id.btnSaveNumber);

        btnSaveNumber.setOnClickListener(v -> {
            startActivity(new Intent(this, FinishRegist.class));
            finish();
        });

    }
}
