package GenericClass;

public class Main {
    public static void main(String[] args) {
        String str = ""; // buraya farklı bir değişken girince çalışmayacaktır. Bu nedenle ayrı ayrı Nullable sınıfları açmamız gerekmektedir. Ya da gerekli midir?
        // generik tam olarak burda devreye girerek bizim değişkenimizi gereken veri türüne göre güncelliyor

        // Nullable<int> bu şekilde ilken veri tipleri ile çalışmazlar ilkel olmayan veri tipleri kullanılmalıdır.


        Nullable<Integer> intN = new Nullable<>(10);
        intN.run();
        Nullable<String> stringN = new Nullable<>("asklfl");
        //stringN.run();
        //Aynı şekilde burda da tek tek her değer için yeni bir nesne oluşturmak zorunda değiliz bunun için de

        Integer i = 10;
        String s = "str";
        Double d = 3.14;

        MultiGeneric<Integer, String, Double> multiGeneric = new MultiGeneric<>(i,s,d);

        multiGeneric.showInfo();
    }
}
