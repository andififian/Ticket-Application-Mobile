package com.example.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DestinationAdapter extends AppCompatActivity {
    public TextView textViewCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination_list);

        textViewCancel = findViewById(R.id.cancels);
        textViewCancel.setOnClickListener(view ->{startActivity(new Intent(DestinationAdapter.this, MainActivity.class));
            finish();} );

    }


}