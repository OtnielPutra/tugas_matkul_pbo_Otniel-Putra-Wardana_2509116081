/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempemesananjokirankmobilelegend;

/**
 *
 * @author Otniel
 */
public class Pesanan {
    int idPesanan;
    Pelanggan pelanggan;
    Joki joki;
    String rankTujuan;
    String status;

    public Pesanan(int idPesanan, Pelanggan pelanggan, Joki joki, String rankTujuan) {
        this.idPesanan = idPesanan;
        this.pelanggan = pelanggan;
        this.joki = joki;
        this.rankTujuan = rankTujuan;
        this.status = "Diproses";
    }

    public void tampilkanPesanan() {
        System.out.println("ID Pesanan : " + idPesanan);
        System.out.println("Pelanggan  : " + pelanggan.nama);
        System.out.println("Username   : " + pelanggan.username);
        System.out.println("Rank Awal  : " + joki.rank);
        System.out.println("Rank Tujuan: " + rankTujuan);
        System.out.println("Harga      : Rp" + joki.harga);
        System.out.println("Status     : " + status);
        System.out.println("--------------------------------");
    }
}
