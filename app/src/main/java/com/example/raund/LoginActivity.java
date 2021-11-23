package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private Button BtnLogin;
    private TextView idCreateAccTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Button
        BtnLogin = findViewById(R.id.BtnLogin);
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity();
            }
        });
        //TextView
        idCreateAccTxt = findViewById(R.id.idCreateAccTxt);
        idCreateAccTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegisActivity();
            }
        });
    }

    public void HomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
    public void RegisActivity() {
        Intent intent = new Intent(this, RegisActivity.class);
        startActivity(intent);
    }
}
