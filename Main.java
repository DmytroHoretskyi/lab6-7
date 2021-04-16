public class Main {
    public static void main(String[] args) {
        Cycle mountainCycle = new Cycle(2, 50.5, 80,
                "Ukraine", "Blue", "450mph", "Mountain");

        Cycle importCycle = new Cycle(5, 20, 50, "German", "Black");
        Cycle simpleCycle = new Cycle(2, 30, 80, "Europe", "Pink");

        System.out.println(mountainCycle);
        System.out.println(importCycle);
        System.out.println(simpleCycle);
    }
}