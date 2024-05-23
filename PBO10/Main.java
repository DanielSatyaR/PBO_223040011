package PBO10;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("321", "Jaguar", "Ilmu hukum ");
        System.out.println(dosen.getNip() + " - " + dosen.getNama() + " - " + dosen.getJurusan());
    }
}