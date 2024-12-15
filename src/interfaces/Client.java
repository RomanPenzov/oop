package interfaces;

public class Client {
    public String makeAnOrder(Waiter waiter, String nameDish) {
        waiter.bringTheOrder(nameDish);
        System.out.println("Client makes an order");
        return nameDish;
    }
}
