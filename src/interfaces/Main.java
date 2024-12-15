package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.makeAnOrder(new Waiter() {
            @Override
            public void bringTheOrder(String nameDish) {
                System.out.println("need to bring a dish " + nameDish);
            }
        }, "fish");

//        Client client = new Client();
//        WaiterOne waiterOne = new WaiterOne();
//        String dish = client.makeAnOrder(waiterOne, "meat");
//        waiterOne.bringTheOrder(dish);

//        Director director = new Director();
//        Programmer programmer = new Programmer();
//        director.force(new Worker() {
//            @Override
//            public void work() {
//                System.out.println("work");
//            }
//        });
//        Director director = new Director();
//        Cook cook = new Cook();
//        Programmer programmer = new Programmer();
//
//        ArrayList<Worker> workers = new ArrayList<>();
//        workers.add(director);
//        workers.add(cook);
//        workers.add(programmer);
//        for (Worker wocker : workers) {
//            wocker.work();
//        }
//
//        ArrayList<Driver> drivers = new ArrayList<>();
//        drivers.add(cook);
//        drivers.add(programmer);
//        for (Driver driver : drivers) {
//            driver.drive();
//        }
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Bird bird = new Bird();
//        Fish fish = new Fish();
//
//        ArrayList<AbleToRun> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        for (AbleToRun animal: animals) {
//            animal.run();
//        }
//
//        AbleToFly ableToFly = new Bird();
//        ableToFly.fly();
    }
}
