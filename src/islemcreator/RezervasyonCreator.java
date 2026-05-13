package islemcreator;

import islem.HavaAlaniIslemleri;
import islem.RezervasyonIslemi;

public class RezervasyonCreator extends IslemCreator {

    @Override
    public HavaAlaniIslemleri IslemOlustur(String prn_no) {
        return new RezervasyonIslemi(prn_no);
    }
}
