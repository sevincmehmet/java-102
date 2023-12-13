package kalıtım;

public abstract class Akademisyen extends Calisan{
    private String bolum, unvan;

    public Akademisyen(String adSoyad, String telefon, String eposta,String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public abstract void derseGir(String dersSaati); // parametresiz de çalışır

    // Bazen alt sınıflarım içersinde üst metottan bağımsız çalışmasını isteyeceğim aynı isimde metotlarım olsun isterim bunun için java bize Override özelliğini sunmustur
    // Her yerde tek tek değiştirmek yerine tek yerde değişiklik sağlayabiliriz.
    // OVERRIDE (ezme)

    @Override // programcıya info vermek için var yazmazsan da çalısır ama yaz
    public void giris() {
        System.out.println(getAdSoyad() + " adlı akademisyen üniversiteye giriş yaptı");
    }
}
