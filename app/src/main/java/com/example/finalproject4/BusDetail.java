package com.example.finalproject4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicBoolean;

public class BusDetail extends AppCompatActivity {
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_detail);
        activity = this;
        ImageView back = findViewById(R.id.panah);
        Button bookNow = findViewById(R.id.bookNow);
        TextView chooseSeat = findViewById(R.id.chooseSeat);
        Button seePicture = findViewById(R.id.seePicture);

        seePicture.setOnClickListener(v -> {
            popUpPicture();
        });

        back.setOnClickListener(v -> {
            onBackPressed();
        });
        bookNow.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity1.class));
            finish();
        });
        chooseSeat.setOnClickListener(v -> {
            popUpSeat();
        });
    }

    public void popUpPicture() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this, R.style.CustomAlertDialog);
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.see_picture, null);
        dialogBuilder.setView(layout);

        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.show();

        TextView backPicture = layout.findViewById(R.id.backDetailPicture);
        backPicture.setOnClickListener(v -> {
            alertDialog.dismiss();
        });

    }
    public void popUpSeat() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this, R.style.CustomAlertDialog);
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_seat_picker, null);
        dialogBuilder.setView(layout);

        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.show();

        LinearLayout backSeat = layout.findViewById(R.id.icons);
        Button bookNowSeat = layout.findViewById(R.id.bookNowSeat);
        CheckedTextView I1 = layout.findViewById(R.id.I1);
        AtomicBoolean click = new AtomicBoolean(true);

        I1.setOnClickListener(v -> {
            if(click.get()) {
                I1.setBackgroundColor(getResources().getColor(R.color.purple_500));
                click.set(false);
            }else {
                I1.setBackground(getResources().getDrawable(R.drawable.ic_seats));
                click.set(true);
            }
        });

        bookNowSeat.setOnClickListener(v -> {
            alertDialog.dismiss();
        });

        backSeat.setOnClickListener(v -> {
            alertDialog.dismiss();
        });

    }
}