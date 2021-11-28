package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KonfirmDeliveryActivity extends AppCompatActivity {
    private Button OrderButton;
    TextView nama_mobil;
    TextView tglBerangkat;
    TextView uang_price;
    TextView pukulBerangkat;
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
        Intent intent = getIntent();
        String nama_travel =  intent.getStringExtra("nama_travel");
        nama_mobil = findViewById(R.id.nama_mobil);
        nama_mobil.setText(nama_travel);

        String tgl =  intent.getStringExtra("tgl");
        tglBerangkat = findViewById(R.id.tglBerangkat);
        tglBerangkat.setText(tgl);

        String harga =  intent.getStringExtra("harga");
        uang_price = findViewById(R.id.uang_price);
        uang_price.setText(harga);

        String pukul =  intent.getStringExtra("pukul");
        pukulBerangkat = findViewById(R.id.pukulBerangkat);
        pukulBerangkat.setText(pukul);
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