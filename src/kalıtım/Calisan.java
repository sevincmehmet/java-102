package kalıtım;

public class Calisan {
    private String adSoyad, telefon, eposta;

    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    // Aynı isme sahip ancak birine parametre verirsek sorunsuz çalısır çalıştırırken parametreli veya parametresiz olarak çağırabilirsiniz.
    // METHOD OVERLOADİNG (metotlarda aşırı yüklenme)
    public void giris() {
        System.out.println(this.adSoyad + " üniversiteye giriş yaptı !!");
    }

    public void giris(String girisSaati) {
        System.out.println(this.adSoyad + " " + girisSaati +" saatinde üniversiteye giriş yaptı !!");
    }

    public void giris(String girisSaati, String cikisSaati) {
        System.out.println(this.adSoyad + " " + girisSaati +" saatinde üniversiteye giriş yaptı " + cikisSaati + " saatinde çıkacaktır !!");
    }
    public void cikis() {
        System.out.println(this.adSoyad + " üniversiteden çıkış yaptı !!");
    }

    public void yemekhane() {
        System.out.println(this.adSoyad + "yemekhaneye giriş yaptı !!");
    }
}
