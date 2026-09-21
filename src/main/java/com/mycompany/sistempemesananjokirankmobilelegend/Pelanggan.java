/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempemesananjokirankmobilelegend;

/**
 *
 * @author Otniel
 */
public class Pelanggan extends User {
    String username;

    public Pelanggan(String nama, String noHp, String username) {
        super(nama, noHp);
        this.username = username;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama     : " + nama);
        System.out.println("No HP    : " + noHp);
        System.out.println("Username : " + username);
    }
}