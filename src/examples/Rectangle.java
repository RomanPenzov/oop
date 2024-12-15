package examples;

public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int getArea() {
        return this.length * this.width;
    }
}
