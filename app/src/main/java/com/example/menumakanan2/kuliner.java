package com.example.menumakanan2;

public class kuliner {


    public int getId_gambar;
    private String nama, alamat, deskripsi;
    private int id_gambar;

    public kuliner(String nama, String alamat, String deskripsi, int id_gambar){
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.id_gambar = id_gambar;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
