package kalıtım;
// KAZANIMLAR: miras (Inheritance), aşırı yüklenme (Overloading), geçersiz kılma (Override), çok biçimcilik (Polimorfizm), soyutlama (Abstruction)
// Bunlar javanın 4 temel ilkesidir.

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Dursun", "03121212", "c@mail.com");
        //Akademisyen a1 = new Akademisyen("Sevinç", "05111111", "a@mail.com", "İş Sağlığı ve Güvenliği", "Akademisyen"); Akademisyen sınıfımız artık abstract bir sınıtır
        LabAsistani l1 = new LabAsistani("Mehmet", "05555555", "l@mail.com", "algoritma", "asistan", "05.00");
        OgretimGorevlisi o1 = new OgretimGorevlisi("OgretimGorevlisiAdıSoyadı", "05333333333","o1@mail.com", "MAT1", "Ogretim Görevlisi");
        c1.giris();

        //Akademisyen sınfındaki giris metodumuzu override ettik bu nedenle üst sınıflardakilerden farklı çalıstı
        //a1.giris();
        // parametreli ve parametresiz olarak aynı isimde iki metot oluşturulabilir
        // METHOD OVERLOADİNG (metotlarda aşırı yüklenme)
        l1.giris(); // (giris sınıfının tek parametreli olanı override edildiğinden farklı çalıstı !!)
        l1.giris("08.00");
        l1.giris("08.00", "15.00");

        // POLIMORFIZM (Çok Biçimlilik) // poliformizm olması için kalıtım olmalıdır.
        // kendisine tanımlı metotlar kullanılamaz
        //Calisan c2 = new Akademisyen("batuhan", "0111111","c2@mail.com", "GRAF", "Prof."); // Akademisyen abstract class oldugundan oluşturulamaz
        //c2.giris();
        //c2.getBolum(); //(aslında bu calisan oldugundan Akademisyenin özleliklerini kullanamadık) burda yalnızca override edilmiş ve calisanda olan metotları kullanabiliriz.
        //c2.cikis();

        //Example
        //tüm verilerimii bir arrayde tutmak istersem her biri çalısan oldugundan caalısan sınfı türünde bir arrayde tutabilirim

        System.out.println();

        Calisan[] loginUser = {c1, l1};

        Calisan.girisYapanlar(loginUser);

        // ABSTRACTION (soyutlama)
        // abstract sınıf bizim o sınıftan nesne üretmemizi engeller bu program için çalışan, akademisyen ve memur sınıflarından nesne üretmek mantıksızdır bu nedenle bu sınıfları abstract sınıf olarak değerlendirebiliriz
        System.out.println();
        o1.derseGir("15.00");

    }
}
