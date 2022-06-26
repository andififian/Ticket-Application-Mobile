package com.example.finalproject4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Soon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soon);


    }
    public void scheduleList(View view){startActivity(new Intent(this, MainActivity.class));
        finish();}

    public void ticketList(View view){startActivity(new Intent(this, MainActivity1.class));
        finish();}

    public void soon(View view){startActivity(new Intent(this, Soon.class));
        finish();}
}
