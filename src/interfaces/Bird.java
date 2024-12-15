package interfaces;

public class Bird extends Animal implements AbleToFly, AbleToRun {
    @Override
    public void eat() {
        System.out.println("Bird food");
    }

    @Override
    public void fly() {
        System.out.println("Bird flys");
    }

    @Override
    public void run() {
        System.out.println("Bird run");
    }
}
