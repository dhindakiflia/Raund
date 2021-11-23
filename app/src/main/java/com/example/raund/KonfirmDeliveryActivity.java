package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KonfirmDeliveryActivity extends AppCompatActivity {
    private Button OrderButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmdelivery);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        OrderButton = findViewById(R.id.OrderButton1);
        OrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnGoingActivity();
            }
        });

    }
    public void OnGoingActivity(){
        Intent intent = new Intent(this, OngoingActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}