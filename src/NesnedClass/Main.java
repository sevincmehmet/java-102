package NesnedClass;
//İç içe sınıflar:
//* Neden extend kullanmıyoruz : Bir sınıf başka bir sınıf olmadan işe yaramıyorsa kullanılır : araba -> motor(Nesned Class)

//  * Nesned Class (İç içe Sınıflar)
//      - Inner Class (İç Sınıflar)
//          - static
//          - non-static
//      - Local Class (Yerel Sınıflar)
//      - Anonymus Class (Anonim Sınıflar)

public class Main {
    public static void main(String[] args) {
        Out o = new Out();
        //o.run();

        Out.In inNesnesi = o.new In(); // bunun yerine bir alttaki tanımlama da yapılabilir.
        Out.In inNesnesi2 = o.getIn();
        //inNesnesi2.run();
        //inNesnesi.run();

        Local l = new Local();
        //l.run();

        // Override edebilrisin ancak nesne üzerinden ulaşmana izin vermez
        Anonim a = new Anonim() {
            public int a = 20;

            @Override
            public void run() {
                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run metodu çalıştı !");
                print();
            }

            public void print() {
                System.out.println("Print metodu");
            }
        };
        a.run();
        //a.print(); // Bu şekilde çalışmaz ancak anonim içersindeki override edilmiş metot üzerinden kullanabilirsin.
    }
}
