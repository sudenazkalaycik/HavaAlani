import java.util.Scanner;

import biletcreator.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== HAVALİMANI BİLET YÖNETİM SİSTEMİ ===");

        System.out.print("Uçuş Kodu: "); String kod = scanner.nextLine();
        System.out.print("Kalkış Yeri: "); String kalkis = scanner.nextLine();
        System.out.print("Varış Yeri: "); String varis = scanner.nextLine();
        System.out.print("Uçuş Yurt Dışı mı? (E/H): ");
        boolean yurtDisi = scanner.nextLine().equalsIgnoreCase("E");

        System.out.println("\nTarife Seçin: 1- Ekonomik, 2- Plus, 3- Business");
        int secim = scanner.nextInt();

        BiletCreator creator = null;

        switch(secim) {
            case 1: creator = new EkonomikBiletCreator(); break;
            case 2: creator = new PlusBiletCreator(); break;
            case 3: creator = new BusinessBiletCreator(); break;
            default: System.out.println("Geçersiz seçim!"); return;
        }

        creator.biletHazirla(kod, kalkis, varis, yurtDisi);
    }
}