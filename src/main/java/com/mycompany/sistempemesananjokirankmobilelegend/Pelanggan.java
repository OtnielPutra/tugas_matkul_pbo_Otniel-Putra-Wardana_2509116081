/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempemesananjokirankmobilelegend;

/**
 *
 * @author Otniel
 */
public class Pelanggan {
    String nama;
    String username;
    String noHp;

    public Pelanggan(String nama, String username, String noHp) {
        this.nama = nama;
        this.username = username;
        this.noHp = noHp;
    }

    public void tampilkanPelanggan() {
        System.out.println("Nama     : " + nama);
        System.out.println("Username : " + username);
        System.out.println("No. HP   : " + noHp);
    }
}