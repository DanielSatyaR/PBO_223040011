package Pertemuan12interface;

abstract class AlatMusik {
    String nama;

    AlatMusik(String nama) {
        this.nama = nama;
    }

    // Metode abstrak
    abstract void mainkan();

    // Metode umum untuk semua alat musik
    void tampilkanInfo() {
        System.out.println("Instrumen: " + nama);
    }
}

// Interface DapatDisetel
interface DapatDisetel {
    void setel();
}