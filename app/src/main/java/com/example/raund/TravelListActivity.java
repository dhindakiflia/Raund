package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.raund.adapter.KelasAdapter;
import com.example.raund.model.TravelList;

import java.util.ArrayList;

public class TravelListActivity extends AppCompatActivity implements KelasAdapter.OnKelasAdapterClickListener {

    RecyclerView rvListTravel ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_list);

        KelasAdapter adapter = new KelasAdapter();
        adapter.setListdata(getListtravel());
        adapter.setListener(this);

        rvListTravel = findViewById(R.id.rvListTravel);
        rvListTravel.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvListTravel.setLayoutManager(layoutManager);


    }

    public ArrayList<TravelList> getListtravel(){
        ArrayList<TravelList> listTravel = new ArrayList<TravelList>();
        listTravel.add(new TravelList(
                "AHYA TRAVEL",
                "Suzuki Honda Brio",
                "24  Januari 2000",
                "2",
                "150000"
        ));

        listTravel.add(new TravelList(
                "LIBRA TRAVEL",
                "Inova New 2021",
                "24  Januari 2021",
                "2",
                "180000"
        ));

        listTravel.add(new TravelList(
                "JAYA TRAVEL",
                "Avanza New",
                "24  Agustus 2021",
                "5",
                "120000"
        ));

        listTravel.add(new TravelList(
                "LIBRA TRAVEL",
                "Inova New",
                "24  April 2021",
                "2",
                "130000"
        ));

        listTravel.add(new TravelList(
                "AHYA TRAVEL",
                "Suzuki Honda Brio",
                "18  November 2021",
                "1",
                "135000"
        ));

        listTravel.add(new TravelList(
                "AHYA TRAVEL",
                "Suzuki Honda Brio",
                "24  Januari 2000",
                "2",
                "150000"
        ));

        listTravel.add(new TravelList(
                "LIBRA TRAVEL",
                "Inova New 2021",
                "24  Januari 2021",
                "2",
                "180000"
        ));

        listTravel.add(new TravelList(
                "JAYA TRAVEL",
                "Avanza New",
                "24  Agustus 2021",
                "5",
                "120000"
        ));

        listTravel.add(new TravelList(
                "LIBRA TRAVEL",
                "Inova New",
                "24  April 2021",
                "2",
                "130000"
        ));

        listTravel.add(new TravelList(
                "AHYA TRAVEL",
                "Suzuki Honda Brio",
                "18  November 2021",
                "1",
                "135000"
        ));
        return listTravel;

    }
    @Override
    public void onClick(View view, TravelList travelList) {
        Intent intent = new Intent(this, confirmTravel.class);
        startActivity(intent);
    }
}



