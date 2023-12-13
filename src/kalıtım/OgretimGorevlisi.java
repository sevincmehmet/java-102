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

    @Override // abstract olarak belirlediğim üst sınıflardaki metotları alt sınıflarda override olarak belirtmek gereklidir
    public void derseGir(String dersSaati) {
        System.out.println(getAdSoyad() + " " + dersSaati + " saatinde dersse girdi");
    }
}
