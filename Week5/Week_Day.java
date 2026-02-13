package Week5;

import java.util.Scanner;

class weekday {
    public boolean isWeeknd(String day) {
        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            return true;
        } else {
            return false;
        }
    }
}

public class Week_Day {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String d = sc.nextLine();

        weekday wk = new weekday();
        wk.isWeeknd(d);

        if(wk.isWeeknd(d)){ 
            System.out.println( d+ " is a Weekend!");
        }
        else{
            System.out.println( d+ " is not a Weekday!");
        }
        sc.close();

    }

}
