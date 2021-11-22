public class MonthDays {

    private int month;
    private int year;

    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;

    }

    public int getNumberOfDays() {

        switch (month) {
        case 1:
            if (month == 1)
                System.out.println("31 days");
            break;
        case 2:
            if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
                System.out.println("29 days");
            else
                System.out.println("28 days");
            break;
        case 3:
            if (month == 3)
                System.out.println("31 days");
            break;
        case 4:
            if (month == 4)
                System.out.println("30 days");
            break;
        case 5:
            if (month == 5)
                System.out.println("31 days");
            break;
        case 6:
            if (month == 6)
                System.out.println("30 days");
            break;
        case 7:
            if (month == 7)
                System.out.println("31 days");
            break;
        case 8:
            if (month == 8)
                System.out.println("31 days");
            break;
        case 9:
            if (month == 9)
                System.out.println("30 days");
            break;
        case 10:
            if (month == 10)
                System.out.println("31 days");
            break;
        case 11:
            if (month == 11)
                System.out.println("30 days");
            break;
        case 12:
            if (month == 12)
                System.out.println("31 days");
            break;
        }
        return month;
    }
}
