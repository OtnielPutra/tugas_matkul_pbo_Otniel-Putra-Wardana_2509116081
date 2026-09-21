/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistempemesananjokirankmobilelegend;

/**
 *
 * @author Otniel
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n===== SISTEM PEMESANAN JOKI MOBILE LEGENDS =====");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Update Pesanan");
            System.out.println("4. Hapus Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.print("ID Pesanan: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Nama Pelanggan: ");
                String nama = input.nextLine();

                System.out.print("Username Mobile Legends: ");
                String username = input.nextLine();

                System.out.print("No. HP: ");
                String noHp = input.nextLine();

                System.out.print("Nama Joki: ");
                String namaJoki = input.nextLine();

                System.out.print("Rank Saat Ini: ");
                String rank = input.nextLine();

                System.out.print("Rank Tujuan: ");
                String rankTujuan = input.nextLine();

                System.out.print("Harga Joki: ");
                double harga = input.nextDouble();
                input.nextLine();

                Pelanggan pelanggan = new Pelanggan(nama, username, noHp);
                Joki joki = new Joki(namaJoki, rank, harga);
                Pesanan pesanan = new Pesanan(id, pelanggan, joki, rankTujuan);

                daftarPesanan.add(pesanan);

                System.out.println("Pesanan berhasil ditambahkan!");

            } else if (pilihan == 2) {
                if (daftarPesanan.isEmpty()) {
                    System.out.println("Belum ada pesanan.");
                } else {
                    System.out.println("\n===== DAFTAR PESANAN =====");
                    for (Pesanan p : daftarPesanan) {
                        p.tampilkanPesanan();
                    }
                }

            } else if (pilihan == 3) {
                System.out.print("Masukkan ID Pesanan yang ingin diubah: ");
                int id = input.nextInt();
                input.nextLine();

                boolean ditemukan = false;

                for (Pesanan p : daftarPesanan) {
                    if (p.idPesanan == id) {
                        System.out.print("Masukkan status baru: ");
                        p.status = input.nextLine();

                        System.out.print("Masukkan rank tujuan baru: ");
                        p.rankTujuan = input.nextLine();

                        System.out.println("Pesanan berhasil diupdate!");
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Pesanan tidak ditemukan.");
                }

            } else if (pilihan == 4) {
                System.out.print("Masukkan ID Pesanan yang ingin dihapus: ");
                int id = input.nextInt();

                boolean ditemukan = false;

                for (int i = 0; i < daftarPesanan.size(); i++) {
                    if (daftarPesanan.get(i).idPesanan == id) {
                        daftarPesanan.remove(i);
                        System.out.println("Pesanan berhasil dihapus!");
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Pesanan tidak ditemukan.");
                }

            } else if (pilihan == 5) {
                System.out.println("Program selesai.");

            } else {
                System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);

        input.close();
    }
}