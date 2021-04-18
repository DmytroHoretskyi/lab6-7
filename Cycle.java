 public class Cycle{
    private int numbersOfGears = 0;
    private double weight = 0;
    private double maxWeight = 0;
    private String producer = "Unknown";
    private String color = "Unknown";
    private String maxSpeed = "Unknown";
    private String type = "Unknown";

    private static int yearOfProduction;

    protected int wheelWidth = 0;
    protected boolean isBasket = false;

    public Cycle(){
        this(0, 0, 0, null, null);
    }

    public Cycle(int numbersOfGears, double weight, double maxWeight, String producer, String color) {
        this(numbersOfGears, weight, maxWeight, producer, color, null);
    }

    public Cycle(int numbersOfGears, double weight, double maxWeight, String producer, String color, String maxSpeed) {
        this(numbersOfGears, weight, maxWeight, producer, color, maxSpeed, null, 0, false);
    }

    public Cycle(int numbersOfGears, double weight, double maxWeight, String producer, String color, String maxSpeed, String type, int wheelWidth, boolean isBasket) {
        this.numbersOfGears = numbersOfGears;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.producer = producer;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.wheelWidth = wheelWidth;
        this.isBasket = isBasket;
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

     public static int getYearOfProduction() {
         return yearOfProduction;
     }

     public static void setYearOfProduction(int yearOfProduction) {
         Cycle.yearOfProduction = yearOfProduction;
     }

     public int getWheelWidth() {
         return wheelWidth;
     }

     public void setWheelWidth(int wheelWidth) {
         this.wheelWidth = wheelWidth;
     }

     public boolean isBasket() {
         return isBasket;
     }

     public void setBasket(boolean basket) {
         isBasket = basket;
     }

     public void resetValues(int numbersOfGears, double weight, double maxWeight, String producer, String color, String maxSpeed, String type, int wheelWidth, boolean isBasket) {
         this.numbersOfGears = numbersOfGears;
         this.weight = weight;
         this.maxWeight = maxWeight;
         this.producer = producer;
         this.color = color;
         this.maxSpeed = maxSpeed;
         this.type = type;
         this.wheelWidth = wheelWidth;
         this.isBasket = isBasket;
     }
 }