package com.example.raund.model;

public class ChooseTravel {
    public String jenisMobil;
    public String tanggal;
    public String waktu;
    public String kapasitas;
    public String harga;
    public String jumlah;

    public ChooseTravel(String jenisMobil, String tanggal, String waktu, String jumlah,String harga, String kapasitas) {
        this.jenisMobil = jenisMobil;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.jumlah = jumlah;
        this.harga = harga;
        this.kapasitas = kapasitas;
    }
}
