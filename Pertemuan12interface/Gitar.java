package Pertemuan12interface;

class Gitar extends AlatMusik implements DapatDisetel {
    int jumlahSenar;

    Gitar(String nama, int jumlahSenar) {
        super(nama);
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    void mainkan() {
        System.out.println(nama + " dengan " + jumlahSenar + " senar sedang dimainkan.");
    }

    @Override
    public void setel() {
        System.out.println(nama + " sedang disetel.");
    }
}