package test;

import box.WeightBox;
import examples.Person;
import inheritance.Rect;
import inheritance.Triangle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++ ) {
            int a = random.nextInt(7) + 1;
            System.out.println(String.format("Yours number: %s", a));

        }

//        Person person = new Person(37, "John");
//        System.out.println(person);
//        Rect rect = new Rect(2, 3);
//        System.out.println(rect.perimetr());
//
//        Triangle triangle = new Triangle(1, 2, 3);
//        System.out.println(triangle.perimetr());
    }
//        WeightBox box1 = new WeightBox(10, 100);
//        box1.showInfo();
//    }
//        Cat cat = new Cat();
//        Lion lion = new Lion();
//
//        System.out.println(cat.isCanEatPerson());
//        System.out.println(lion.isCanEatPerson());
//        cat.eat();
//        lion.eat();
//    }
//        String s = "This is John. He is 27 years old.";
//        String name = s.substring(8, 12);
//        int age = Integer.parseInt(s.substring(20, 22));
//        Person john = new Person(age, name);
//        System.out.println(john.getName() + '\n' + john.getAge());

//        ArrayList<String> employees = getEmployees();
//        employees.add("Vova");
//        employees.remove("Roman");

//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }
//        for (String employee : employees) {
//            System.out.println(employee);
//        }
//        ArrayList<String> family = new ArrayList<>();
//        family.add("Fufik");
//        family.add("Kuzja");
//        family.add("Sky");
//        family.add("Kesha");
//        family.add("Toshka");
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(4);
//        numbers.add(7);
//        numbers.add(9);
//        numbers.add(13);
//        numbers.add(15);
//
//        ArrayList<String> numbersOfNames = new ArrayList<>();
//        for (int i = 0; i < family.size(); i++) {
//            numbersOfNames.add(numbers.get(i) + " - " + family.get(i));
//        }
//
//        for (String el : numbersOfNames) {
//            System.out.println(el);
//        }
//    }

//    private static ArrayList<String> getEmployees() {
//        ArrayList<String> employees = new ArrayList<String>();
//        employees.add("Roman");
//        employees.add("Sveta");
//        employees.add("Nikita");
//        employees.add("Nina");
//        employees.add("Valja");
//        return employees;
//    }
}
