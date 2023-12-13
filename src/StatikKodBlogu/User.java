package StatikKodBlogu;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    {
        System.out.println("Bu classtan her nesne oluşturulan static kod bloğu");
    }

    static {
        System.out.println("yalnızca bir kez çalıştırılan static kod bloğu");
        int Random = (int) ((Math.random() +1) *10);
        System.out.println(Random);
    }
}
