package com.example.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckedTextView;

public class SeatPicker extends AppCompatActivity {
    CheckedTextView I1, II1, III1, IV1, I2, II2, III2, IV2, I3, II3, III3, IV3;
    CheckedTextView I4, II4, III4, IV4, I5, II5, III5, IV5, I6, II6, III6, IV6;
    CheckedTextView I7, II7, III7, IV7, I8, II8, III8, IV8, I9, II9, III9, IV9;
    
    String[] seats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_picker);

        I1 = findViewById(R.id.I1);
        II1 = findViewById(R.id.II1);
        III1 = findViewById(R.id.III1);
        IV1 = findViewById(R.id.IV1);

        I2 = findViewById(R.id.I2);
        II2 = findViewById(R.id.II2);
        III2 = findViewById(R.id.III2);
        IV2 = findViewById(R.id.IV2);

        I3 = findViewById(R.id.I3);
        II3 = findViewById(R.id.II3);
        III3 = findViewById(R.id.III3);
        IV3 = findViewById(R.id.IV3);

        I4 = findViewById(R.id.I4);
        II4 = findViewById(R.id.II4);
        III4 = findViewById(R.id.III4);
        IV4 = findViewById(R.id.IV4);

        I5 = findViewById(R.id.I5);
        II5 = findViewById(R.id.II5);
        III5 = findViewById(R.id.III5);
        IV5 = findViewById(R.id.IV5);

        I6 = findViewById(R.id.I6);
        II6 = findViewById(R.id.II6);
        III6 = findViewById(R.id.III6);
        IV6 = findViewById(R.id.IV6);

        I7 = findViewById(R.id.I7);
        II7 = findViewById(R.id.II7);
        III7 = findViewById(R.id.III7);
        IV7 = findViewById(R.id.IV7);

        I8 = findViewById(R.id.I8);
        II8 = findViewById(R.id.II8);
        III8 = findViewById(R.id.III8);
        IV8 = findViewById(R.id.IV8);

        I9 = findViewById(R.id.I9);
        II9 = findViewById(R.id.II9);
        III9 = findViewById(R.id.III9);
        IV9 = findViewById(R.id.IV9);


        I1.setOnClickListener(view -> {
            I1.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        II1.setOnClickListener(view -> {
            II1.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        III1.setOnClickListener(view -> {
            I1.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        IV1.setOnClickListener(view -> {
            I1.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });


        I2.setOnClickListener(view -> {
            I2.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        II2.setOnClickListener(view -> {
            II2.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        III2.setOnClickListener(view -> {
            III2.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        IV2.setOnClickListener(view -> {
            IV2.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });


        I3.setOnClickListener(view -> {
            I3.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        II3.setOnClickListener(view -> {
            II3.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        III3.setOnClickListener(view -> {
            III3.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        IV3.setOnClickListener(view -> {
            IV3.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });


        I4.setOnClickListener(view -> {
            I4.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        II4.setOnClickListener(view -> {
            II4.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        III4.setOnClickListener(view -> {
            III4.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        IV4.setOnClickListener(view -> {
            IV4.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });


        I5.setOnClickListener(view -> {
            I5.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        II5.setOnClickListener(view -> {
            II5.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        III5.setOnClickListener(view -> {
            III5.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        IV5.setOnClickListener(view -> {
            IV5.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });


        I6.setOnClickListener(view -> {
            I6.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        II6.setOnClickListener(view -> {
            II6.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        III6.setOnClickListener(view -> {
            III6.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        IV6.setOnClickListener(view -> {
            IV6.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });


        I7.setOnClickListener(view -> {
            I7.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        II7.setOnClickListener(view -> {
            II7.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        III7.setOnClickListener(view -> {
            III7.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        IV7.setOnClickListener(view -> {
            IV7.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });


        I8.setOnClickListener(view -> {
            I8.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        II8.setOnClickListener(view -> {
            II8.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        III8.setOnClickListener(view -> {
            III8.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        IV8.setOnClickListener(view -> {
            IV8.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });


        I9.setOnClickListener(view -> {
            I9.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        II9.setOnClickListener(view -> {
            II9.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        III9.setOnClickListener(view -> {
            III9.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
        IV9.setOnClickListener(view -> {
            IV9.setBackgroundColor(getResources().getColor(R.color.purple_500));
        });
    }

}