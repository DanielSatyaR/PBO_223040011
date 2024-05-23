package Pertemuan12abstrak;

public class KlinikHewan {
    public static void main(String[] args) {
        Hewan anjing = new Anjing("Buddy", 3, "Golden Retriever");
        Hewan kucing = new Kucing("Whiskers", 2, "Hitam");

        System.out.println("Info Anjing:");
        anjing.tampilkanInfo();
        anjing.suara();
        anjing.bergerak();

        System.out.println("\nInfo Kucing:");
        kucing.tampilkanInfo();
        kucing.suara();
        kucing.bergerak();
    }
}