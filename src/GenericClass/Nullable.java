package GenericClass;

// Generic sınıfta hangi veri tiğine göre işlem yapmak istiyorsam o değişken yerine '<>' işaretleri arasına attığım değeri koyarak işlem sağlıyorum
public class Nullable <T>{
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public boolean isNull() {
        return this.value == null;
    }

    public void run() {
        if(isNull()) {
            System.out.println("Bu değişkene değer atanmamıştır. (null) ");
        } else {
            System.out.println(getValue());
        }
    }
}