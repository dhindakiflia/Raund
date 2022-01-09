package com.example.raund.model;

public class TravelList {
    public String nama_travel;
    public String nama_mobil;
    public String tanggal_travel;
    public int available;
    public int harga_travel;
    public  String gambar;

    public TravelList(String namaTravel, String namaMobil, String jamDeparture, int kapasitas, int travelFee, String gambar, String status)
    {
        this.nama_travel = namaTravel;
        this.nama_mobil = namaMobil;
        this.tanggal_travel = jamDeparture;
        this.available = kapasitas;
        this.harga_travel = travelFee;
        this.gambar = gambar;
    }

//    public TravelList(String nama_travel, String nama_mobil, String tanggal_travel, int available, int harga_travel) {
//        this.nama_travel = nama_travel;
//        this.nama_mobil = nama_mobil;
//        this.tanggal_travel = tanggal_travel;
//        this.available = available;
//        this.harga_travel = harga_travel;
//    }
}


