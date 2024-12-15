package inheritance;

public class Rect extends Shape {
    public Rect(double a, double b) {
        super(a, b);
    }

    @Override
    public double perimetr() {
        return (this.getA() + this.getB()) * 2;
    }
}
