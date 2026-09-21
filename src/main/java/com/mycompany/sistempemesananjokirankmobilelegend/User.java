/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempemesananjokirankmobilelegend;

/**
 *
 * @author Otniel
 */
public class User {
    String nama;
    String noHp;

    public User(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    public void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("No HP : " + noHp);
    }
}