package kalıtım;

public class OgretimGorevlisi extends Akademisyen{
    private int kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta,String bolum, String unvan) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        int kapiNo;
    }

    public int getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }
}
