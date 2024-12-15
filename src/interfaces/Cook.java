package interfaces;

public class Cook implements Driver, Worker {
    @Override
    public void work() {
        System.out.println("Cook work");
    }

    @Override
    public void drive() {
        System.out.println("Cook drives");
    }
}
