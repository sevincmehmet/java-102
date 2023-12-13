package kalıtım;
// KAZANIMLAR: miras (Inheritance), aşırı yüklenme (Overloading), geçersiz kılma (Override)

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Dursun", "03121212", "c@mail.com");
        Akademisyen a1 = new Akademisyen("Sevinç", "05111111", "a@mail.com", "İş Sağlığı ve Güvenliği", "Akademisyen");
        LabAsistani lA = new LabAsistani("Mehmet", "05555555", "l@mail.com", "algoritma", "asistan", "05.00");

        c1.giris();

        //Akademisyen sınfındaki giris metodumuzu override ettik bu nedenle üst sınıflardakilerden farklı çalıstı
        a1.giris();
        // parametreli ve parametresiz olarak aynı isimde iki metot oluşturulabilir
        // METHOD OVERLOADİNG (metotlarda aşırı yüklenme)
        lA.giris(); // (giris sınıfının tek parametreli olanı override edildiğinden farklı çalıstı !!)
        lA.giris("08.00");
        lA.giris("08.00", "15.00");
    }
}
