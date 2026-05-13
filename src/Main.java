import biletcreator.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== HAVALİMANI BİLET SİSTEMİ TESTİ ===");
        System.out.print("Uçuş Kodu: "); String kod = scanner.nextLine();
        System.out.print("Uçuş Yurt Dışı mı? (E/H): ");
        boolean yurtDisi = scanner.nextLine().equalsIgnoreCase("E");

        System.out.println("\nTarife Seçin: 1- Ekonomik, 2- Plus, 3- Business");
        int secim = scanner.nextInt();

        BiletCreator creator = null;

        // Factory Method: Seçime göre ilgili ConcreteCreator örneği oluşturulur
        switch(secim) {
            case 1:
                creator = new EkonomikBiletCreator();
                break;
            case 2:
                creator = new PlusBiletCreator();
                break;
            case 3:
                creator = new EkonomikBiletCreator();
                break;
            default:
                System.out.println("Geçersiz seçim!");
                return;
        }

        // anOperation(): Nesne üretilir ve hazırlık işlemleri (fiyat hesaplama vb.) yapılır
        creator.biletOlustur(kod, "İstanbul", "Londra", yurtDisi);
    }
}
