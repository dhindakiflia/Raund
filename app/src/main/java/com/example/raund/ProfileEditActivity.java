package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileEditActivity extends AppCompatActivity {

    private Button BtnSaveProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiledit);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

//        //Button
        BtnSaveProfile = findViewById(R.id.BtnSaveProfile);
        BtnSaveProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SettingActivity();
            }
        });

    }
    public void  SettingActivity(){
        Intent intent = new Intent(this, SettingActivity.class);
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
