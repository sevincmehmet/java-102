package kalıtım;

public class GuvenlikGorevlisi extends Memur{
    private Boolean belge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, Boolean belge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge = belge;
    }

    public Boolean getBelge() {
        return belge;
    }

    public void setBelge(Boolean belge) {
        this.belge = belge;
    }

    public void  nobet() {
        System.out.println(" ");
    }
}
