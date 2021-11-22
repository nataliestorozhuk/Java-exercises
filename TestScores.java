public class TestScores {

    private double testScore1;
    private double testScore2;
    private double testScore3;

    public TestScores(double testScore1, double testScore2, double testScore3) {
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }

    public void setTestScore1(double score1) {
        testScore1 = score1;
    }

    public void setTestScore2(double score2) {
        testScore1 = score2;
    }

    public void setTestScore3(double score3) {
        testScore1 = score3;
    }

    public double getTestScore2() {
        return testScore2;
    }

    public double getTestScore1() {
        return testScore1;
    }

    public double getTestScore3() {
        return testScore3;
    }

    public double average() {
        return testScore1 + testScore2 + testScore3;
    }
}
