package com.example.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TicketList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_list);
    }

    public void scheduleList(View view){startActivity(new Intent(TicketList.this, MainActivity.class));}

    public void ticketList(View view){startActivity(new Intent(TicketList.this, TicketList.class));}
}