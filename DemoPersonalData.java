public class DemoPersonalData {
    public static void main(String[] args) {

        PersonalData me = new PersonalData("nata", "1821 Beyer ave.", 30, "609-372-3096");
        PersonalData friend1 = new PersonalData("Olya", "12 Oak road", 18, "215-289-1476");
        PersonalData friend2 = new PersonalData("Katya", "1984 Oak road", 28, "215-289-1000");

        System.out.println("My information is: ");
        System.out.println("");
        System.out.println("Name is: " + me.getName() + "\nAddress is: " + me.gerAddress() + "\nAge is: " + me.getAge()
                + "\nPhone Number is: " + me.getPhoneNumber());

        System.out.println("");
        System.out.println("First freind's info is: ");
        System.out.println("");
        System.out.println("Name is: " + friend1.getName() + "\nAddress is: " + friend1.gerAddress() + "\nAge is: "
                + friend1.getAge() + "\nPhone Number is: " + friend1.getPhoneNumber());

        System.out.println("");
        System.out.println("Second friend's info is: ");
        System.out.println("");
        System.out.println("Name is: " + friend2.getName() + "\nAddress is: " + friend2.gerAddress() + "\nAge is: "
                + friend2.getAge() + "\nPhone Number is: " + friend2.getPhoneNumber());
    }

}
