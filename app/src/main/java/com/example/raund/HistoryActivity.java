package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.raund.adapter.AdapterRecylerView;
import com.example.raund.model.History;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

    public class HistoryActivity extends AppCompatActivity{

    RecyclerView rvHistory;
    Button BtnOnGoing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        //initialize and assign variable
        BottomNavigationView bottomNavigationView= findViewById(R.id.bottomNavigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.history);

        //perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.history:
                        startActivity(new Intent(getApplicationContext()
                                , HistoryActivity.class));

                        overridePendingTransition(0,0);
                        return true;

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,HomeActivity.class));

                        overridePendingTransition(0,0);
                        return true;

                    case R.id.setting:
                        startActivity(new Intent(getApplicationContext()
                                ,SettingActivity.class));

                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        AdapterRecylerView adapter = new AdapterRecylerView();
        adapter.setListdata(getHistory());

        rvHistory = findViewById(R.id.rvHistory);
        rvHistory.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvHistory.setLayoutManager(layoutManager);

        //Button
        BtnOnGoing = findViewById(R.id.BtnOnGoing);
        BtnOnGoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OngoingActivity();
            }
        });
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

    public void OngoingActivity() {
        Intent intent = new Intent(this, OngoingActivity.class);
        startActivity(intent);
    }

    public ArrayList<History> getHistory() {
        ArrayList<History> listdata = new ArrayList<History>();
        listdata.add(new History(
                "ERTE TRAVEL",
                "Padang",
                "Bukittinggi",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 30.000"

        ));

        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));
        listdata.add(new History(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));


        return listdata;
    }

    }
