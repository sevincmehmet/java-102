package statick;
//Static olarak tanımlanan değişkenimiz yalnızca bir kez tanımlanır tekrar oluşturulmaz
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Mehmet", 0);
        System.out.println(Player.count);
        Player p2 = new Player("Dursun", 1);
        System.out.println(Player.count);
    }
}
