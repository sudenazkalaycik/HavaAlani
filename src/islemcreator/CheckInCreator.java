package islemcreator;

import islem.CheckInIslemi;
import islem.HavaAlaniIslemleri;

public class CheckInCreator extends IslemCreator{

    @Override
    public HavaAlaniIslemleri IslemOlustur(String prn_no) {
        return new CheckInIslemi(prn_no);
    }
}
