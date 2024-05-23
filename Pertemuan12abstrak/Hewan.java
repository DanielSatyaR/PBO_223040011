package Pertemuan12abstrak;

abstract class Hewan {
    String nama;
    int umur;

    Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode abstrak
    abstract void suara();
    abstract void bergerak();

    // Metode umum untuk semua hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}