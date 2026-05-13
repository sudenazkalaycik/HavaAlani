package biletcreator;

import bilet.Bilet;
import bilet.BusinessBilet;

public class BusinessBiletCreator extends BiletCreator{
    @Override
    public Bilet biletOlustur(String ucusKodu, String kalkisYeri, String varisYeri, boolean isYurtDisi) {
        return new BusinessBilet(ucusKodu,kalkisYeri,varisYeri, isYurtDisi);
    }
}
