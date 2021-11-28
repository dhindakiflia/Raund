package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    private ImageButton BtnTraveling;
    private ImageButton BtnDelivery;
    BottomNavigationView bottomNavigationView;
    NavController navController ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //initialize and assign variable
        BottomNavigationView bottomNavigationView= findViewById(R.id.bottomNavigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.home);

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


//
//        bottomNavigationView = findViewById(R.id.bottomNavigationView);
//        navController = Navigation.findNavController(this, R.id.fragmentContainerView);
//        NavigationUI.setupWithNavController(bottomNavigationView,navController);

        //Button
        BtnTraveling = findViewById(R.id.BtnTraveling);
        BtnTraveling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataTravelActivity();
            }
        });

        //Button
        BtnDelivery = findViewById(R.id.BtnDelivery);
        BtnDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailSenderActivity();
            }
        });


    }

    public void DataTravelActivity() {
        Intent intent = new Intent(this, DataTravelActivity.class);
        startActivity(intent);
    }
    public void DetailSenderActivity() {
        Intent intent = new Intent(this, DetailSenderActivity.class);
        startActivity(intent);
    }



}
