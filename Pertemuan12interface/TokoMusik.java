package Pertemuan12interface;

public class TokoMusik {
    public static void main(String[] args) {
        AlatMusik gitar = new Gitar("Gitar Akustik", 6);
        AlatMusik piano = new Piano("Piano Grand", 88);

        System.out.println("Info Gitar:");
        gitar.tampilkanInfo();
        gitar.mainkan();
        ((DapatDisetel) gitar).setel();

        System.out.println("\nInfo Piano:");
        piano.tampilkanInfo();
        piano.mainkan();
        ((DapatDisetel) piano).setel();
    }
}