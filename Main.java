public class Main {
    public static void main(String[] args) {
        Cycle mountainCycle = new Cycle();

        Cycle importCycle = new Cycle(5, 20, 50, "German", "Black");
        Cycle simpleCycle = new Cycle(2, 30, 80, "Europe", "Pink", "45");
        Cycle ukrainianCycle = new Cycle(1, 50,150,"Ukraina", "blue", "15", "sport", 24, true);

        System.out.println(mountainCycle);
        System.out.println(importCycle);
        System.out.println(simpleCycle);
        System.out.println(ukrainianCycle);
    }
}