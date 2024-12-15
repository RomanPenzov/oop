package interfaces;

public class Dog extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("Dog food");
    }

    @Override
    public void run() {
        System.out.println("Dog runs");
    }
}
