package Week5;

import java.util.Scanner;

class Movie_booking {
    String movieName;
    int ticketId;
    int seatId;
    boolean isBooked;

    public Movie_booking(String movieName, int ticketId, int seatId) {

        this.movieName = movieName;
        this.ticketId = ticketId;
        this.seatId = seatId;
        this.isBooked = false;

    }

    void Book_ticket() {

        if (this.isBooked) {
            System.out.println("Seat is already booked.");

        } else {
            this.isBooked = true;
            System.out.println("Your ticket has been booked successfully");
        }

    }

    void Cancel_Ticket() {
        if (!this.isBooked) {
            System.out.println("Seat is not yet booked.");
        } else {
            this.isBooked = false;
            System.out.println("Your booking has been cancelled.");
        }
    }

}

public class movie_booking_sys {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Movie_booking seats[] = {
                new Movie_booking("One piece Red", 1, 101),
                new Movie_booking("One piece Red", 2, 102),
                new Movie_booking("One piece Red", 3, 103),
                new Movie_booking("One piece Red", 4, 104),
                new Movie_booking("One piece Red", 5, 105)

        };

        while (true) {
            System.out.println("\n ------Movie Booking System-------");
            System.out.println("Enter the seat_id to book the seat or 0 to exit: ");
            int inputID = sc.nextInt();

            if (inputID == 0)
                break;

            boolean found = false;

            for (Movie_booking s : seats) {

                if (inputID == s.seatId) {
                    found = true;

                    System.out.println(
                            "Seat has been reseved for " + inputID + " Do you want to confirm or cancel the ticket??");
                    System.out.println(" 1. Confirm Ticket");
                    System.out.println("2. Cancel Ticket");
                    System.out.println("Choose: ");
                    int ch = sc.nextInt();

                    switch (ch) {
                        case 1:
                            s.Book_ticket();
                            break;

                        case 2:

                            s.Cancel_Ticket();
                            break;

                        default:
                            System.out.println("Invalid choice Please choose between 1 or 2");

                    }
                    break;

                }
            }
            if (!found) {
                System.out.println("Invalid Seat ID. This seat does not exist.");
            }

        }
        System.out.println("Thanks for using our system.");
        sc.close();
    }

}
