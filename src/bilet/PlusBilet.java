package bilet;

public class PlusBilet extends Bilet {
    public PlusBilet(String ucusKodu, String kalkisYeri, String varisYeri, boolean isYurtDisi) {
        super(ucusKodu, kalkisYeri, varisYeri, isYurtDisi);
    }

    @Override
    public double fiyatHesapla() {
        double tabanFiyat = 1500.0;
        if (isYurtDisi == true) {
            return tabanFiyat + yurtDisiVergisi;
        } else {
            return tabanFiyat;
        }
    }

    @Override
    public String getAvantajlar() {
        return "20kg Bagaj + İçecek İkramı";
    }
}

