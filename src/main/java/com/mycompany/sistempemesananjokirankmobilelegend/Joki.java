/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempemesananjokirankmobilelegend;

/**
 *
 * @author Otniel
 */
public class Joki extends User {
    String rank;
    double harga;

    public Joki(String nama, String noHp, String rank, double harga) {
        super(nama, noHp);
        this.rank = rank;
        this.harga = harga;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama Joki : " + nama);
        System.out.println("No HP     : " + noHp);
        System.out.println("Rank      : " + rank);
        System.out.println("Harga     : Rp" + harga);
    }
}