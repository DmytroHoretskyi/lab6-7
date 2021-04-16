public class Cycle{
    private int numbersOfGears = 0;
    private double weight = 0;
    private double maxWeight = 0;
    private String producer = "Unknown";
    private String color = "Unknown";
    private String maxSpeed = "Unknown";
    private String type = "Unknown";

    private static int yearOfProduction;

    public Cycle(int numbersOfGears, double weight, double maxWeight, String producer, String color, String maxSpeed, String type) {
        this.numbersOfGears = numbersOfGears;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.producer = producer;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public Cycle(int numbersOfGears, double weight, double maxWeight, String producer, String color, String maxSpeed) {
        this.numbersOfGears = numbersOfGears;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.producer = producer;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Cycle(int numbersOfGears, double weight, double maxWeight, String producer, String color) {
        this.numbersOfGears = numbersOfGears;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.producer = producer;
        this.color = color;
    }

    public static int getYearOfProduction() {
        return yearOfProduction;
    }
    public int getNumbersOfGears() {
        return numbersOfGears;
    }

    public void setNumbersOfGears(int numbersOfGears) {
        this.numbersOfGears = numbersOfGears;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Cycle{" +
                "numbersOfGears=" + numbersOfGears +
                ", weight=" + weight +
                ", maxWeight=" + maxWeight +
                ", producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}