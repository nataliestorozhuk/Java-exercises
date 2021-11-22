import java.util.Scanner;

public class DemoCircle {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the circle's radius: ");
        double radius = keyboard.nextDouble();
        keyboard.close();

        Circle circle = new Circle(radius);

        System.out.println("The circle's area is: " + circle.getArea());
        System.out.println("The circle's diameter is: " + circle.getDiameter());
        System.out.println("The circle's circumference is: " + circle.getCircumference());
    }
}
