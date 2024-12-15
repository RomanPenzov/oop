package examples;

public class Woker {
    String name;
    String job;
    double salary;

    public Woker(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("name: " + this.name + "\njob: " + this.job + "\nsalary: " + this.salary);
    }
}
