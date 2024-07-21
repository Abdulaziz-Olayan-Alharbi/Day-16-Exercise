package Day_16_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void choice_limit(int choice) throws Exception{
        if(choice > 5 || choice < 1){
            throw new Exception("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Vehicle> rentals = new ArrayList<>();
        int choice = 0;
        try {
            do {
                System.out.println("Vehicle Rental System");
                System.out.println("1. Rent a Car");
                System.out.println("2. Rent a Bike");
                System.out.println("3. Rent a Truck");
                System.out.println("4. View Rented Vehicles");
                System.out.println("5. Exit");
                System.out.println();
                System.out.println("Enter your choice: ");
                choice = scan.nextInt();
                choice_limit(choice);
                switch (choice) {
                    case 1:
                        System.out.println("Enter Car's Model: ");
                        String model = scan.next();
                        System.out.println("Enter Rental Days: ");
                        int days = scan.nextInt();
                        rentals.add(new Car(model, days));
                        break;
                    case 2:
                        System.out.println("Enter Bike's Brand: ");
                        String brand = scan.next();
                        System.out.println("Enter Rental Hours: ");
                        int hours = scan.nextInt();
                        rentals.add(new Bike(brand, hours));
                        break;
                    case 3:
                        System.out.println("Enter Truck's Type: ");
                        String type = scan.next();
                        System.out.println("Enter Rental Weeks: ");
                        int weeks = scan.nextInt();
                        rentals.add(new Truck(type, weeks));
                        break;
                    case 4:
                        for (Vehicle vehicle : rentals) {
                            vehicle.displayDetails();
                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using The Vehicle Rental System");
                        break;
                    default:
                        break;

                }
            } while (choice != 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
