package PBO10;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("223040021","Daniel", "Sumedang");
        System.out.println(mhs.getNrp() + "-" + mhs.getNama() + "-" + mhs.getAlamat());
    }
}
