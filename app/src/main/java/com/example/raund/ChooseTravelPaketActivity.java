package com.example.raund;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.raund.adapter.AdapterRecyclerView;
import com.example.raund.adapter.KelasAdapter;
import com.example.raund.model.ChooseTravel;
import com.example.raund.model.ChooseTravelItem;
import com.example.raund.model.ChooseTravelResponse;
import com.example.raund.model.TravelList;
import com.example.raund.model.TravelListResponse;
import com.example.raund.model.TravellistItem;
import com.example.raund.retrofit.PortalClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ChooseTravelPaketActivity extends AppCompatActivity implements KelasAdapter.OnKelasAdapterClickListener{

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_travel_paket);

        final KelasAdapter adapter = new KelasAdapter();

        adapter.setListener(this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Buat Object Client Retrofit
        String API_BASE_URL = "http://raund.herokuapp.com/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PortalClient client = retrofit.create(PortalClient.class);

        Call<TravelListResponse> call = client.getTravelList();
        call.enqueue(new Callback<TravelListResponse>() {
            @Override
            public void onResponse(Call<TravelListResponse> call, Response<TravelListResponse> response) {

                TravelListResponse travelResponse = response.body();
                ArrayList<TravelList> listTravel = new ArrayList<TravelList>();
                if (travelResponse != null && response.isSuccessful()) {
                    List<TravellistItem> travelItem = travelResponse.getTravellist();
                    for (TravellistItem item : travelItem) {
                        TravelList travel = new TravelList(
                                item.getNamaTravel(),
                                item.getNamaMobil(),
                                item.getJamDeparture(),
                                item.getKapasitas(),
                                item.getTravelFee(),
                                item.getGambar(),
                                item.getStatus()
                        );

                        listTravel.add(travel);
                    }
                }
                adapter.setListdata(listTravel);

//                Toast.makeText(getApplicationContext(), "BERHASIL", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<TravelListResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "GAGAL", Toast.LENGTH_SHORT).show();
                Log.d("pesan",t.getMessage());
            }

        });

    }



//    @Override
//    public void onClick(View view, ChooseTravel chooseTravel) {
//        Intent intent = new Intent(this, KonfirmDeliveryActivity.class);
//        intent.putExtra("nama_travel",chooseTravel.jenisMobil);
//        intent.putExtra("tgl",chooseTravel.tanggal);
//        intent.putExtra("harga",chooseTravel.harga);
//        intent.putExtra("pukul",chooseTravel.waktu);
//        startActivity(intent);
//    }

    @Override
    public void onClick(View view, TravelList travelList) {
        Intent intent = new Intent(this, confirmTravel.class);
        intent.putExtra("nama_mobil",travelList.nama_travel);
        intent.putExtra("tgl",travelList.nama_mobil);
        intent.putExtra("harga",travelList.harga_travel);
        startActivity(intent);
    }
}

