package islem;

public class CheckInIslemi extends HavaAlaniIslemleri {
    public CheckInIslemi(String prn_no) {
        super(prn_no);
    }

    @Override
    public void islemYap() {
        String koltuk = "12" + (char) ('A' + new java.util.Random().nextInt(6));
        System.out.println("[SİSTEM] PNR: " + prn_no + " için Check-in tamamlandı. Koltuğunuz: " + koltuk);
    }
}
