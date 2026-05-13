package bilet;

public class BusinessBilet extends Bilet {
    public BusinessBilet(String ucusKodu, String kalkisYeri, String varisYeri, boolean isYurtDisi) {
        super(ucusKodu, kalkisYeri, varisYeri, isYurtDisi);
    }

    @Override
    public double fiyatHesapla() {
        double tabanFiyat = 2500.0;
        if (isYurtDisi == true) {
            return tabanFiyat + yurtDisiVergisi;
        } else {
            return tabanFiyat;
        }
    }

    @Override
    public String getAvantajlar() {
        return "30kg Bagaj + VIP Yemek + Konforlu Koltuk";
    }
}