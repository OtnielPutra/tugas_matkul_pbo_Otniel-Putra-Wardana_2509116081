# Sistem Pemesanan Joki Rank Mobile Legends

Nama : Otniel Putra Wardana

NIM  : 2509116081

## Studi Kasus

Pemesanan jasa joki rank Mobile Legends masih dilakukan melalui chat WhatsApp. Pelanggan biasanya mengirimkan data akun, rank awal, rank tujuan, dan informasi lainnya secara manual melalui pesan. Cara tersebut dapat menyebabkan terjadinya kesalahan dalam penulisan atau pencatatan data akun, terutama ketika banyak pesanan masuk dalam waktu yang bersamaan. Selain itu, data pesanan juga sulit dikelola dan dicari kembali karena masih tersimpan di dalam percakapan WhatsApp. Oleh karena itu, dibuat sebuah sistem pemesanan joki rank Mobile Legends yang dapat membantu pelanggan dan penyedia jasa dalam mencatat serta mengelola data pesanan dengan lebih terstruktur.

## Class yang Digunakan

Program terdiri dari beberapa class, yaitu:

* `Pelanggan.java`
* `Joki.java`
* `Pesanan.java`
* `Main.java`
* `User.java`

<img width="162" height="115" alt="image" src="https://github.com/user-attachments/assets/86a87efa-dcb9-4cf5-9708-343ef1d4a130" />

## Diagram Kelas Sederhana / Hierarki Class

Hierarki class pada program terdiri dari User sebagai class induk, kemudian Pelanggan dan Joki sebagai class turunan. Class User menyimpan atribut umum seperti nama dan nomor HP yang dapat digunakan oleh Pelanggan dan Joki. Selanjutnya, Pesanan menghubungkan objek Pelanggan dan Joki untuk menyimpan informasi pemesanan. Class Main digunakan untuk menjalankan program serta mengatur proses CRUD.

## Bagian Kode yang Menerapkan Inheritance

Inheritance diterapkan pada class Pelanggan dan Joki dengan menggunakan extends User. Dengan demikian, kedua class tersebut mewarisi atribut dan method dari class User. Penggunaan super() pada constructor digunakan untuk memanggil constructor dari class induk, sehingga atribut seperti nama dan noHp dapat digunakan oleh class Pelanggan dan Joki.

## Fitur Program

Program menyediakan beberapa fitur utama:

1. Tambah pesanan
<img width="292" height="307" alt="Screenshot 2026-09-21 201621" src="https://github.com/user-attachments/assets/fc60ecc2-d03b-4c23-a5ca-2071358a2bbf" />


2. Melihat daftar pesanan
<img width="456" height="351" alt="Screenshot 2026-09-21 201654" src="https://github.com/user-attachments/assets/62d685fc-86db-43d1-b72f-abe6cbff47bb" />

3. Mengubah data pesanan
<img width="500" height="612" alt="Screenshot 2026-09-21 200430" src="https://github.com/user-attachments/assets/021029de-05fb-4958-880d-7008199f5cc9" />


4. Menghapus pesanan
<img width="576" height="535" alt="Screenshot 2026-09-21 200440" src="https://github.com/user-attachments/assets/67e35231-b407-47f0-b69c-665d3d57cd91" />

5. Keluar dari program
