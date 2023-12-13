package Interface;

import java.util.Scanner;

// java birden fazla kalıtım yapmaya izin vermez bu nedenle bunun java  yerine interface kullanımı çıkartmıştır
// Bu uygulamada ödeme sistemimiz olacak ve 3 farklı bankadan entegre olacağız
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price = input.nextDouble();

        System.out.print("Kart No giriniz: ");
        String cardNumber = input.next();

        System.out.print("Son kullanım tarihi giriniz: ");
        String date = input.next();

        System.out.print("Güvenlik kodu giriniz: ");
        String cvc = input.next();

        System.out.println("1. A bankası");
        System.out.println("2. B bankası");
        System.out.println("3. C bankası");
        System.out.print("Banka seçiniz: ");
        int selectBank = input.nextInt();

        switch (selectBank) {
            case 1 :
                ABank aPos = new ABank("A Bankası", "123123132", "231213124");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber, date, cvc);
                break;
            case 2 :
                // Ekip arkadaşınla bölüştüğünüz kodu yazarken farklı metot isimleri kullanabilirsiniz bu da bütünlüğü bozar interface aynız amanda bunun da önüne geçer
                BBank bPos = new BBank("B Bankası", "123123132", "231213124");
                bPos.connect("127.1.1.1");
                bPos.payment(price, cardNumber, date, cvc);
                break;
            default:
                System.out.println("Geçerli bir banka giriniz !");
        }
    }
}
