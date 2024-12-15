package box;

public class WeightBox extends Box {

    private double weight;

    public WeightBox(double length, double widht, double height, double weight) {
        super(length, widht, height);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public WeightBox() {
        this.weight = 10;
    }

    public WeightBox(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(this.weight);
    }
}
