package finalVeriable;

public class Circle {
    public int r;
    public final double PI_SAYISI = 3.14; // Hiçbir yerde değiştirilemez..

    public Circle(int r) {
        this.r = r;
        //this.PI_SAYISI = 20; //final oldugundan değişmez
    }

    public void calcArea() {
        double area = PI_SAYISI * Math.pow(this.r, 2);
        System.out.println("Circle area: " + area);
    }
}
