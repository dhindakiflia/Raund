package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class confirmTravel extends AppCompatActivity {
    Button BtnOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_travel);
        //Button
        BtnOrder = findViewById(R.id.BtnOrder);
        BtnOrder.setOnClickListener(new View.OnClickListener() {
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
}
