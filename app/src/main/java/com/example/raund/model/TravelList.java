package com.example.raund.model;

public class TravelList {
    public String nama_travel;
    public String nama_mobil;
    public String tanggal_travel;
    public String available;
    public String harga_travel;

    public TravelList()
    {

    }

    public TravelList(String nama_travel, String nama_mobil, String tanggal_travel, String available, String harga_travel) {
        this.nama_travel = nama_travel;
        this.nama_mobil = nama_mobil;
        this.tanggal_travel = tanggal_travel;
        this.available = available;
        this.harga_travel = harga_travel;
    }
}


