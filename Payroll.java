public class Payroll {

    private String employeesName;
    private String idNumber;
    private double hourlyPayRate;
    private double numOfHoursWorked;

    public Payroll(String employeesName, String idNumber) {
        this.employeesName = employeesName;
        this.idNumber = idNumber;
    }

    public void setEmployeesName(String employeesName) {
        this.employeesName = employeesName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setNumOfHoursWorked(double numOfHoursWorked) {
        this.numOfHoursWorked = numOfHoursWorked;
    }

    public String getEmployeesName() {
        return employeesName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public double getIHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getNumOfHoursWorked() {
        return numOfHoursWorked;
    }

    public double employeesGrossPay() {
        return numOfHoursWorked * hourlyPayRate;
    }
}
