package Day_16_exercise;

public class Truck implements Vehicle{
    private String type;
    private int weeks;

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        return 500 * this.getWeeks();
    }

    @Override
    public void displayDetails() {
        System.out.println("Type Truck: " + this.getType());
        System.out.println("Weekly Rental Cost: 500");
        System.out.println("Rental Cost: " + this.calculateRentalCost());
        System.out.println("***********************************");
    }
}
