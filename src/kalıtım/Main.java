package kalıtım;

public class Main {
    public static void main(String[] args) {
        LabAsistani lA = new LabAsistani("Mehmet", "05555555", "sdkh@mail.com", "algoritma", "asistan", "05.00");

        lA.derseGir(); // Derse gir metodu Akademisyende olmasına rağmen kullanabildik
        lA.cikis(); // Çalışan sınıfından gelen metot
    }
}
