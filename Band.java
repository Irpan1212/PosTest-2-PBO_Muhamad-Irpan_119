/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bandmetal.model;

/**
 *
 * @author muham
 */
public class Band {
    private String nama;
    private String genre;
    private int tahunBerdiri;
    private int jumlahAnggota;

    public Band(String nama, String genre, int tahunBerdiri, int jumlahAnggota) {
        this.nama = nama;
        this.genre = genre;
        this.tahunBerdiri = tahunBerdiri;
        this.jumlahAnggota = jumlahAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(int tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }

    public void setJumlahAnggota(int jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }
    
    @Override
    public String toString() {
        return String.format(
            "Nama Band: %s%n" +
            "   Genre: %s%n" +
            "   Tahun Berdiri: %d%n" +
            "   Jumlah Anggota: %d",
            nama, genre, tahunBerdiri, jumlahAnggota
        );
    }
}

