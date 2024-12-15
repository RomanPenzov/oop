package examples;

public class Dog {
    String name;
    double weight;
    String breed;
    int speed;

    String getInfo() {
        return name + " " + breed + " " + weight;
    }

    void showSpeed() {
        for (int i = 0; i < speed; i++) {
            System.out.println("run");
        }
    }

    void showInfo() {
        System.out.println(getInfo());
    }
}
