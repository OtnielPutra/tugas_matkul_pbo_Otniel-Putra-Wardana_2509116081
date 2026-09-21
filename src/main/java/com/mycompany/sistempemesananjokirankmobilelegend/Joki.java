/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempemesananjokirankmobilelegend;

/**
 *
 * @author Otniel
 */
public class Joki {
    String namaJoki;
    String rank;
    double harga;

    public Joki(String namaJoki, String rank, double harga) {
        this.namaJoki = namaJoki;
        this.rank = rank;
        this.harga = harga;
    }

    public void tampilkanJoki() {
        System.out.println("Nama Joki : " + namaJoki);
        System.out.println("Rank      : " + rank);
        System.out.println("Harga     : Rp" + harga);
    }
}