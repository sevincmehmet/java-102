package NesnedClass;
// Dış sınıfın içtekine ulaşması için bir nesne oluşturması gerekirken içteki sınıf dıştaki sınıfa ulaşabilmektedir.

public class Out {
    public int a = 5;

    public class In {
        public int a = 10;

        public void run() {
            System.out.println("in sınfına ait run çalıştı");
            int a = 1;
            System.out.println(a); // fonksiyondaki a
            System.out.println(this.a); // kendi sınıfındaki a
            System.out.println(Out.this.a); // Out içersindeki a aynı şekilde run metodunu da çağırabilirsin
        }
    } // non-static inner class // static tanımlama durumunda her nesneye direk class üzerinden ulaşılabilir ancak değişken, class ve metotlar bu şekilde tanımlanmalıdır.

    public void run() {
        In in = new In();
        in.run();
    }

    public In getIn() {
        return new In();
    }

}
