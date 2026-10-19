/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author QWERTY
 */
public class Main {
    public static void main(String[] args) {

        // Membuat objek kasir
        Kasir kasir = new Kasir("Budi");

        // Membuat objek item pesanan secara independen
        ItemPesanan item1 =
                new ItemPesanan("Iced Americano", 18000);

        ItemPesanan item2 =
                new ItemPesanan("Beef Croissant", 25000);

        ItemPesanan item3 =
                new ItemPesanan("Matcha Latte", 22000);

        // Membuat pesanan untuk Meja 4
        Pesanan pesanan = new Pesanan(4, 5);

        // Menambahkan item ke dalam pesanan
        pesanan.tambahItem(item1);
        pesanan.tambahItem(item2);
        pesanan.tambahItem(item3);

        // Menampilkan daftar pesanan
        pesanan.tampilkanPesanan();

        // Memproses pembayaran
        kasir.prosesPembayaran(pesanan);
    }
}


