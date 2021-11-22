import java.util.Scanner;

public class DemoMonthDays {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a month from 1 to 12: ");
        int month = keyboard.nextInt();
        System.out.println("Enter a year: ");
        int year = keyboard.nextInt();
        keyboard.close();

        MonthDays mD = new MonthDays(month, year);
        
        System.out.println(mD.getNumberOfDays());
    }
}
