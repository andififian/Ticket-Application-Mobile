package com.example.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class DatePicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        Button select = findViewById(R.id.select);
        ImageView back = findViewById(R.id.ivBackArrow);

        select.setOnClickListener(v -> {startActivity(new Intent(this, MainActivity.class));
            finish();});
        back.setOnClickListener(v -> {onBackPressed();});
    }
}