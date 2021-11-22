import java.util.Scanner;

public class DemoPayroll {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter hourly rate pay: ");
        double hourlyRatePay = keyboard.nextDouble();
        System.out.println("Enter number of hours worked: ");
        double numOfHoursWork = keyboard.nextDouble();
        keyboard.close();

        Payroll payroll = new Payroll("Oleg", "123456");
        payroll.setHourlyPayRate(hourlyRatePay);
        payroll.setNumOfHoursWorked(numOfHoursWork);

        System.out.println("Employee " + payroll.getEmployeesName() + "\nID number " + payroll.getIdNumber());
        System.out.println("Amount of gross pay earned is: " + payroll.employeesGrossPay());
    }
}
