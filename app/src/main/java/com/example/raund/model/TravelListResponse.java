package com.example.raund.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TravelListResponse{

    @SerializedName("travellist")
    private List<TravellistItem> travellist;

    @SerializedName("tanggal")
    private String tanggal;

    @SerializedName("jumlah_data")
    private int jumlahData;

    public List<TravellistItem> getTravellist(){
        return travellist;
    }

    public String getTanggal(){
        return tanggal;
    }

    public int getJumlahData(){
        return jumlahData;
    }
}