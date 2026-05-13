package islemcreator;

import islem.HavaAlaniIslemleri;

public abstract class IslemCreator {
    public abstract HavaAlaniIslemleri IslemOlustur(String prn_no);

    public void baslat(String prn_no) {
        HavaAlaniIslemleri islem = IslemOlustur(prn_no);
        islem.islemYap();
    }
}
