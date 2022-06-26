package com.example.finalproject4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText editTextseat, editTextDeparture, editTextArrival, editTextDate;
    public TextView textviewSeekbar;
    public SeekBar seekBar;
    public Button cancel, select;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_detail);

        editTextseat = findViewById(R.id.seatss);
        editTextDeparture = findViewById(R.id.inputdeparture);
        editTextArrival = findViewById(R.id.inputarrival);
        editTextDate = findViewById(R.id.datepick);
        Button searchBus = findViewById(R.id.searchBus);
        searchBus.setOnClickListener(v->{
            startActivity(new Intent(this, ScheduleList.class));
            finish();
        });
        editTextseat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){addPopupSeekbar();}
        });

        editTextDeparture.setOnClickListener(view ->{startActivity(new Intent(MainActivity.this, DestinationAdapter.class));} );
        editTextArrival.setOnClickListener(view ->{startActivity(new Intent(MainActivity.this, DestinationAdapter.class));} );
        editTextDate.setOnClickListener(view ->{startActivity(new Intent(MainActivity.this, DatePicker.class));} );
    }

    private void addPopupSeekbar() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = this.getLayoutInflater();
        View dialogView = layoutInflater.inflate(R.layout.seekerpassengger,null);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


        seekBar = dialogView.findViewById(R.id.seekbarr);
        textviewSeekbar = dialogView.findViewById(R.id.count);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textviewSeekbar.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        cancel = dialogView.findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        select = dialogView.findViewById(R.id.select);

    }






    public void ticketList(View view){startActivity(new Intent(MainActivity.this, MainActivity1.class));
        finish();}

    public void soon(View view){startActivity(new Intent(MainActivity.this, Soon.class));
        finish();}


}