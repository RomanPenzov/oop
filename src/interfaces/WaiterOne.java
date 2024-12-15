package interfaces;

public class WaiterOne implements Waiter {
    @Override
    public void bringTheOrder(String nameDish) {
        System.out.println("need to bring a dish " + nameDish);
    }
}
