package com.example.photoframeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String message=intent.getStringExtra(MainActivity.MSG);
        //Set the text of the message in side Text View
        TextView textView = findViewById(R.id.orderActivity);
        textView.setText(message);

    }
}