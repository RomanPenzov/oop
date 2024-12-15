package interfaces;

public class Programmer implements Driver, Worker {
    @Override
    public void work() {
        System.out.println("Programmer work");
    }

    @Override
    public void drive() {
        System.out.println("Programmer drives");
    }
}
