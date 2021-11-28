package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {
    private Button BtnEditProfile;
    private TextView SavedAddressTextView;
    private TextView ChangePassTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //Button
        BtnEditProfile = findViewById(R.id.BtnEditProfile);
        BtnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProfileEditActivity();
            }
        });

        //Saved Address Text View
        SavedAddressTextView = findViewById(R.id.SavedAddressTextView);
        SavedAddressTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NoSaveAddressActivity();
            }
        });

        //Change Password Text View
        ChangePassTextView = findViewById(R.id.ChangePassTextView);
        ChangePassTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChangePassActivity();
            }
        });

    }
    public void ProfileEditActivity(){
        Intent intent = new Intent(this, ProfileEditActivity.class);
        startActivity(intent);
    }
    public void NoSaveAddressActivity(){
        Intent intent = new Intent(this, NoSaveAddressActivity.class);
        startActivity(intent);
    }
    public void ChangePassActivity(){
        Intent intent = new Intent(this, ChangePassActivity.class);
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
