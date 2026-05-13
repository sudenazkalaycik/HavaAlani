package biletcreator;

import bilet.Bilet;
import bilet.EkonimikBilet;

public class EkonomikBiletCreator extends BiletCreator{
    @Override
    public Bilet biletOlustur(String ucusKodu, String kalkisYeri, String varisYeri, boolean isYurtDisi) {
        return new EkonimikBilet(ucusKodu, kalkisYeri,varisYeri,isYurtDisi);
    }
}
