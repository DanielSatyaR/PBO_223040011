package Pertemuan12abstrak;

class Anjing extends Hewan {
    String ras;

    Anjing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    void suara() {
        System.out.println(nama + " menggonggong: Woof Woof");
    }

    @Override
    void bergerak() {
        System.out.println(nama + " sedang berlari.");
    }
}