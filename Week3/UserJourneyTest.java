
package Week3;

import java.util.Scanner;

class UserJourney {
    String name;
    String destination;
    int duration;

    // Constructor
    public UserJourney(String name, String destination, int duration) {
        this.name = name;
        this.destination = destination;
        this.duration = duration;
    }

    public void displayStatus() {
        System.out.println("User: " + name + " (Initial: " + name.charAt(0) + ")");
        System.out.println("Heading to: " + destination);

        if (duration >= 30) {
            System.out.println("Alert: Long journey detected (" + duration + " mins)!");
        } else if (duration < 5) {
            System.out.println("Safe journey! Short trip detected.");
        } else {
            System.out.println("It was a safe journey. Thank you!");
        }
    }
}

public class UserJourneyTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name : ");
        String uname = input.nextLine();

        System.out.println("Enter destination: ");
        String dest = input.nextLine();

        System.out.println("Enter duration time: ");
        int dur = input.nextInt();

        UserJourney trip1 = new UserJourney(uname, dest, dur);

        trip1.displayStatus();

    }
}
