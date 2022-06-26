package com.example.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class ScheduleList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_list);
        ImageButton btnBack = findViewById(R.id.backSchedule);

        btnBack.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

        Button btnDetail = findViewById(R.id.btnDetail);
        btnDetail.setOnClickListener(v -> {
            startActivity(new Intent(this, BusDetail.class));

        });
    }
}