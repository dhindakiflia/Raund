package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.raund.adapter.AdapterRecyclerView;
import com.example.raund.model.ChooseTravel;

import java.util.ArrayList;

public class ChooseTravelPaketActivity extends AppCompatActivity implements AdapterRecyclerView.OnChooseTravelClickListener{

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_travel_paket);

        AdapterRecyclerView adapter = new AdapterRecyclerView();
        adapter.setListChooseTravel(getChooseTravel());
        adapter.setListener(this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(LayoutManager);

    }

    public ArrayList<ChooseTravel> getChooseTravel(){
        ArrayList<ChooseTravel> ListChooseTravel = new ArrayList<ChooseTravel>();
        ListChooseTravel.add(new ChooseTravel(
                "Suzuki AVP",
                "2021-8-17",
                "10.00",
                "5",
                "50000",
                "8"));
        ListChooseTravel.add(new ChooseTravel(
                "Suzuki AVP",
                "2021-8-17",
                "10.00",
                "5",
                "50000","8"));
        ListChooseTravel.add(new ChooseTravel(
                "Suzuki AVP",
                "2021-8-17",
                "10.00",
                "5",
                "50000","8"));
        ListChooseTravel.add(new ChooseTravel(
                "Suzuki AVP",
                "2021-8-17",
                "10.00",
                "5",
                "50000","8"));
        ListChooseTravel.add(new ChooseTravel(
                "Suzuki AVP",
                "2021-8-17",
                "10.00",
                "5",
                "50000","8"));
        return ListChooseTravel;
    }

    @Override
    public void onClick(View view, ChooseTravel chooseTravel) {
        Intent intent = new Intent(this, KonfirmDeliveryActivity.class);
        startActivity(intent);
    }
}

