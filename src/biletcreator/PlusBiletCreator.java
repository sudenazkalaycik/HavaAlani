package biletcreator;

import bilet.Bilet;
import bilet.PlusBilet;

public class PlusBiletCreator extends BiletCreator {

    @Override
    public Bilet biletOlustur(String ucusKodu, String kalkisYeri, String varisYeri, boolean isYurtDisi) {
        return new PlusBilet(ucusKodu,kalkisYeri,varisYeri,isYurtDisi);
    }
}
