public class DemoCar {
    public static void main(String[] args) {

        Car car1 = new Car(1991, "Nissan");

        System.out.println("New car created! " + car1.getMake() + ", " + car1.getYearModel());
        System.out.println("The current speed is " + car1.getSpeed());

        // Accelerate
        for (int i = 0; i < 5; i++) {
            car1.accelerate();
            System.out.println("The current speed is " + car1.getSpeed());
        }

        // Brake
        for (int i = 0; i < 5; i++) {
            car1.brake();
            System.out.println("The current speed is " + car1.getSpeed());
        }
    }

}
