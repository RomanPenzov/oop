package exceptions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intMassive = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            intMassive.add(i);
        }
        for (int el : intMassive) {
            System.out.println(el);
        }

        try {
            System.out.println(intMassive.get(13));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("you go out massive");
        }

//        try {
//            intMassive.get(13);
//        } catch (Exception e) {
//            System.out.println("Error = " + e.getClass());
//        }

//        int a = 0;
//        try {
//            int b = 7 / a;
//        } catch (Exception e) {
//            System.out.println("Error " + e.getClass());
//        }
    }
}
