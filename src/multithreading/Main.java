package multithreading;

import java.util.Random;

public class Main {
    static boolean isFine = false;

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(1_000_000_000);

        // таймер (лучше сделать через do/while, пока isFine = false)
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000_000; i++) {
                    if (isFine) {
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();

        // угадывание числа через do/while)
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                do {
                    int testNumber = random.nextInt(1_000_000_000);
                    if (testNumber == number) {
                        isFine = true;
                        System.out.println(String.format("Fine number: %s", testNumber));
                    }
                } while (isFine == false);
            }
        });
        thread2.start();
    }
//    static boolean isFive = false;
//    public static void main(String[] args) {
//// с помощью анонимного класса с интерфейсом Runnable
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10_000_000; i++) {
//                    if (i == 5) {
//                        isFive = true;
//                    }
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread.start();
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10_000_000; i++) {
//                    if (isFive) {
//                        break;
//                    }
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread2.start();

// с помощью отдельного класса Timer с интерфейсом Runnable
//        Timer timer = new Timer();
//        Thread thread = new Thread(timer);
//        thread.start();

//        for (int i = 0; i < 10_000_000; i++) {
//            System.out.println(2);
//        }
//    }
}
