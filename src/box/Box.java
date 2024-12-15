package box;

public class Box {
    protected double length;
    protected double widht;
    protected double height;

    public Box(double length, double widht, double height) {
        this.length = length;
        this.widht = widht;
        this.height = height;
    }

    public Box(double size) {
        this(size, size, size); // это используется вариант конструктора выше
    }

    public Box() {
        this(10);   // это используется предыдущий вариант конструктора
    }

    public Box(Box another) {
        this(another.length, another.widht, another.height);
    }

    public double getVolume() {
        return length * widht * height;
    }

    public int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume) {
            return 1;
        } else if (currentVolume < anotherVolume) {
            return -1;
        } else {
            return 0;
        }
    }

    public Box copy() {
        Box newBox = new Box(this.length, this.widht, this.height);
        return newBox;
    }

    public void showInfo() {
        System.out.println(this.length + " " + this.widht + " " + this.height);
    }

    public Box increase() {
        return new Box(this.length * 2, this.widht * 2, this.height * 2);
    }
}
