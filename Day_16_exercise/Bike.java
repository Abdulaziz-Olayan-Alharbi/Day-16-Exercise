package Day_16_exercise;

public class Bike implements Vehicle{
    private String brand;
    private int hours;

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return 10 * this.getHours();
    }

    @Override
    public void displayDetails() {
        System.out.println("Brand Bike: " + this.getBrand());
        System.out.println("Hourly Rental Cost: 10");
        System.out.println("Rental Cost: " + this.calculateRentalCost());
        System.out.println("***********************************");
    }
}
