package facade;
import biletcreator.*;
import islemcreator.*;


public class HavaAlaniSistemiFacade {
    public void biletSatinAl(int tip, String kod, String kalkis, String varis, boolean yurtDisi) {
        BiletCreator creator = null;


        switch (tip) {
            case 1:
                creator = new EkonomikBiletCreator();
                break;
            case 2:
                creator = new PlusBiletCreator();
                break;
            case 3:
                creator = new BusinessBiletCreator();
                break;
            default:
                System.out.println("Hata: Geçersiz tarife!");
                return;
        }

        creator.biletHazirla(kod, kalkis, varis, yurtDisi);
    }

    public void rezervasyonYap(String pnr) {
        // Rezervasyon fabrikasını kullanıyoruz [cite: 850]
        IslemCreator creator = new RezervasyonCreator();
        creator.baslat(pnr);
    }

    public void checkInYap(String pnr) {
        // Check-in fabrikasını kullanıyoruz [cite: 850]
        IslemCreator creator = new CheckInCreator();
        creator.baslat(pnr);
    }
}

