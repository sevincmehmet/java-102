package finalVeriable;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        //c1.PI_SAYISI = 4; //final tanımladığımdan dolayı pi değerimiz değişmez
        c1.calcArea();
    }
}
