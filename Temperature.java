public class Temperature {

    private double fahrenheit;

    public Temperature(double ftemp) {
        this.fahrenheit = ftemp;
    }

    public void setFahrenheit(double ftemp) {
        this.fahrenheit = ftemp;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double getCelsius() {
        double diya1 = 5.0/9.0;
        double diya2 = fahrenheit -32;
        return diya1 * diya2;
        //return (5 / 9) * (fahrenheit - 32);
    }

    public double getKelvin() {
        return ((5.0 / 9.0) * (fahrenheit - 32)) + 273;
    }
}
