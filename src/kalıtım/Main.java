package kalıtım;
// KAZANIMLAR: miras (Inheritance), aşırı yüklenme (Overloading), geçersiz kılma (Override)

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Dursun", "03121212", "c@mail.com");
        Akademisyen a1 = new Akademisyen("Sevinç", "05111111", "a@mail.com", "İş Sağlığı ve Güvenliği", "Akademisyen");
        LabAsistani l1 = new LabAsistani("Mehmet", "05555555", "l@mail.com", "algoritma", "asistan", "05.00");

        c1.giris();

        //Akademisyen sınfındaki giris metodumuzu override ettik bu nedenle üst sınıflardakilerden farklı çalıstı
        a1.giris();
        // parametreli ve parametresiz olarak aynı isimde iki metot oluşturulabilir
        // METHOD OVERLOADİNG (metotlarda aşırı yüklenme)
        l1.giris(); // (giris sınıfının tek parametreli olanı override edildiğinden farklı çalıstı !!)
        l1.giris("08.00");
        l1.giris("08.00", "15.00");

        // POLIMORFIZM (Çok Biçimlilik) // poliformizm olması için kalıtım olmalıdır.
        // kendisine tanımlı metotlar kullanılamaz
        Calisan c2 = new Akademisyen("batuhan", "0111111","c2@mail.com", "GRAF", "Prof.");
        c2.giris();
        //c2.getBolum(); //(aslında bu calisan oldugundan Akademisyenin özleliklerini kullanamadık) burda yalnızca override edilmiş ve calisanda olan metotları kullanabiliriz.
        c2.cikis();

        //Example
        //tüm verilerimii bir arrayde tutmak istersem her biri çalısan oldugundan caalısan sınfı türünde bir arrayde tutabilirim

        System.out.println();

        Calisan[] loginUser = {c1, a1, l1};

        Calisan.girisYapanlar(loginUser);

    }
}
