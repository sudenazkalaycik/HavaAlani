package bilet;// product

public abstract class Bilet {
    protected String ucusKodu;
    protected String kalkisYeri;
    protected String varisYeri;
    protected boolean isYurtDisi;
    protected double yurtDisiVergisi = 2000.0;

    public Bilet(String ucusKodu, String kalkisYeri, String varisYeri, boolean isYurtDisi) {
        this.ucusKodu = ucusKodu;
        this.kalkisYeri = kalkisYeri;
        this.varisYeri = varisYeri;
        this.isYurtDisi = isYurtDisi;
    }

    public abstract double fiyatHesapla();

    public abstract String getAvantajlar();

    @Override
    public String toString() {
        return "======= concreteproducts.Bilet Detayları ========\n" +
                "Uçuş: " + ucusKodu + "| Rota: " + kalkisYeri + "--> " + varisYeri + "\n" +
                "Toplam Fiyat: " + fiyatHesapla() + "TL \n" +
                "Avantajlar: " + getAvantajlar();

    }
}



