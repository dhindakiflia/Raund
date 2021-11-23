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

import com.example.raund.adapter.OnGoingAdapterRecyclerView;
import com.example.raund.model.OnGoing;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class OngoingActivity extends AppCompatActivity implements OnGoingAdapterRecyclerView.OnGoingClickListener {

    RecyclerView rvOnGoing ;
    Button BtnHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing);

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

        OnGoingAdapterRecyclerView adapter = new OnGoingAdapterRecyclerView();
        adapter.setListdata(getOnGoing());
        adapter.setListener(this);

        rvOnGoing   = findViewById(R.id.rvOnGoing);
        rvOnGoing .setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvOnGoing.setLayoutManager(layoutManager);

        //Button
        BtnHistory = findViewById(R.id.BtnHistory);
        BtnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HistoryActivity();
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

    public void HistoryActivity() {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    public ArrayList<OnGoing> getOnGoing(){
        ArrayList<OnGoing> listdata = new ArrayList<OnGoing>();
        listdata.add(new OnGoing(
                "ERTE TRAVEL",
                "Padang",
                "Bukittinggi",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 30.000"

        ));

        listdata.add(new OnGoing(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new OnGoing(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new OnGoing(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new OnGoing(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new OnGoing(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));
        listdata.add(new OnGoing(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new OnGoing(
                "AHYA TRAVEL",
                "Padang",
                "Pekanbaru",
                "Thu, 17 Aug 2021",
                "Thu, 17 Aug 2021",
                "08.00 WIB",
                "11.00 WIB",
                "Rp. 50.000"
        ));

        listdata.add(new OnGoing(
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
    @Override
    public void onClick(View view, OnGoing onGoing) {
        Intent intent = new Intent(this, ResheduleJadwalActivity.class);
        startActivity(intent);
    }
}