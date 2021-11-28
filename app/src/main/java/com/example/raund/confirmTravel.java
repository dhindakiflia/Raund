package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class confirmTravel extends AppCompatActivity {
    Button BtnOrder;
    TextView namaMobil;
    TextView tglBerangkat;
    TextView uang_price;

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
        Intent intent = getIntent();
        String nama_mobil =  intent.getStringExtra("nama_mobil");
        namaMobil = findViewById(R.id.namaMobil);
        namaMobil.setText(nama_mobil);

        String tgl =  intent.getStringExtra("tgl");
        tglBerangkat = findViewById(R.id.tglBerangkat);
        tglBerangkat.setText(tgl);

        String harga =  intent.getStringExtra("harga");
        uang_price = findViewById(R.id.uang_price);
        uang_price.setText(harga);

    }
    public void OnGoingActivity(){
        Intent intent = new Intent(this, OngoingActivity.class);
        startActivity(intent);
    }
}
