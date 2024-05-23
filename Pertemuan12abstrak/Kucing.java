package Pertemuan12abstrak;

class Kucing extends Hewan {
    String warna;

    Kucing(String nama, int umur, String warna) {
        super(nama, umur);
        this.warna = warna;
    }

    @Override
    void suara() {
        System.out.println(nama + " mengeong: Meow Meow");
    }

    @Override
    void bergerak() {
        System.out.println(nama + " sedang melompat.");
    }
}
