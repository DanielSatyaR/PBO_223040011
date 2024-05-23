package Pertemuan12interface;

class Piano extends AlatMusik implements DapatDisetel {
    int jumlahTuts;

    Piano(String nama, int jumlahTuts) {
        super(nama);
        this.jumlahTuts = jumlahTuts;
    }

    @Override
    void mainkan() {
        System.out.println(nama + " dengan " + jumlahTuts + " tuts sedang dimainkan.");
    }

    @Override
    public void setel() {
        System.out.println(nama + " sedang disetel.");
    }
}