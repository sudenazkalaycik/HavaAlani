package bilet;

public class EkonimikBilet extends Bilet {

    public EkonimikBilet(String ucusKodu, String kalkisYeri, String varisYeri, boolean isYurtDisi) {
        super(ucusKodu, kalkisYeri, varisYeri, isYurtDisi);
    }

    @Override
    public double fiyatHesapla() {
        double tabanFiyat = 1000.0;
        if (isYurtDisi == true) {
            return tabanFiyat + yurtDisiVergisi;
        } else {
            return tabanFiyat;
        }
    }

    @Override
    public String getAvantajlar() {
        return "15 kilogram bagaj hakkınız mevcut";
    }
}
