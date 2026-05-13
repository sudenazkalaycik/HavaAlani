package biletcreator;
import bilet.Bilet;

public abstract class BiletCreator {
    public abstract Bilet biletOlustur(String ucusKodu, String kalkisYeri, String varisYeri, boolean isYurtDisi);

    public void biletHazirla(String ucusKodu, String kalkisYeri, String varisYeri, boolean isYurtDisi){
      Bilet bilet =  biletOlustur(ucusKodu, kalkisYeri, varisYeri, isYurtDisi);
        System.out.println(bilet.toString());

    }
}
