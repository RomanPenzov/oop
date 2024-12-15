package examples;

public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    Monster(int num) {
        this(num, num, num);
    }

    Monster() {
        this(2);
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

//    void voice(int count) {
//        for (int i = 0; i < count; i++) {
//            System.out.println("Grrrrrr");
//        }
//    }
//
//    void voice() {
//        System.out.println("Grrrrrr");
//    }
    void voice(int count) {
        voice(count, "Grrrrrr");
    }

    void voice() {
        voice(1);
    }
}
