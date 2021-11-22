public class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }

    public void setYearModel(int yearM) {
        yearModel = yearM;
    }

    public void setMake(String m) {
        make = m;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }
    public int  getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 5;
    }
    public void brake() {
        speed -= 5;
        
    }
}
