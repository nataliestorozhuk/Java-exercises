import java.util.Scanner;

public class DemoTestScores {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first test score; ");
        double testScore1 = keyboard.nextDouble();

        System.out.println("Enter your second test score; ");
        double testScore2 = keyboard.nextDouble();

        System.out.println("Enter your third test score; ");
        double testScore3 = keyboard.nextDouble();
        keyboard.close();

        TestScores testScores = new TestScores(testScore1, testScore2, testScore3);

        System.out.println("The average test score is: " + testScores.average());

    }
}
