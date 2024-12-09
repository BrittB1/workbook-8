package CarDealership.src.main.java.com.pluralsight.dealership;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the Sunshine Dealership!");

        showHomeScreen(userInput);

    }

    public static void showHomeScreen(Scanner userInput) {
        boolean homeScreenMenu = true;

        while (homeScreenMenu) {
            System.out.println("""
                ==================================
                          HOME MENU
                ==================================
                Please select an option to get started:
               \s
                F. Find a vehicle
                A. Add a Dealership
                L. List ALL vehicles
                R. Remove a vehicle
                X. Exit
           \s""");
            System.out.print("Enter your choice: ");
            String choice = userInput.nextLine().toUpperCase();

            switch (choice) {
                case "F":
                    findVehicle(userInput);
                case "A":
                    addVehicle(userInput);
                    break;
                case "L":
                    listVehicles();
                    break;
                case "R":
                    removeVehicle(userInput);
                    break;
                case "X":
                    homeScreenMenu = false;
                    System.out.println("Exiting...Thank you and come again :) ");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
private static void findVehicle(Scanner userInput){
        System.out.println("What kind of car are you looking for? ");
}
    private static void addVehicle(Scanner userInput) {
        System.out.print("Enter VIN: ");
        System.out.print("ex; 1234567");
        String vin = userInput.nextLine();

        System.out.print("Enter Make and Model: ");
        String makeModel = userInput.nextLine();

        System.out.print("Enter Type: ");
        String type = userInput.nextLine();

        System.out.print("Enter Year: ");
        int year = userInput.nextInt();

        System.out.print("Enter Color: ");
        userInput.nextLine();
        String color = userInput.nextLine();

        System.out.print("Enter Odometer: ");
        int odometer = userInput.nextInt();

        System.out.print("Enter Price: ");
        double price = userInput.nextDouble();


        System.out.println("Dealership added: " + vin + ", " + makeModel + ", " + type + ", " + year + ", " + color + ", " + odometer + ", $" + price);
    }

    private static void listVehicles() {
        System.out.println("Listing all vehicles...");
    }

    private static void removeVehicle(Scanner userInput) {
        System.out.print("Enter VIN of the vehicle to remove: ");
        String vinToRemove = userInput.nextLine();
        System.out.println("Dealership with VIN " + vinToRemove + " removed.");
    }
}