package islem;

public  abstract class HavaAlaniIslemleri {
    protected String prn_no;

    public HavaAlaniIslemleri(String prn_no){
        this.prn_no = prn_no;
    }

    public abstract void islemYap();

}
