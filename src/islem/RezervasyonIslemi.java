package islem;

public class RezervasyonIslemi extends HavaAlaniIslemleri {
    public RezervasyonIslemi(String prn_no) {
        super(prn_no);
    }

    @Override
    public void islemYap() {
        System.out.println("[SİSTEM] PNR: " + prn_no + " için 24 saatlik ön rezervasyon yapıldı.");
    }
}
