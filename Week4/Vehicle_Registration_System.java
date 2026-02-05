package Week4;

import java.util.Scanner;

class Vehicle {
    private String ownerName;
    private String vehicleType;
    private String regNo;
    private String vehicleModel;

    public Vehicle(String ownerName, String vehicleType, String regNo, String vehicleModel) {
        this.ownerName = ownerName;
        this.vehicleModel = vehicleModel;

        if (regNo.length() != 10 || !regNo.matches("\\d+")) {
            System.out.println("Invalid Registration Number");
            System.exit(0);

        } else {

            this.regNo = regNo;
        }

        this.vehicleType = vehicleType;
    }

    public void changeOwner(String newOwner) {

        if (newOwner == null || newOwner.trim().isEmpty()) {
            System.out.println("Invalid new owner name.");
            return;
        } else if (newOwner.equals(ownerName)) {
            System.out.println("New owner name is same as the current owner name. No update needed.");
            return;

        } else {
            this.ownerName = newOwner;
            System.out.println("Owner name updated successfully.");
        }
    }

    public void displayInfo() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registation No: " + regNo);
        System.out.println("Vehicle Model: " + vehicleModel);

    }
}

public class Vehicle_Registration_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle_Registration_System v = new Vehicle_Registration_System();

        System.out.println("Enter Onwer Name: ");
        String ownerName = sc.nextLine();

        System.out.println("Enter Vehicle Registration No: ");
        String regNo = sc.nextLine();

        System.out.println("Enter Vehicle Type: ");
        String vehicleType = sc.nextLine();

        System.out.println("Enter Vehicle Model: ");
        String vehicleModel = sc.nextLine();

        Vehicle vehicle = new Vehicle(ownerName, vehicleType, regNo, vehicleModel);
        System.out.println("Vehicle Details: ");
        vehicle.displayInfo();

        System.out.println("Enter New Owner Name: ");
        String newOwner = sc.nextLine();

        vehicle.changeOwner(newOwner);
        System.out.println("Update Vehicle Details: ");
        vehicle.displayInfo();

        vehicle = null;
        System.gc();

        sc.close();

    }

}
