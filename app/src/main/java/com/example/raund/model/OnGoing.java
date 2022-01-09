package com.example.raund.model;

import java.sql.Timestamp;

public class OnGoing {
    public String nama_travel_og;
    public String fromDelivery_og;
    public String destinationDelivery_og;
    public Timestamp tgl_departure_og;
    public Timestamp tgl_arrival_og;
    public Timestamp jam_pergi_og;
    public Timestamp jam_datang_og;
    public int harga_og;


    public OnGoing(String currentLoc, String destination, int total, Timestamp arrive, String namaTravel, Timestamp departure) {
        this.nama_travel_og = namaTravel;
        this.fromDelivery_og = currentLoc;
        this.destinationDelivery_og = destination;
        this.tgl_departure_og= departure;
        this.tgl_arrival_og = arrive;
        this.jam_pergi_og = departure;
        this.jam_datang_og = arrive;
        this.harga_og = total;
    }
}